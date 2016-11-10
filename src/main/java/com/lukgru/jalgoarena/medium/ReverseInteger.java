import java.util.*;

public class ReverseInteger {
    /**
    Implement a method twoSum that reverses an integer - without using additonal heap space.
    Example
    -123 -> -321
    123 -> 321
     * @param x Input value
     * @return  Reversed integer
     */
    public int reverseInt(int x) {
        int result = 0;
        int mul = 1;
        while (x != 0) {
            result *= 10;
            result += x % 10;
            x /= 10;
            mul *= 10;
        }
        return result;
    }
}
