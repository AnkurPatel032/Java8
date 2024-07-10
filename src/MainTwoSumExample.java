import java.util.HashMap;
import java.util.Map;

public class MainTwoSumExample {

    public static void main(String[] args) {

        System.out.println("Example:1");
        int[] ints={2,7,11,15};
        int target=9;
        int[] pair = findTwoSum(ints, target);
        //for (int[] pair : pairs) {
            System.out.println("Output: [" + pair[0] + ", " + pair[1] + "]");
        //}
        System.out.println("Example:2");
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = findTwoSum(nums2, target2);
        System.out.println("Output: [" + result2[0] + "," + result2[1] + "]");

        System.out.println("Example:3");
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = findTwoSum(nums3, target3);
        System.out.println("Output: [" + result3[0] + "," + result3[1] + "]");
    }

    private static int[] findTwoSum(int[] input, int target) {
        Map<Integer,Integer> opMap=new HashMap();
        for (int i=0;i<input.length;i++) {  //2,7,11,15
            int complement=target-input[i];//9-2=7  | 9-7 =2 | 9-11=-2 |9-15 =-6
            if(opMap.containsKey(complement)){
               return new int[] {opMap.get(complement),i};
            }
            opMap.put(input[i],i);//{[2,0],[]
            }
        throw new IllegalArgumentException("No two sum solution");
    }
//
//    Example 2:
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]


}
