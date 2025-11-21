import java.util.*;
class Prime_number{
    public static void main(String args[]){
        for(int j=1;j<=50;j++){
        int num=j;
        int count=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0&& num != 1){
            System.out.println(num+"is a prime number");
        }else{
            System.out.println(num+"is not a prime number");
        }
        }
    }
}
