import java.util.Arrays;
class ForEach1
{
   public static void main(String args[])
   {
      int[] nums = {5,1,7,44,2,11,134,5};
      int max = Integer.MIN_VALUE;
      for(int i:nums){
        if(i>max){
          max = i;
        }
      }
      System.out.println(max);
   }
}  
