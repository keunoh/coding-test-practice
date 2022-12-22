import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {

    //최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미함.
    // 정수 배열 array 주어짐
    // 최빈값을 return, 최빈값이 여러개면 -1리턴

    /**
     * 1. 배열의 첫 번째 요소를 두 번째 요소부터 마지막까지 확인하고 같으면 카운트 높여 줌 (ok)
     * 2. 첫 번째 요소부터 현재 요소까지 비교해서 현재 요소 값과 같은 값이 있다면 검색하지 않음 (ok)
     * 3. 해당 인덱스의 값과 카운트를 맵으로 담아 둠 (ok)
     * 4. 밸류의 최대값을 가져와서 해당 밸류의 키값을 리턴함
     * 5. 만약 최대값이 두 개 이상 존재하면 -1 반환
     * @param args
     */

    public static void main(String[] args) {
        int[] arr = {1,1,1};

        System.out.println("answer = " + solution(arr));
    }

    public static int solution(int[] array) {
        return mapping(array);
    }

    public static int mapping(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            //조건2
            if ((i != 0)){
                int isBeforeSame = 0;
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        isBeforeSame++;
                    }
                }
                if (isBeforeSame != 0) {
                    continue;
                }
            }//end if

            for (int j = i + 1; j < arr.length; j++) {
                //조건1
                if (arr[i] == arr[j]) {
                    count++;
                }//end if
            }
            map.put(arr[i], count);
        }

        //조건4
        Integer max = Collections.max(map.values());
        int mapCount = 0;

        for (Integer value : map.values()) {
            if (value == max) {
                mapCount++;
            }
        }

        int mapKey = 0;
        for (Integer key : map.keySet()) {
            if (max == map.get(key)) {
                mapKey = key;
            }
        }

        if (mapCount > 1) {
            return -1;
        } else {
            return mapKey;
        }
    }
}