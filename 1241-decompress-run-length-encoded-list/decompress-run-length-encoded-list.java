class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i=i+2){
            for(int j=0;j<nums[i];j++){
                arr.add(nums[i+1]);
            }
        }
        int[] arr1=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            arr1[i]=arr.get(i);
        }
        return arr1;
    }
}