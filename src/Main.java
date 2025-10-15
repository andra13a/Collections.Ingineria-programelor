import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<Object> listaMixta = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        Set<String> set2 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();


        list.add("Andra");
        list.add("Nico");
        list.add("Diana");

        list2.add("Matei");
        list2.add("Edi");
        list2.add("Marius");

        listaMixta.add("Andra");
        listaMixta.add(25);
        listaMixta.add(3.14);

        set.add(10);
        set.add(25);
        set.add(30);

        set2.add("Ana");
        set2.add("Bogdan");
        set2.add("Carmen");

        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);

        System.out.println(list);
        System.out.println(list2);
        System.out.println(listaMixta);
        System.out.println(set);
        System.out.println(set2);
        System.out.println(hashMap);
        System.out.println(hashMap.hashCode());
    }
}
