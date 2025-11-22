//count spaces and remove the spaces
import java.util.*;
class string_space{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        String result="";
        //for(int i=0;i<str.length();i++){
          //  if(str.charAt(i)==' ') {
            //    count++;
            //}else{
              //  result=result+str.charAt(i);
              for(char i:str.toCharArray()){//for each
                if(i==' '){
                    count++;
                }else{
                    result=result+i;
                }
              }
        System.out.println("Number of spaces: " + count);
        System.out.println("String without spaces: " + result);
    }
}