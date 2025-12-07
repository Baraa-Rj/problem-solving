import java.util.*;

public class TopKFrequentElement {

    public int[] BucketSort(int[] nums, int k) {
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
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
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
