
class _12_Factory {
    private int item;
    private boolean available;
    private String name;

    _12_Factory(String name) {
        this.name = name;
    }

    public synchronized void produce(int item){
        if(available) {
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.item = item;
        var threadName = Thread.currentThread().getName();
        System.out.println(threadName + " - " + name + " is producing " + item);
        this.available = true;
        notify();
    }

    public synchronized void consume(int item){
        if(!available) {
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.item = item;
        var threadName = Thread.currentThread().getName();
        System.out.println(threadName + " - " + name + " is consuming " + item);
        this.available = false;
        notify();
    }
}


class _12_Producer extends Thread {
    _12_Factory factory;

    _12_Producer(_12_Factory factory){
        this.factory = factory;
    }

    @Override
    public void run() {
        for(int i=1; i<=20; ++i)
            factory.produce(i);
    }
}

class _12_Consumer extends Thread {
    _12_Factory factory;

    _12_Consumer(_12_Factory factory){
        this.factory = factory;
    }

    @Override
    public void run() {
        for(int i=1; i<=20; ++i)
            factory.consume(i);
    }
}


public class _12_ProdCos {
    public static void main(String[] args) {
        _12_Factory factory = new _12_Factory("1");
        _12_Producer producer = new _12_Producer(factory);
        _12_Consumer consumer = new _12_Consumer(factory);
        _12_Factory factory2 = new _12_Factory("2");
        _12_Producer producer2 = new _12_Producer(factory2);
        _12_Consumer consumer2 = new _12_Consumer(factory2);

        producer.start();
        consumer.start();
        producer2.start();
        consumer2.start();
    }
}
