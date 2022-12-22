package level0;

public class MiddleValue {

    public int solution(int[] array) {
        int index = array.length / 2;
        int[] answer = bubbleSort(array);

        return answer[index];
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
