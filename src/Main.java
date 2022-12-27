import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Object> workers = new LinkedHashSet<>();
        Person mueller = new Person(24538l, "Müller", 35);
        Person stas = new Person(24538l, "Stas", 30);
        workers.add("Petrov");
        workers.add("Ivanov");
        workers.add("Sidorov");
//        System.out.println(workers.clone());
        workers.add("König");
        workers.add("Müller");
        workers.add(mueller);

        Deque<Person> integers = new ArrayDeque<>();
        integers.push(stas);
        integers.push(mueller);
        integers.push(new Person(123456, "John", 23));
//        System.out.println(integers);
        integers.pop();
//        System.out.println(integers);
        integers.peek();
//        System.out.println(integers);
        while (integers.peek() != null) {
            System.out.print(integers.pop());
        }
//        System.out.println(workers);
//        workers.add(stas);
//        System.out.println(workers);
//        System.out.println(stas.hashCode());
//        System.out.println(mueller.hashCode());
//        System.out.println(stas.toString());
//
//        System.out.println(workers);
//        System.out.println(stas.equals(mueller));

        Person andrew = new Person(256789,"Andrew", 45);
        Person victoria = new Person(256789,"Victoria", 39);
        Person kirill = new Person(256789,"Kirill", 12);
        Person anastasia = new Person(256789,"Anastasia", 15);
        Person maria = new Person(256789,"Maria", 68);
        Person marcello = new Person(256790,"Maria", 68);
        Person vera = new Person(256789,"Vera", 69);
        Map<Person, Integer> flat = new TreeMap<>();
        flat.put(andrew, 100000000);
        flat.put(victoria, 80000000);
        flat.put(kirill, 10000000);
        flat.put(anastasia, 10000000);
        flat.put(maria, 1000000);
        flat.put(marcello, 2000000);
        flat.put(new Person(17, "John", 21), 4);
        flat.put(new Person(17, "John", 21), 28);

        flat.put(vera, 1000000);
//        for (Person person : flat.keySet()) {
//            System.out.println(person.getName());
//        }

//        System.out.println(flat);
        //System.out.println(flat.keySet());
//        System.out.println(flat.get(maria));
//        System.out.println(maria.hashCode());
//        flat.put(maria, 5000000);
//        System.out.println(flat.get(maria));
//        System.out.println(flat.get(marcello));
//        System.out.println(marcello.hashCode());

        Map<String, String> map = new LinkedHashMap<>();
        map.put("mother", "Mary");
        map.put("father", "John");
        map.put("uncle", "Smith");
        map.put("grandfather", "Adam");
        map.put("brother", "Sam");


        Map<String, String> newMap = new TreeMap<>(map);
       // System.out.println(newMap);
        newMap.put("sister", "Kelly");
//        System.out.println(newMap);
//        System.out.println(map.containsKey("father"));
//        System.out.println(map.get("father"));
//        for (String s : newMap.keySet()) {
//            if (s.equals("father")) {
//                System.out.println(s + " 1977");
//            }
//        }
    }
}