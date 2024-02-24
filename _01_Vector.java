import pojos.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class _01_Vector {
    public static void main(String[] args) {
        /*
        Vector<Integer> v = new Vector<>();
        System.out.println("capacity: " + v.capacity());
        System.out.println("size: " + v.size());
        for(int i=1;i<=16;++i) {
            System.out.println("adding " + i);
            v.add(i);
//            v.add(null);
//            System.out.println(v);
//            System.out.println("capacity: " + v.capacity());
//            System.out.println("size: " + v.size());
        }

        System.out.println(v.get(15));
        System.out.println(v.contains(1));
        // NOTE it will remove element at index 1 not integer 1
        System.out.println(v.remove(1));
        System.out.println(v.remove((Integer) 1));
        // it will search for index 26, because of type widening
        System.out.println(v.remove('z'));


        System.out.println(System.identityHashCode((new Student("k", 1))));
        System.out.println(System.identityHashCode((new Student("k", 1))));

        Vector<Student> v = new Vector<>();
        v.add(new Student("luffy", 1));
        v.add(new Student("zoro", 2));
        v.add(new Student("sanji", 3));
        v.add(new Student("luffy", 1));
        v.add(null);
        System.out.println(v);
        System.out.println(v.contains(new Student("luffy", 1)));
        System.out.println(v.contains(new Student("bb", 1)));
//        System.out.println(v.get(0).getClass().toString().equals("class pojos.Student"));
        v.remove( new Student("bb", 1));
        v.remove( new Student("luffy", 111));
        v.remove(null);
        System.out.println(v);

        Vector<Student> v2 = new Vector<>(v);
        v.add(new Student("asta", 4));
        v.get(1).setName("joyboy"); // this will be reflected in both v and v2
        System.out.println(v);
        System.out.println(v2);

//        Vector<Student> temp = new Vector<>(null); // NLE


        Vector<Integer> v3 = new Vector<>(Arrays.asList(0, 2, 2));
        System.out.println(v3);

        Vector<Student> v4 = new Vector<>(List.of(new Student("1", 1), new Student("2", 2)));
        System.out.println(v4);

        List<List<Integer>> v5 = new Vector<>();
        v5.add(Arrays.asList(1, 2, 3));
        v5.add(Arrays.asList(4, 5, 6));
        v5.add(Arrays.asList(7, 8, 9));
        System.out.println(v5);

        Vector<List<Integer>> v6 = new Vector<>();
        v6.add(Arrays.asList(1, 2, 3));
        v6.add(List.of(1, 2, 3));
        v6.add(List.of(1, 2, 3));
        System.out.println(v6);

        Vector<Integer> v5 = new Vector<>();
        System.out.println(v5.capacity());
        System.out.println(v5.size());

        for(int i=1;i<=30; ++i){
            v5.add(i);
        }
        System.out.println("after adding: " + v5.capacity());
        System.out.println(v5.size());

        for(int i=1;i<=29; ++i){
            v5.remove((Integer) i);
        }
        System.out.println("after removing: " + v5.capacity());
        System.out.println(v5.size());

         */

        Vector<Integer> v5 = new Vector<>();
        v5.ensureCapacity(20);
        System.out.println(v5.capacity());
        System.out.println(v5.size());

        for(int i=1;i<=30; ++i){
            v5.add(i);
        }
        System.out.println("after adding: " + v5.capacity());
        System.out.println(v5.size());

        for(int i=1;i<=29; ++i){
            v5.remove((Integer) i);
        }
        System.out.println("after removing: " + v5.capacity());
        System.out.println(v5.size());

        // TODO test for multi threading
    }
}
