
class Buffer {
    private int data;
    private boolean empty = true;

    public synchronized void produce(int value) {
        try {
            while (!empty) {
                wait();
            }
            data = value;
            empty = false;
            System.out.println("Produced: " + value);
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized int consume() {
        int value = 0;
        try {
            while (empty) {
                wait();
            }
            value = data;
            empty = true;
            System.out.println("Consumed: " + value);
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int value = buffer.consume();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
