package src.com.varun;

public class Calculator {

    public static int add(int num1,int num2){
        return num1+num2;
    }

    public static int subtraction(int num1,int num2){
        return num1 - num2;
    }

    public static int multiplication(int num1,int num2){
        return num1*num2;
    }

    public static int division(int num1,int num2){
        return num1/num2;
    }

    public static double square(int num1){
        return num1*num1;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 10 and 20 is "+Calculator.add(10,20));

        System.out.println("The difference between 10 and 20 is  "+Calculator.subtraction(10,20));

        System.out.println("Product of 10 and 20 is "+Calculator.multiplication(10,20));

        System.out.println("The quotient of division of 20 by 10 is "+Calculator.division(20,10));

        System.out.println("The square value of 10 is "+Calculator.square(9));

    }
}
