import java.util.HashSet;

public class FindDistinctElements {
    public int distinct(int arr[]){
       HashSet<Integer> set = new HashSet<>();
       for(int ele :arr){
         set.add(ele);
       }
       return set.size();
    }
}
