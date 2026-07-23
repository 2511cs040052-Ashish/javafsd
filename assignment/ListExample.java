import java.util.ArrayList;
public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // add()
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");
        System.out.println("After add(): " + list);
        // add(index, element)
        list.add(1, "HTML");
        System.out.println("After add(index): " + list);
        // get()
        System.out.println("Element at index 2: " + list.get(2));
        // set()
        list.set(0, "Java Programming");
        System.out.println("After set(): " + list);
        // contains()
        System.out.println("Contains Python? " + list.contains("Python"));
        // indexOf()
        System.out.println("Index of Java: " + list.indexOf("Java"));
        // remove(index)
        list.remove(2);
        System.out.println("After remove(index): " + list);
        // remove(object)
        list.remove("Java");
        System.out.println("After remove(object): " + list);
        // size()
        System.out.println("Size: " + list.size());
        // isEmpty()
        System.out.println("Is Empty? " + list.isEmpty());
        // clear()
        list.clear();
        System.out.println("After clear(): " + list);
    }
}