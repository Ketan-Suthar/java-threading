import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _03_LinkedList {
    public static void main(String[] args) {
        // TODO test for multi threading
        List<Integer> a = new LinkedList<>();
        for(int i=1;i<=10;++i){
            a.add(i);
            a.add(i);
        }

        System.out.println(a);
//        a.removeAll(List.of(1, 3, 5, 7, 9));
        a.removeIf(integer -> integer%2 == 1);
        System.out.println(a);

    }
}
