 
// 78. SubSets

// Given an integer array nums of unique elements, return all possible subsets (the power set).
// The solution set must not contain duplicate subsets. Return the solution in any order. 


class SubSets_78 {
    public List<List<Integer>> subsets(int[] arr) {
        
        int n=arr.length;
        int m=(1<<n);

        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i>>j)%2 == 1) a.add(arr[j]);
            }
            ans.add(a);

        }

        return ans;
    }
}