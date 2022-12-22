import java.util.Arrays;

public class Main {

    // 배열을 정렬한다.
    // 어차피 홀 수로 들어오니 가운데 값 인덱스를 잡아준다.

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 15, 7};

        int index = arr.length / 2;
        int[] result = bubbleSort(arr);

        System.out.println("result[index] = " + result[index]);
        
    }

    public static int[] bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}