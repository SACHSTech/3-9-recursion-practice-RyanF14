package recursion;
import java.lang.*;


public class PowerFunction {
    static int amount;
    static int counter;
    static int multiplier;
    public static int power(int base, int exponent){
        if(exponent == 0){
            return 1;
        }
        counter++;

        return base * power(base, exponent - 1);

    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
    
}
