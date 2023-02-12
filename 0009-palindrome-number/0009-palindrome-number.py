class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        string = str(x)
        charArr = list(string)
        for i in range(len(charArr)):
            if charArr[i] != charArr[len(charArr) - i - 1]:
                return False
        return True