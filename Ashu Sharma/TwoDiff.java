import java.util.HashMap;

public class TwoDiff {
    public static void main(String[] args) {
        int[] nums = {3, 8, 12, 5};
        int k = 5;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int num = nums[i];

            // only check num - k
            if (map.containsKey(num - k)){
                System.out.println("Indices found: [" + map.get(num - k) + ", " + i + "]");
                return;
            }

            // store current number
            map.put(num, i);
        }

        System.out.println("No pair found");
    }
}
