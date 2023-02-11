class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        char[] charArr = str.toCharArray(); 
        int n = charArr.length;

        for(int i = 0; i < n/2; i++){
            if(charArr[i] != charArr[n-i-1]){
                return false;
            }
        }
        return true; 
    }
}