import java.util.*;
class happy_numbers {
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 1 && n != 4) {  
            sum = 0; 
            int temp = n;
            while (temp != 0) {
                int dig = temp % 10;
                sum = sum + (dig * dig);
                temp = temp / 10;
            }
            n = sum;
        }
        if (n == 1)
            System.out.println("the number is a happy number.");
        else
            System.out.println("the number is not a happy number.");
    }
}