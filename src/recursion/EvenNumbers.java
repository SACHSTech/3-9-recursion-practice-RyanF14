package recursion;

public class EvenNumbers {

    public static void printEvens(int start, int end) {
       
        if (start > end) {
            return;
        }
        if (start % 2 == 0) {
            System.out.print(start + " ");
        }
        printEvens(start + 1, end);
    }

    public static void main(String[] args) {
        int start = 2;
        int end = 10;
        System.out.println("Even numbers between " + start + " and " + end + ":");
        printEvens(start, end); // Output: 2 4 6 8 10
    }
}
