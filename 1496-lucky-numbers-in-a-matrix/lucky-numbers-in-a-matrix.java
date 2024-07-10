class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        int arr1[]=new int[r];
        int arr2[]=new int[c];
        int index1=0;
        int index2=0;
        
        
        for(int i=0;i<r;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<c;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
            arr1[index1++]=min;

        }
        for(int i=0;i<c;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<r;j++){
                if(matrix[j][i]>max){
                    max=matrix[j][i];
                }
            }
            arr2[index2++]=max;
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr.add(arr1[i]);
                }
            }
        }
        return arr;
    }
}