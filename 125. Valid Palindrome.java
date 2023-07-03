class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder build = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c))
            build.append(Character.toLowerCase(c));
        }
        s = build.toString();
        int j = s.length() - 1;
        for(int i = 0; i < s.length();i++, j--)
            if(s.charAt(i) != s.charAt(j)) return false;
        
        return true;
    }
}
