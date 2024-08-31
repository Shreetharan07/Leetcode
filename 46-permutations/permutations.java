class Solution {
    public static void per(int[] nums,List<List<Integer>> li,List<Integer> d,boolean[] fre){
        if(d.size()==nums.length){
            li.add(new ArrayList<>(d));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!fre[i]){
                fre[i]=true;
                d.add(nums[i]);
                per(nums,li,d,fre);
                d.remove(d.size()-1);
                fre[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        ArrayList<Integer> d=new ArrayList<>();
        boolean[] fre=new boolean[nums.length];
        per(nums,li,d,fre);
        return li;
    }
}