import java.util.Scanner;
class Prime_number_serial_armstrong1{
    public static void main(String args[]){
        for(int num=1;num<=10000;num++){
            int temp=num;
            int count=0;
            while(temp!=0){
                int id=num%10;
                count++;
                num=num/10;
            }
            num=temp;
            int sum=0;
            while(temp!=0){
                int id=num %10;
                int exp=1;
                for(int i=1;i<count;i++){
                    exp=exp*id;
                }
                sum=sum+exp;
                num=num/10;
            }
            if(sum==temp){
                System.out.println(temp);
            }

        }
    }
}