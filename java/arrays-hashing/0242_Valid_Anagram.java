class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (int i = 0, i < s.length(), i++) {
            char c1 = s.charAt(i);
            char c2 = t.chatAt(i);

            countS.put(c1, countS.getOrDefault(c1, 0) + 1);
            countT.put(c2, countT.getOrDefault(c2, 0) + 1);
        }
        return countS.equals(countT);
    }
}
// O(n), O(1)

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "anagram";
        String t = "gramana"; 
        System.out.println(sol.isAnagram(s,t));
    }
}

