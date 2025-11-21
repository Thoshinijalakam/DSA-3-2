class _sum_product{
    public static void main(String[] args) {
        int num=456789;
        int sum=0;
        int prod=1;
        int count=0;
        int rev=0;
        while(num!=0){
            int id=num%10;
            sum=sum+id;
            prod=prod*id;
            count++;
            rev=rev*10+id;
            num=num/10;

        }
        System.out.println("sum of the digits:"+sum);
        System.out.println("product of the digits:"+prod);
        System.out.println("reverse of the digits:"+rev);
    }
}