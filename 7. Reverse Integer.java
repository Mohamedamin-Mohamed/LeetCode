class Solution {
    public int reverse(int x) {
        int sign = 1;
        if(x < 0){
        x= Math.abs(x);
        sign = -1;
        }
        
        long rev = 0; 
        int rem = 0;
        while(x != 0){
            rem = x % 10;
            rev = rev * 10 + rem;
            x/=10;
        }
        return (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) ? 0 : (int)(rev * sign);
    }
}
