import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Object> workers = new LinkedHashSet<>();
        Person mueller = new Person(24538l, "Müller", 35);
        Person stas = new Person(24538l, "Müller", 30);
        workers.add("Petrov");
        workers.add("Ivanov");
        workers.add("Sidorov");
        workers.add("Müller");
        workers.add(mueller);
        System.out.println(stas.hashCode());
        System.out.println(mueller.hashCode());
        System.out.println(stas.toString());

        System.out.println(workers);
        System.out.println(stas.equals(mueller));
    }
}