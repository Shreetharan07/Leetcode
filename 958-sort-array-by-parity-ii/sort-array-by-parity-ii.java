class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int[] even=new int[n/2];
        int[] odd=new int[n/2];
        int e=0;
        int o=0;
        int e1=0;
        int o1=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                even[e++]=nums[i];
            }
            else{
                odd[o++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[index++]=even[e1++];
            }
            else{
                arr[index++]=odd[o1++];
            }
        }
        return arr;
    }
}