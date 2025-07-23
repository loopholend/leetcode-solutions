class Solution 
{
    // Function to find the longest common prefix among a list of strings
    public String longestCommonPrefix(String[] strs) 
    {
        // If the input array is empty, return an empty string
        if (strs.length == 0)
            return "";

        // Start with the first string in the array as the initial prefix
        String s = strs[0];
        int i = 0;

        // Iterate over each string in the array, starting from the second one
        while (++i < strs.length)
            // While the current string does not start with the current prefix
            while (strs[i].indexOf(s) != 0)
            {
                // Shorten the prefix by removing one character from the end
                s = s.substring(0, s.length() - 1);
                // If the prefix is already empty, there is no common prefix
                if (s.isEmpty()) return "";
            }

        // Return the longest common prefix after checking all strings
        return s;    
    }
}
/*
Explanation:

The function returns the longest common prefix for an array of strings.

It starts by assuming the whole first string is the prefix (s).

For each remaining string, it checks if it starts with the current prefix (strs[i].indexOf(s) != 0).

If not, it removes the last character from the prefix and checks again.

This process continues until the prefix matches the start of the current string, or is reduced to an empty string.

If an empty prefix is found, it returns "" immediately (no common prefix exists).

Otherwise, after all strings are checked, the final prefix is returned.
*/
