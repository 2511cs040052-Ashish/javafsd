import java.util.HashSet;
public class SetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        // add()
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");
        System.out.println("After add(): " + set);
        // contains()
        System.out.println("Contains Banana? " + set.contains("Banana"));
        // remove()
        set.remove("Orange");
        System.out.println("After remove(): " + set);
        // size()
        System.out.println("Size: " + set.size());
        // isEmpty()
        System.out.println("Is Empty? " + set.isEmpty());
        // clear()
        set.clear();
        System.out.println("After clear(): " + set);
    }
}