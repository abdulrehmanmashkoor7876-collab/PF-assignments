public class lab4 {

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;   
            }
        }

        return true;  
    }
    public static void main(String[] args) {
        int num = 7;

        if (isPrime(num)) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is NOT a Prime number");
        }
    }
}