public class lab3 {

    
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int max(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {

        lab3 calc = new lab3();

        System.out.println("Integer Addition: " + calc.add(10, 5));
        System.out.println("Double Addition: " + calc.add(5.5, 2.3));

        System.out.println("Max of 2 numbers: " + calc.max(10, 20));
        System.out.println("Max of 3 numbers: " + calc.max(10, 25, 15));
    }
}