import java.util.Scanner;
class Prime_number_serial_armstrong{
    public static void main(String args[]){
        int num=153;
        int temp=num;
        int count=0;
        while(num!=0){
            int id=num%10;
            count++;
            num=num/10;
        }
        num=temp;
        int sum=0;
        System.out.println(count);
        while (temp != 0) {
            int digit = temp % 10;  
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is NOT an Armstrong number");
        }
    }
}