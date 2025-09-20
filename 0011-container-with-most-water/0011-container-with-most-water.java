class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int area=0;
        while(left<right){
                int length=Math.min(height[left],height[right]);
                int width=right-left;
                 area=Math.max(area,length*width);
                if(height[left]<=height[right]){
                    left++;

                }else{
                    right--;
                }
        }
        return area;
        
    }
}