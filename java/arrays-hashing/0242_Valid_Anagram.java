class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (int i, i < s.length(), i++) {
            char c1 = s.charAt();
            char c2 = t.chatAt();

            countS.put(c1, countS.getOrDefault(c1, 0) + 1);
            countT.put(c1, countT.getOrDefault(c2, 0) + 1);
        }
        return countS.equals(countT);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "anagram";
        String t = "gramana"; 
        System.out.println(sol.isAnagram(s,t));
    }
}
