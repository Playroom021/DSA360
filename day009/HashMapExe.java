import java.util.HashMap;

public class HashMapExe {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(10, 1);
        map.put(20, 2);
        map.put(30, 3);

        System.out.println("Search	map.get(key)	O(1)")
        System.out.println(map.get(30)); // 2

        System.out.println("Check key	map.containsKey(key)	O(1)")
        System.out.println(map.containsKey(10)); // true
      
        System.out.println("Remove	map.remove(key)	O(1)");
      
        System.out.println("Insert	map.put(key, value)	O(1)");
      
    }
}