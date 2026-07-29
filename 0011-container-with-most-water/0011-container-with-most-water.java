class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
       int maxa=0;
        while(l<r){
           int h=Math.min(height[l],height[r]);
         int   w=r-l;
           int area=h*w;
            maxa=Math.max(maxa,area);
            if(height[l]<height[r])
            l++;
            else
            r--;

        }
        return maxa;
    }
}