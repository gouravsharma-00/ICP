// 3. Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        if(s.isBlank()) {
            return 1;
        }
        Map<Character, Integer> map = new HashMap<>();

        int len = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            while( left < i && map.get(s.charAt(i)) > 1 ) {
                int val = map.get(s.charAt(left))-1;
                map.put( s.charAt(left), val);
                left++;
            }

            len = Math.max(len, i - left + 1);
        }

        return len;
    }
}