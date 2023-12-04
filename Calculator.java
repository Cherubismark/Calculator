import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        fill();
    }

    public static void fill(){
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Press '+' for addition, '-' for subtraction, 'x' for multiplication, '/' for division, or 99 to quit");
        String equation = input.next();
        while (!equation.equals("99")){
            System.out.println("Please enter the first number");
            double num1 = input1.nextDouble();
            System.out.println("Please enter the second number");
            double num2 = input2.nextDouble();
            if (equation.equals("+")){
                System.out.println(addition(num1, num2));
            }else if(equation.equals("-")){
                System.out.println(subtraction(num1, num2));
            }else if(equation.equals("x")){
                System.out.println(multiplication(num1, num2));
            }else System.out.println(division(num1, num2));
            System.out.println("Press '+' for addition, '-' for subtraction, 'x' for multiplication, '/' for division, or 99 to quit");
            equation = input.next();
        }
    }

    public static double addition(double num1, double num2){
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2){
        return num1 / num2;
    }
}