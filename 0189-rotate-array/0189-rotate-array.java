class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==0)return;
        k=k%n;        //***trick pointer ***
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    private static void reverse(int[]arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}