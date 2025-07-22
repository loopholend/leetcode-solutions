class Solution {
    public int romanToInt(String s) {
        // Convert the input Roman numeral string into a character array for easy iteration
        char[] st = s.toCharArray();
        // Variable to store the total integer value
        int sum = 0;

        // Loop through each character in the array
        for (int i = 0; i < st.length; i++) {
            switch (st[i]) {
                case 'I':
                    // Check for special cases IV (4) and IX (9)
                    if (i < st.length - 1 && (st[i + 1] == 'V' || st[i + 1] == 'X')) {
                        if (st[i + 1] == 'V')
                            sum += 4;  // IV = 4
                        else
                            sum += 9;  // IX = 9
                        i += 1; // Skip the next character as it's part of this number
                    } else {
                        sum += 1; // Standard value of I
                    }
                    break;

                case 'V':
                    sum += 5; // Standard value of V
                    break;

                case 'X':
                    // Check for special cases XL (40) and XC (90)
                    if (i < st.length - 1 && (st[i + 1] == 'L' || st[i + 1] == 'C')) {
                        if (st[i + 1] == 'L')
                            sum += 40; // XL = 40
                        else
                            sum += 90; // XC = 90
                        i += 1; // Skip the next character as it's part of this number
                    } else {
                        sum += 10; // Standard value of X
                    }
                    break;

                case 'L':
                    sum += 50; // Standard value of L
                    break;

                case 'C':
                    // Check for special cases CD (400) and CM (900)
                    if (i < st.length - 1 && (st[i + 1] == 'D' || st[i + 1] == 'M')) {
                        if (st[i + 1] == 'D')
                            sum += 400; // CD = 400
                        else
                            sum += 900; // CM = 900
                        i += 1; // Skip the next character as it's part of this number
                    } else {
                        sum += 100; // Standard value of C
                    }
                    break;

                case 'D':
                    sum += 500; // Standard value of D
                    break;

                case 'M':
                    sum += 1000; // Standard value of M
                    break;
            }
        }
        // Return the calculated integer value
        return sum;
    }
}
/*
## Explanation

- The function converts a Roman numeral to an integer.
- It loops through each character and checks for "subtractive" combinations like IV (4), IX (9), XL (40), etc.
    - For characters 'I', 'X', and 'C', it sometimes needs to look ahead to the next character to identify these special combinations.
    - If a special case is found, the sum is updated accordingly, and the `i` index is incremented an extra time to skip the next character (already processed).
- Standard values are added for other Roman numerals.
- The function finally returns the computed sum.

Let me know if you'd like further explanation or help with another solution!
*/
