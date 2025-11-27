public class Linear_recursion_product{
    public static void main(String[] args) {
        System.out.println(product(5));
    }
    public static int product(int num){
        if(num==1){
            return 1;
        }else{
            return num*product(num-1);
        }
    }
}