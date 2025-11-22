class Harshad_number1
{
    public static void main(String args[]){
        for(int j=1;j<=100;j++){
            int num=j;
            int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(num==sum){
            System.out.println(num);
        }
    }
            
        }
    }