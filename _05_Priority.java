
class _05_MyThread extends Thread {
    _05_MyThread() {}
    _05_MyThread(String name) { super(name);}

    @Override
    public void run() {
        for(int i=0; i<=10; ++i){
            System.out.println(getName() + " - " + i);
        }
    }
}


public class _05_Priority {
    public static void main(String[] args) {
        _05_MyThread mt = new _05_MyThread("mt");
        _05_MyThread mt2 = new _05_MyThread("mt2");
        mt2.setPriority(10);
        System.out.println(mt.getName() + " priority: " + mt.getPriority());
        System.out.println(mt2.getName() + " priority: " + mt2.getPriority());

        mt.start();
        mt2.start();
        // We can change name and priority after start also
        mt2.setPriority(9);
        mt2.setName("newName");
    }
}
