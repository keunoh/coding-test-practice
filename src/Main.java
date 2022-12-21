import java.util.Arrays;

public class Main {

    /**
     * 1. 분모를 곱함
     * 2. 그리고 분자끼리 더함
     * 3. 분자와 분모가 2나 3으로 동시에 나눠진다면 나눠주기
     */
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }

    public static void main(String[] args) {
        int denum1 = 9;
        int num1 = 2;
        int denum2 = 1;
        int num2 = 3;

        int sumOfDeNum = ((denum1 * num2) + (num1 * denum2));
        int sumOfNum = num1 * num2;

        int gcd = gcd(sumOfDeNum, sumOfNum);
        System.out.println("gcd = " + gcd);

        int[] answer = new int[2];
        if (gcd == 1) {
            answer[0] = sumOfDeNum;
            answer[1] = sumOfNum;
        } else {
            answer[0] = sumOfDeNum / gcd;
            answer[1] = sumOfNum /gcd;
        }

        System.out.println("answer = " + Arrays.toString(answer));
        System.out.println("sumOfDeNum = " + sumOfDeNum);
        System.out.println("sumOfNum = " + sumOfNum);

        System.out.println("분자1 : " + (denum1 * num2));
        System.out.println("분모1 : " + (num1 * num2));
        System.out.println("분자2 : " + (num1 * denum2));
        System.out.println("분모2 : " + (num2 * num1));

        System.out.println("분자의 합 : " + ((denum1 * num2) + (num1 * denum2)));
        System.out.println("분모 : " + (num1 * num2));
    }

}