class Fibonacci1_series{
    public static void main(String args[]){
        int a=0;
        int b=1;
        int temp=0;
        for(int i=1;i<=30;i++){
            a=b;
            b=temp;
            temp=a+b;
            System.out.println(temp);        
        }
    }
}