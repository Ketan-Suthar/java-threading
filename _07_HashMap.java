import pojos.Student;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        HashMap<Object, Object> m = new HashMap<>();
        m.put('a', 1);
        m.put("a", 1);

        var k = new Student("k", 1);
        var l = new Student("l", 1);
        var l2 = new Student("l", 1);
        var l3 = new Student("l", 1);
        m.put(k, 1);
        m.put(l, 2);
        m.put(l2, 2);
        m.put(l3, 3);
        m.put(l3, 4);
        System.out.println(m);

        System.out.println("hello".hashCode());
        System.out.println("hello".hashCode());
        System.out.println(new String("hello").hashCode());
        System.out.println(new String("hello").hashCode());
        System.out.println(new String("Hello").hashCode());
    }
}
