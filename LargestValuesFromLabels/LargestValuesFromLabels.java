import java.util.HashMap;
import java.util.Map;

public class LargestValuesFromLabels {
     public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        if(numWanted == 0) return 0;

        int sum = 0;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < values.length; i++) {
            map.put(values[i],labels[i]);
        }

        sum += values[0];
        for(int i = 1; i < values.length; i++) {
            if(map.get(i) == map.get(i-1)) {
                while(useLimit >= 1) {
                    sum += values[i];
                    useLimit--;
                    i++;
                }
            } else {
                sum += values[i];
            }
        }
        return sum;
    }
}
