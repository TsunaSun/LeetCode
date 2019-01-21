class Solution {
    public int[] sortArrayByParity(int[] A) {
        int odd_num = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] % 2 == 0){
                odd_num++;
            }
        }
        int tmp = 0;
        if (odd_num != 0){
        for (int i = A.length - 1; i >= odd_num - 1; i--){
            if (A[i] % 2 == 0){
                for (int j = 0; j <= odd_num - 1; j++){
                    if (A[j] % 2 != 0){
                        tmp = A[j];
                        A[j] =A[i];
                        A[i] = tmp;
                    }
                }
            }
        }
        }
        return A;
    }
}

//时间复杂度为O(n)的
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int start = 0, end = A.length - 1;
        while (start < end){
            while (start < end && A[start] % 2 != 0){
                int tmp = A[start];
                A[start] = A[end];
                A[end--] = tmp;
            }
            start++;
        }
        return A;
    }
}