import java.util.Arrays;

public class Main {

    //조건1. 정수 num1과 num2가 매개변수로 주어짐
    //조건2. num1을 num2로 나눈 값에 1000을 곱하고 정수 부분 return


    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        double value = (a * 1.0) / b;
        double result = value * 1000;

        int result1 = (int) result;
        System.out.println("result1 = " + result1);

    }
}