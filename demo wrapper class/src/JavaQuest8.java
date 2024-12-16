/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax= Integer.MIN_VALUE;


    for(int i= 0; i<nums.length-1;i++){
      if(nums[i]>nums[i+1]){
        int temp= nums[i];
        nums[i]=nums[i+1];
        nums[i+1]= temp;
      }
    }
    int max= nums[(nums.length)-1];
    System.out.println(max);

    for(int i= 0; i<nums.length-1-1;i++){
      if(nums[i]>nums[i+1]){
        int temp= nums[i];
        nums[i]=nums[i+1];
        nums[i+1]= temp;
      }
    }
    secondMax= nums[(nums.length)-1-1];
    System.out.println(secondMax);

    // code here ...
  }
}