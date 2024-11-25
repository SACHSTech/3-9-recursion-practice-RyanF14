package recursion;

public class CountUpTimer {
    static int counter = 1; 
    
    public static void countUp(int n) {
      
        if(counter > n){
            
            return;
        }
        System.out.print(counter + " ");
        counter++;
        countUp(n);

        } 
    

    public static void main(String[] args) {
        countUp(5); // Output: 1 2 3 4 5
    }
}