package Array;

// 2657. Find the Prefix Common Array of Two Arrays

// Given two 0-indexed integer permutations A and B of length n, return an array C of length n where C[i] is the number of elements in the prefix A[0], A[1], ..., A[i] that are also present in the prefix B[0], B[1], ..., B[i].

public class FindPrefixCommonArrayOfTwoArrays_2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;

        int[] freq = new int[n + 1];
        int[] ans = new int[n];

        int cnt = 0;

        for(int i = 0; i < n; i++) {

            freq[A[i]]++;
            if(freq[A[i]] == 2) cnt++;

            freq[B[i]]++;
            if(freq[B[i]] == 2) cnt++;

            ans[i] = cnt;
        }

        return ans;
    }
}
