class Solution {
    public int lengthOfLastWord(String s) {
        String[] arrOfStr =s.split(" ");
        String lastWord =  arrOfStr[arrOfStr.length-1]; 
        return lastWord.length();
    }
}