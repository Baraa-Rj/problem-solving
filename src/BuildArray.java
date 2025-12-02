import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BuildArray {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        HashSet<Integer> hashset = new HashSet<>();
        for (int num : target) {
            hashset.add(num);
        }

        int targetMax = target[target.length - 1];

        for (int i = 1; i <= targetMax; i++) {  // iterate 1 to max target value
            list.add("Push");
            if (!hashset.contains(i)) {         // check if number (not index) is in target
                list.add("Pop");
            }
        }

        return list;
    }

    public static void main(String[] args) {
        BuildArray buildArray = new BuildArray();
        System.out.println(buildArray.buildArray(new int[]{1,2,3},3));
    }
}
