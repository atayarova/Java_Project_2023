package collection1.map;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        List<Integer> duplicate = new ArrayList<>();
        duplicate.add(5);
        duplicate.add(4);
        duplicate.add(4);
        duplicate.add(8);
        duplicate.add(4);
        duplicate.add(8);
        duplicate.add(8);

        List<Integer> noDuplicate = new ArrayList<>();
        // 5


        //           8
        for (Integer number : duplicate) {
            //      (5, 4, 8)         5,4,4,8,4,8
            if (!noDuplicate.contains(number)) {
                //              5,4,[!4],8,[!4],[!8] ------- 5,4,8
//                                     no     no

                noDuplicate.add(number);
            }
        }
        System.out.println(duplicate);
        System.out.println(noDuplicate);

        // Unpredictable order
        HashMap<String, Integer> mobOperators = new HashMap<>();
        mobOperators.put("MegaCom", 555);
        mobOperators.put("Belline", 777);
        mobOperators.put("O!", 777);
        mobOperators.put("MegaCom", 559);
        System.out.println(mobOperators);


//              012345
        String color = "Yellow";

// Predictable order
        Map<Boolean, String> status = new LinkedHashMap<>();
        status.put(false, "NO");
        status.put(true, "YES");
        System.out.println(status);

        TreeMap<Integer, String> tashers = new TreeMap<>();
        tashers.put(2, "Aibike");
        tashers.put(1,"Eliza");
        tashers.put(3, "Elmira");
        System.out.println(tashers);

// Map -> no collection
// <key, value> --> any data types
// Key instead of Index
// the key should be unique
// the value can duplicate

        System.out.println(tashers.get(3));
        tashers.remove(1);

        System.out.println(tashers.keySet());
        System.out.println(tashers.values());



// 01, 02 , 03 , 04, 05, 06, 07, 08, 09, 10
    }
}
