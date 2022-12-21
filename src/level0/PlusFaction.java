package level0;

public class PlusFaction {

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int sumOfDeNum = ((denum1 * num2) + (num1 * denum2));
        int sumOfNum = num1 * num2;

        int gcd = gcd(sumOfDeNum, sumOfNum);
        int[] answer = new int[2];

        if (gcd == 1) {
            answer[0] = sumOfDeNum;
            answer[1] = sumOfNum;
        } else {
            answer[0] = sumOfDeNum / gcd;
            answer[1] = sumOfNum / gcd;
        }

        return answer;
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }
}
