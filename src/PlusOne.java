import java.util.Arrays;

/**
 * Created by Vishwas on 30-01-2018.
 * https://leetcode.com/problems/plus-one/description/
 */
public class PlusOne {

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] res = plusOne.plusOne(new int[]{});
        System.out.println("adsf");
    }

    public int[] plusOne(int[] digits) {
        int carryForward = 1;
        for (int idx = digits.length - 1; idx >= 0; idx--) {
            int sumInInt = digits[idx] + carryForward;
            if (sumInInt > 9) {
                carryForward = sumInInt / 10;
                digits[idx] = Math.abs(10 - sumInInt);
            } else {
                carryForward = 0;
                digits[idx] = sumInInt;
                break;
            }
        }
        if (carryForward > 0) {
            //now we need another array with carry forward at its first place
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = carryForward;
            for (int idx = 0; idx < digits.length; idx++) {
                newDigits[idx + 1] = digits[idx];
            }
            digits = newDigits;
        }
        int limit = 0;
        while (limit < digits.length && digits[limit] == 0)
            limit++;
        if (limit > 0)
            return Arrays.copyOfRange(digits, limit, digits.length);
        else
            return digits;
    }

}
