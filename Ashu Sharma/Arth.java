import java.util.Scanner;

public class Arth {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int ans = (int)((num1*num2)/2)%7;
        System.out.println("The answer is: " + ans);
        input.close();
}
}