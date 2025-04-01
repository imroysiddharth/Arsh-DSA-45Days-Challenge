public class ContainerWithMostWater {
    public static  int maxArea(int[] height) {
        int area = 0 ; 
        int i = 0 ; 
        int j = height.length-1 ;

        while(i<j){
            int diff = j-i ; 
            int h = Math.min(height[i],height[j]);
            int tempArea = diff*h ;
            area = Math.max(tempArea , area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
          
        }
        return area ;
    }

    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int area = maxArea(height);
        System.out.println(area);
    }
}
