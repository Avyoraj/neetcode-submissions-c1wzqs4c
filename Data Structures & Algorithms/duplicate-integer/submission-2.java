class Solution {
    public boolean hasDuplicate(int[] nums) {
        

        Set <Integer> set1 = new HashSet<>() ;

        Set <Integer> resultSet  = new HashSet();

        for ( int num : nums) {
            set1.add(num);
        }

        if( nums.length > set1.size()) {
            return true;
        }
        else {
            return false ;
        }
    }
}