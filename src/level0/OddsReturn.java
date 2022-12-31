package level0;

public class OddsReturn {

    public int[] solution(int n) {
        int amount;
        if (n % 2 != 0) {
            amount = (n / 2) + 1;
        } else {
            amount = n / 2;
        }

        int[] arr = new int[amount];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (2 * i) + 1;
        }

        return arr;
    }
}
