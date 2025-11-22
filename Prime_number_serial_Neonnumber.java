import java.util.Scanner;
class Prime_number_serial_Neonnumber{
    public static void main(String args[]){
        int num=135;
        int temp=num;
        int count=0;
        while(num!=0){
            int id=num%10;
            count++;
            num=num/10;
        }
        num=temp;
        int sum=0;
        while(num!=0){
            int id=num%10;
            int exp=1;
            for(int i=1;i<=count;i++){
                exp=exp*id;
            }
            sum=sum+exp;
            num=num/10;
        }
        if(sum==temp){
             System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is NOT an Armstrong number");
        }
    }
}