import java.util.*;
public class DemoLinkedHashMap {
    public static void main(String a[])
    {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();

        lhm.put("one", "U2");
        lhm.put("two", "Queen");
        lhm.put("three", "Pearl Jam");
        lhm.put("four", "Linkin Park");

        System.out.println(lhm);

        System.out.println("Getting value for key 'one': " + lhm.get("one"));
        System.out.println("Size of the map: " + lhm.size());
        System.out.println("Is map empty? " + lhm.isEmpty());
        System.out.println("Contains key 'two'? "+ lhm.containsKey("two"));
        System.out.println("Contains value 'Pearl"+" Jam'? "+ lhm.containsValue("Pearl"+" Jam"));
        System.out.println("delete element 'one': " + lhm.remove("one"));
        System.out.println(lhm);
    }
}
