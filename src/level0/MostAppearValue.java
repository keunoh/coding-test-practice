package level0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostAppearValue {

    public int solution(int[] array) {
        return mapping(array);
    }

    public static int mapping(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int k = 0;
            //조건2
            if ((i != 0)){
                int isBeforeSame = 0;
                for (k = 0; k < i; k++) {
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
