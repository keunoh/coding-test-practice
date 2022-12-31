
public class Main {

    //1. 정수 n이 매개변수로 주어짐
    //2. n 이하의 홀수가 오름차순으로 담긴 배열을 return

    public static void main(String[] args) {

        int n = 10;
        int amount = 0;
        //정수가 홀짝인지 판단
        if (n % 2 != 0) {
            amount = (n / 2) + 1;
        } else {
            amount = n / 2;
        }

        //홀수 갯수 먼저 구해줘야 함


        int[] arr = new int[amount];

        //홀수는 2n + 1로 표현 가능
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (2 * i) + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }


    }

}