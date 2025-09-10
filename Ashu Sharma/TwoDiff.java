import java.util.HashMap;

public class TwoDiff {
     
    public static void main(String[] args) {
        int[] nums = {3, 8, 12, 5};
        int k = 4;

        HashMap<Integer, Integer> map = new HashMap<>(); // number -> index

        for (int i = 0; i < nums.length; i++){
            int num = nums[i]; // current number

            // check if num - k is already in map
            if (map.containsKey(num - k)){
                System.out.println("Indices found: [" + map.get(num - k) + ", " + i + "]");
                return;
            }

            // check if num + k is already in map
            else if (map.containsKey(num + k)){
                System.out.println("Indices found: [" + map.get(num + k) + ", " + i + "]");
                return;
            }

            // store current number in map
            map.put(num, i);
        } 

        System.out.println("No pair found");
    }
}
