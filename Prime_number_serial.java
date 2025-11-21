import java.util.*;
class Prime_number_serial{
    public static void main(String args[]){
        int sin=1;
        int num=37;
        int count=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0&& num != 1){
            System.out.println(sin+")"+num);
            sin++;
        }
    }
}

