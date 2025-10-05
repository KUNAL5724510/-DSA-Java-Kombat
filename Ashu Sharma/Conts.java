import java.util.Scanner;

public class Conts {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum=0, count=0;
        while(a%10!=0){
            sum=sum+a%10;
            a=a/10;
            count++;
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The count is: "+count);
        input.close();
    }
}
