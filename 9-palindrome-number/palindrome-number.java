class Solution {
    public boolean isPalindrome(int x) {
        int res=x;
        int ans=0;
        if(x>=0){
        
        while(x!=0){
            int rem=x%10;
            ans=(ans*10)+rem;
            x=x/10;
        }
        if(ans==res)
            return true;
        else
            return false;
        }
        else
        return false;
        
    }
}