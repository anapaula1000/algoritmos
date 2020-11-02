import java.util.*;
public class DemoTreeSet {
    public static void main(String[] args)
    {
        TreeSet<String> ts1 = new TreeSet<String>();
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
        ts1.add("C");
        System.out.println("TreeSet: " + ts1);
        System.out.println("TreeSet contains A or not:" + ts1.contains("A"));
        System.out.println("TreeSet after removing A:" + ts1.remove("A"));
        System.out.println("TreeSet contains A or not:" + ts1.contains("A"));
        System.out.println("Iterating over TreeSet:");
        Iterator<String> i = ts1.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
