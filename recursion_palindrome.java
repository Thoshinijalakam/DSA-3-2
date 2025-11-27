public class recursion_palindrome{
    public static void main(String args[]){
        String str="madam";
        System.out.println(Palindrome(str, 0, str.length() - 1));

    }
    public static boolean Palindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return Palindrome(str, start + 1, end - 1);
    }
}