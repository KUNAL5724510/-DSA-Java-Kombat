import java.util.HashMap;

public class LHashMap {
     public static void main(String[] args) {
         

        HashMap<Integer, String> fruits = new HashMap<>();


        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(3, "Orange");
        fruits.put(4, "Mango");
        fruits.put(5, "Grapes");

        System.out.println("Fruits HashMap: " + fruits);

        String sourfruit = fruits.get(3);

        System.out.println("Fruit at key 3: " + sourfruit);

        fruits.put(2, "Pineapple");
        System.out.println("Fruits HashMap: " + fruits);

        fruits.remove(2);
        System.out.println("Fruits HashMap after removing key 2: " + fruits);


     }
}
