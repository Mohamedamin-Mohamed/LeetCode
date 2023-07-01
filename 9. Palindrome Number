class Solution {
    public boolean isPalindrome(int x) {
        int orig = x;
        int rem = 0;
        int rev = 0;
        while(orig > 0){
            rem = orig % 10;
            rev = (rev * 10) + rem;
            orig = orig / 10;
        }
        
        return rev == x;
    }
}
