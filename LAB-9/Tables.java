class MultiplicationTableThread extends Thread {
    private int number;

    public MultiplicationTableThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Multiplication Table for " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class Tables {
    public static void main(String[] args) {
        MultiplicationTableThread table5Thread = new MultiplicationTableThread(5);
        MultiplicationTableThread table7Thread = new MultiplicationTableThread(7);

        table5Thread.start();
        table7Thread.start();
    }
}
