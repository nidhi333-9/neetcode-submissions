class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        for(Integer key: map.keySet()){
            if(map.get(key) > 1){
                return true;
            }
        }
        return false;
    }
}