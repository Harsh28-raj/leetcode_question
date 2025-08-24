class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] ar = s.toCharArray();
        int n = s.length();
        long sum = 0;

       
        for (int i = n - 1; i >= 0; i--) {
            sum += shifts[i];
            shifts[i] = (int)(sum % 26); 
        }

        for (int i = 0; i < n; i++) {
            int shift = shifts[i];
            char mn = ar[i];
            ar[i] = (char)('a' + (mn - 'a' + shift) % 26);
        }

        return new String(ar);
    }
}
