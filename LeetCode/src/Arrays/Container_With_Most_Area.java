package Arrays;

public class Container_With_Most_Area {

    public int maxArea(int[] height) {
        int aptr= 0;
        int bptr= height.length-1;
        int MaxVal=0;
        while (bptr>aptr){
            if (height[aptr]<height[bptr]){
                MaxVal=Math.max(MaxVal,height[aptr]*(bptr-aptr));
                aptr+=1;
            }else{
                MaxVal=Math.max(MaxVal, height[bptr]*(bptr-aptr));
                bptr-=1;
            }
        }return MaxVal;
    }
}


/*   https://leetcode.com/problems/container-with-most-water/
 *   Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
 *   n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,
 *    which together with x-axis forms a container, such that the container contains the most water.
 *  
 * This is being solved using 2 pointer method , 
 * Explanation ::
 * 
 * position  of pointer b will always be greater than pointer a, hence (b-a)
 * next we have to take minimum of the heights as that will be maximum capacity 
 * if this maxvalue is greater than origanal max it will be replaced 
 * 
 * 
 * 
 * */
 