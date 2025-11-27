public class recursion_infiniteloop{
    public static void main(String[] args) {
        call();
    }
    public static void call(){
    call();
    }
}