public class Calculator {

    int x = 5;
    int y = 4;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add();
        calculator.multiply();
        calculator.square(5);
    }

    public void add() {
        System.out.println(x + y);
    }

    public void multiply() {
        System.out.println(x * y);
    }

    public void square(int x) {
        System.out.println(x * x);
    }
}