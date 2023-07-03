package part1;

public class Calculator {

    private int num1, num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addition(){
        return this.num1 + this.num2;
    }

    public int subtraction(){
        return this.num1 - this.num2;
    }

    public int division(){
        return this.num1 / this.num2;
    }

    public int multiplication(){
        return this.num1 * this.num2;
    }

    public static void main(String[] args) {
        var calc = new Calculator(1, 3);

        System.out.println(calc.addition());
        System.out.println(calc.subtraction());
        System.out.println(calc.division());
        System.out.println(calc.multiplication());
    }
}
