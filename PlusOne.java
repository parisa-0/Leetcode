class Solution {
    public int[] plusOne(int[] digits) {
          int[] newDigits = new int[digits.length + 1];

         for (int i = digits.length - 1; i >= 0; i--) {
          if(digits[i] < 9) {
               digits[i]++;
                return digits;
            }
           else if(digits[i] == 9) {  
               digits[i] = 0;
          } 
    }

    for(int digit : digits) {
        newDigits[digit] = digits[digit];
    }
    
    newDigits[0] = 1;

    return newDigits;
    }
}
