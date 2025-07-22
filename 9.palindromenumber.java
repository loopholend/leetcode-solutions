class Solution {
    public boolean isPalindrome(int x) {
        // Variable to store the reversed number
        int s = 0;
        // Variable to store the last digit during each iteration
        int a;
        // Keep a copy of the original number
        int n = x;

        // Reverse the digits of x
        while (x != 0) {
            a = x % 10;       // Extract the last digit
            s = s * 10 + a;   // Append the digit to the reversed number
            x = x / 10;       // Remove the last digit from x
        }

        // Check if the reversed number is the same as the original and is non-negative
        if (n == s && n >= 0) {
            return true;      // It's a palindrome
        } else {
            return false;     // Not a palindrome
        }
    }
}
/*
Explanation:

The method checks if the integer x is a palindrome (it reads the same forwards and backwards).

It reverses the digits of x by extracting the last digit and building up a reversed number.

Finally, it compares the original number (n) with the reversed number (s).

The extra check n >= 0 ensures negative numbers are never considered palindromes, since palindromes can't have a negative sign at the end.

Returns true if it is a palindrome, otherwise false.

Let me know if you'd like comments on another solution or further explanation!
*/
