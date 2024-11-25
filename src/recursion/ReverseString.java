package recursion;

public class ReverseString {
    static 
    public String reverse(String s){
        if(s.length() <= 1){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
public static void main(String[] args) {
    String inputString = "test";
    String reversedString = reverse(inputString);
    System.out.println(inputString);
    System.out.println(reversedString);
}
}
