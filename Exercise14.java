import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise14 {

    /*
Write a method intersect that accepts two maps whose keys are strings and whose values are integers as parameters
and returns a new map containing only the key/value pairs that exist in both of the parameter maps. In order for a
key/value pair to be included in your result, not only do both maps need to contain a mapping for that key, but they need
to map it to the same value. For example, if the two maps passed are {Janet=87, Logan=62, Whitaker=46,
Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95} and {Logan=62, Kim=52, Whitaker=52,
Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87}, your method would return the following new map
(the order of the key/value pairs does not matter): {Logan=62, Stefanie=80, Jeff=88, Kim=52}.
     */

    public static void main(String[] args)
    {
        Map map1 = new HashMap();

        map1.put("Janet",87);
        map1.put("Logan",62);
        map1.put("Whitaker",46);
        map1.put("Alyssa",100);
        map1.put("Stephanie",80);
        map1.put("Jeff",88);
        map1.put("Kim",52);
        map1.put("Sylvia",95);

        System.out.println("Map 1: " + map1+ "\n");

        Map map2 = new HashMap();

        map2.put("Logan",62);
        map2.put("Kim",52);
        map2.put("Whitaker",52);
        map2.put("Jeff",88);
        map2.put("Stephanie",80);
        map2.put("Brian",60);
        map2.put("Lisa",83);
        map2.put("Sylvia",87);

        System.out.println("Map 2: " + map2 + "\n");

        Map sammensat = intersect(map1,map2);

        System.out.println("Begge maps i et: ");
        System.out.println(sammensat);
    }

    public static Map intersect (Map map1, Map map2)
    {

        // Laver 2 nøgler ud fra mine maps
        Set nøgle1 = map1.keySet();
        Set nøgle2 = map2.keySet();

        Set metodeSet = new HashSet(nøgle1);

        metodeSet.retainAll(nøgle2);

        // nu laver jeg et map som holder på parene

        Map metodeMap = new HashMap();

        // Nu laver jeg er foreach loop som kører navnene igennem

        for (Object navn :
                metodeSet) {
            int value1 = (int) map1.get(navn);
            int value2 = (int) map1.get(navn);

            // Hvis value1 er lig med value2 gør følgende
            if (value1 == value2)
            {
                metodeMap.put(navn,value1);
            }
        }
        return metodeMap;
    }
}
