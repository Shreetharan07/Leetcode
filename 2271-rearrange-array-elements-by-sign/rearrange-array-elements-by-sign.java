class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        int index=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        for(int i=0;i<nums.length/2;i++){
            arr[index++]=pos.get(i);
            arr[index++]=neg.get(i);
        }
        return arr;
    }
}