/**
 * Created by Vishwas on 13-02-2018.
 * https://leetcode.com/problems/1-bit-and-2-bit-characters/description/
 */
public class CharacterDescription {

    public static void main(String[] args) {
        CharacterDescription characterDescription = new CharacterDescription();
        characterDescription.isOneBitCharacter(new int[]{1, 0, 0, 0});
    }

    public boolean isOneBitCharacter(int[] bits) {
        int n = 0;
        if(bits.length == 1 && bits[0] == 0)
            return true;
        while (n < bits.length) {
            if(bits[n] == 1)
                n += 2;
            else {
                n++;
                //following if condition not needed
                if(n == bits.length - 1)
                    return true;
            }
            //TODO: evaluate if bits[n] == 0 check needed or not
            if(n == bits.length - 1 && bits[n] == 0)
                return true;
        }
        return false;
    }
}
