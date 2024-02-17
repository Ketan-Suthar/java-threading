import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;


class _02_College {
    List<Integer> students;
    _02_College() {
        students = new ArrayList<>();
    }

//    synchronized
    void addStudent(int i) {
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        students.add(i);
//        synchronized (this){
//            students.add(i);
//        }
    }

    void printStudents() {
        var name = Thread.currentThread().getName();
        System.out.println(name + " Students size: \n" + students.size());
        System.out.println("\nall students: " + students);
    }
}


class _02_Thread1 extends Thread {
    _02_College college;
    int stat, end;

    _02_Thread1(_02_College college, int s, int e) {
        this.college = college;
        stat = s;
        end = e;
    }

    @Override
    public void run() {
        for(int i=stat; i<=end; ++i)
            college.addStudent(i);
    }
}




public class _02_ArrayList {
    public static void main(String[] args) throws InterruptedException {
        /*
        System.out.println(Objects.toString(null));

        ArrayList<Integer> a = new ArrayList<>();
        for(int i=1;i<=10;++i){
            a.add(i);
            a.add(i);
        }

        System.out.println(a);
//        a.removeAll(List.of(1, 3, 5, 7, 9));
        a.removeIf(integer -> integer%2 == 1);
        System.out.println(a);

         */

        _02_College college = new _02_College();
        _02_Thread1 t1 = new _02_Thread1(college, 1, 100);
        _02_Thread1 t2 = new _02_Thread1(college, 101, 200);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        college.printStudents();
    }
}
