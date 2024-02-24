
class _11_Sum {
    int x;
    int y;

    public synchronized void sum(int x, int y) {
        var name = Thread.currentThread().getName();
        this.x = x;
        this.y = y;

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sum = this.x + this.y;
        System.out.println(name + " sum = " + sum);
    }
}

class _11_Thread1 extends Thread {
    _11_Sum sum;
    _11_Thread1(_11_Sum sum){
        this.sum = sum;
    }

    @Override
    public void run() {
        sum.sum(10, 20);
    }
}

class _11_Thread2 extends Thread {
    _11_Sum sum;
    _11_Thread2(_11_Sum sum){
        this.sum = sum;
    }

    @Override
    public void run() {
        sum.sum(30, 40);
    }
}



public class _11_Synchronized {
    // TODO practice synchronized block
    public static void main(String[] args) {
        _11_Sum sum = new _11_Sum();
        _11_Thread1 t1 = new _11_Thread1(sum);
        _11_Thread2 t2 = new _11_Thread2(sum);

        t1.start();
        t2.start();
    }
}
