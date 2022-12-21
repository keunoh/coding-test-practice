package level0;

import java.util.Arrays;

public class DeleteIfNotMultiple {

    //조건1. 정수 n과 정수 배열 numlist가 매개변수로 주어짐
    //조건2. numlist에서 n의 배수가 아닌 수들을 제거한 배열 return

    public static int[] solution(int n, int[] numlist) {

        for (int i = 0; i < numlist.length; i++) {
            if ((numlist[i] % n) != 0) {
                numlist[i] = 0;
            }
        }

        int myCount = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] != 0) {
                myCount++;
            }
        }

        int[] answer = new int[myCount];
        int myIndex = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] != 0) {
                answer[myIndex++] = numlist[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int n = 3;
        int[] numList = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        int[] myArr = solution(n, numList);

        String result = Arrays.toString(myArr);
        System.out.println("result = " + result);
    }
}
