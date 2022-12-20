public class Main {

    // 조건1. 정수 n이 매개변수로 주어진다.
    // 조건2. n의 각 자리 숫자의 합을 return

    /**
     * 일단 몇 째 자리 숫자인지 판단이 가능해야하고,
     * 각 자릿수의 값을 가져올 수 있으면 될듯
     * 1 * 10(3) + 2 * 10(2) + 3 * 10(1) + 4 * 10(0)
     */
    public static int solution(int n) {
        int answer = 0;

        while ((n / 10) > 0) {
            answer += (n % 10);
            n = (n - (n % 10)) / 10;

            if((n / 10) == 0) {
                answer += n;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int n = 930211;
        int number = 1;
        int sum = 0;
        while ((n / 10) > 0) {
            number++;
            sum += (n % 10);
            n = (n - (n % 10)) / 10;
            if ((n / 10) == 0) {
                sum += n;
                break;
            }
        }

        int solution = solution(930211);
        System.out.println("solution = " + solution);

    }
}