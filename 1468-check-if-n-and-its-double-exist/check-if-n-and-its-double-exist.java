class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]*2) return true;
                }
                
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[arr.length-1]==arr[i]*2) return true;
        }
        return false;
    }
}