import java.util.HashSet;

public class TwoSum {
    boolean twoSum(int[] nums, int target) {
       HashSet<Integer> set = new HashSet<>();
       for(int ele : nums){
           int rem=target-ele;
           if(set.contains(rem)){
               return true;
           }
              set.add(ele);
       }
       return false;
    }     
}
