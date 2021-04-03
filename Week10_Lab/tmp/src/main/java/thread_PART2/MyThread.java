package thread_PART2;

public class MyThread extends Thread{
    private int identifier;
    private Printer printer;
    public MyThread(int identifier, Printer printer) {
        this.identifier = identifier;
        this.printer = printer;
        printer.print(this);

    }
    public int getIdentifier() { return identifier; }
}
