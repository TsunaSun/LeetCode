class Solution {
    public int repeatedNTimes(int[] A) {
        int cnt[] = new int[10005];
        for (int i = 0; i <10005; i++){
            cnt[i] = 0;
        }
        for (int i = 0; i < A.length; i++){
            cnt[A[i]]++;
            if(cnt[A[i]]==2){
                return A[i];
            }
        }
        return 0;
    }
}
//ÓÃmapËÆºõÖ»Òª7ms
class Solution {
    public int repeatedNTimes(int[] A) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        
        for(int i = 0; i < A.length; i++){
            if(map.containsKey(A[i])){
                result = A[i];
                break;
            }
            map.put(A[i], 1);
        }
        return result;
    }
}