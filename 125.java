class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) 
           return true;
        int left = 0;
        int right = s.length() - 1;
        
        //as per the given question statement
        //ignore case
        //ignore spaces
        //compare characters that are only alphanumeric
        while (left <= right) {
            char lc = s.charAt(left);
            char rc = s.charAt(right);
            
            if (!Character.isLetterOrDigit(lc)) left++;
            else if (!Character.isLetterOrDigit(rc)) right--;
            else {
                if (Character.toLowerCase(lc) != Character.toLowerCase(rc)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}