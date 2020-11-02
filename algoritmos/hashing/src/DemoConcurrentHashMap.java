import java.util.concurrent.*;
public class DemoConcurrentHashMap {
    public static void main(String[] args)
    {
        ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();
        m.put(100, "What");
        m.put(101, "Where");
        m.put(102, "When");

        System.out.println(m);
        m.putIfAbsent(101, "Where");
        System.out.println(m);

        m.remove(101, "Where");
        System.out.println(m);

        m.replace(100, "What", "For");
        System.out.println(m);
    }
}
