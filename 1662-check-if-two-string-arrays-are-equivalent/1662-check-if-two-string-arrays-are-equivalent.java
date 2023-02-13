class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String strOne = String.join("",word1);
        String strTwo = String.join("",word2);
        if(strOne.equals(strTwo)){
           return true;
        }
        return false;
    }
}