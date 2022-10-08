
//21CE097 Manav Patel
//Write a program that counts the occurrences of words in a text and displays the words and their occurrences in alphabetical order of the words. Using Map and Set Classes.
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class prac2_7 {

    public static void main(String[] args) {
        String text = "Good  morning.  Have  a  good  night.  " + "Have  a good  Day.  Have  fun!";
        System.out.println(text);
        Map<String, Integer> map = new TreeMap<>();
        String[] words = text.split("[  \n\t\r.,;:!?()]");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "--> " + entry.getValue());
        }
        System.out.println(map);

    }

}
