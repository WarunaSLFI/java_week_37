public class App {
    public static void main(String[] args) {
        
        int num = 10;           
        double decimal = 5.75;

        
        double sum = num + decimal;
        System.out.println("Sum (double): " + sum);

        
        int sumInt = (int) sum; 
        System.out.println("Sum (int after casting): " + sumInt);
    }
}
