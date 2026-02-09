class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ar=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(map.containsKey(target-num)){
            ar[0]=map.get(target-num);
            ar[1]=i;
            return ar;
        }
            map.put(num,i);
        }
        return ar;
    }
}