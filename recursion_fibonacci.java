import java.util.*;
public class recursion_fibonacci{
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n>=0){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}