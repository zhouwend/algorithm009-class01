class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        for(int i = l -1; i >= 0; i--) {
            digits[i] = (digits[i] + 1)%10;
            if(digits[i] != 0) return digits;
        }
        digits = new int[l +1];
        digits[0] = 1;
        return digits;
    }
}