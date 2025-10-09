class Solution {
    public int[] productExceptSelf(int[] nums) {
        int c=0;
        int p=1;
        int n=nums.length;
         
         for(int i=0;i<n;i++){
            if(nums[i]==0){
                c++;
            }
            else{
                p=nums[i]*p;
            }
         }
         for(int i=0;i<n;i++){
            if(c>=2){
                nums[i]=0;
            }
            else{
                if(c==1){
                    if(nums[i]!=0){
                        nums[i]=0;
                    }
                    else{
                        nums[i]=p;
                    }
                    
               
                }
                else{
                nums[i]=p/nums[i];
            }

            }
          
         }
         return nums;
    }
}