import java.util.HashMap;

public class FirstUniqueCharacterInaStringMapSolution {
    public static void main(String[] args) {
        String input = "leetcode";
//        String input = "aadadaad";

        int i = firstUniqChar(input);
        System.out.println(i);
    }

    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
