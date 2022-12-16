import java.util.*;

public class Example {

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.push(1);
        queue.push(8);
        queue.push(3);

        Set<Integer> set = new TreeSet<>(queue); // 1
        System.out.println(set);
        Set<Integer> set1 = new LinkedHashSet<>(queue);

        System.out.println(set1);

        Set<String> set2 = new HashSet<>();

        set2.add("Hello");
        set2.add("Hello again");
        set2.add("Hello1");

        System.out.println(set2);
    }
}
