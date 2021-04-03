package thread_PART2;

public class Printer {
    private int index = 1;
    private boolean inOrder = false;
    private MyThread thread;

    public synchronized void print(MyThread thread){

        //Guarded
        while(index != thread.getIdentifier()){
            System.out.println("HERE");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if(thread.getIdentifier() == index) {
            System.out.println(thread.getIdentifier());
            notifyAll();
            index++;
        }
    }
}
