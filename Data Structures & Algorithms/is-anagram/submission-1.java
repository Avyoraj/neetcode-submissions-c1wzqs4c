class Solution {
    public boolean isAnagram(String s, String t) {


    Map<Character, Integer> map = new HashMap<>();

        for(char i : s.toCharArray()) {
           map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for( char i : t.toCharArray()) {
            if(!map.containsKey(i)) return false ;

            int count = map.get(i) - 1;

            if(count == 0) {
                map.remove(i);
            }else {
                map.put(i,count);
            }
        }

        return map.isEmpty();

    }
}
