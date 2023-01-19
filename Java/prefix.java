class prefix {
    public String longestCommonPrefix(String[] strs) {
        // check if the strs array is null or empty
        if (strs == null || strs.length == 0) {
            // if it is, return an empty string
            return "";
        }
        // check if the first element of the array is null
        if (strs[0] == null) {
            // if it is, return an empty string
            return "";
        }
        // initialize the prefix with the first element of the array
        String prefix = strs[0];
        // iterate through the rest of the elements of the array
        for (int i = 1; i < strs.length; i++) {
            // initialize j as the index of the prefix
            int j = 0;
            // check for matching characters between the prefix and the current element of
            // the array
            // until the end of the current element of the array or the prefix is reached
            while (j < strs[i].length() && j < prefix.length() && prefix.charAt(j) == strs[i].charAt(j)) {
                // increment j if a match is found
                j++;
            }
            // if no common prefix is found
            if (j == 0) {
                // return an empty string
                return "";
            }
            // update the prefix to the substring of the prefix from index 0 to j-1, which
            // is the common prefix
            prefix = prefix.substring(0, j);
        }
        // return the common prefix
        return prefix;
    }
}
