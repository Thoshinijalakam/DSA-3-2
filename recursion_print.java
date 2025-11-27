public class recursion_print{
    public static void main(String args[]){
        System.out.println(numbers(10));
    }
    public static int numbers(int num){
        if(num==0){
            System.out.println("Start!");
            return 0;
        }
        System.out.println(num);
        return numbers(num-1);
    }
}