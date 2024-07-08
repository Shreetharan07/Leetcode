class Solution {
    static int search(char arr1[],char temp){
        int l=arr1.length;
        for(int i=0;i<l;i++){
            if(arr1[i]==temp)
                return i;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int len=s.length();
        char[] arr1={'I','V','X','L','C','D','M'};
            int[]  arr2={1,5,10,50,100,500,1000};
            int sum=0;
            int i=0;
            while(i<len-1){
            	//System.out.println("length"+len);
            	//System.out.println("i value"+i);
            	int a=i;
            	int b=i+1;
                if(s.charAt(a)=='I' && s.charAt(b)=='V'){
                    sum=sum+4;
                    i=i+2;
                }
                else if(s.charAt(a)=='I' && s.charAt(b)=='X'){
                    sum=sum+9;
                    i=i+2;
                }    
                else if(s.charAt(a)=='X' && s.charAt(b)=='L'){
                    sum=sum+40;
                    i=i+2;
                }
                else if(s.charAt(a)=='X' && s.charAt(b)=='C'){
                    sum=sum+90;
                    i=i+2;
                }   
                else if(s.charAt(a)=='C' && s.charAt(b)=='D'){
                    sum=sum+400;
                    i=i+2;
                }   
                else if(s.charAt(a)=='C' && s.charAt(b)=='M'){
                    sum=sum+900;
                    i=i+2;
                }
                else{
                    char temp=s.charAt(a);
                    int index=search(arr1,temp);
                    int result=arr2[index];
                    //System.out.println("result = "+result);
                    sum=sum+result;
                    i++;   
                }   
            }
            if (i == len - 1) {
            char temp = s.charAt(len - 1);
            int index = search(arr1, temp);
            int result = arr2[index];
            sum = sum + result;
        }
            return sum;
    }
    
}