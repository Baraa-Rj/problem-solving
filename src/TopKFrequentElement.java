import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement {

    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       for (int num : nums) {
           map.put(num, map.getOrDefault(num, 0) + 1);
       }
       PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
       queue.addAll(map.entrySet());
       int[] result = new int[k];
       for (int i = 0; i < k; i++) {
           result[i] = queue.poll().getKey();
       }
       return result;
    }


    public static void main(String[] args) {
        TopKFrequentElement topKFrequentElement = new TopKFrequentElement();
        int[] nums = {1,2,2,3,3,3};
        int k = 2;
        int[] result = topKFrequentElement.topKFrequent(nums, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
