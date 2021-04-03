package thread_PART2;

public class Part2Test {
    public static void main(String args[]) throws InterruptedException {
        Printer p = new Printer();
        for(int i = 1; i<=20; i++) {
            Thread t1 = new MyThread(i,p);
            t1.start();

        }
    }
}
