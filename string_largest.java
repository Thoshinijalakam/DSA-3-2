//largest word in given string
import java.util.*;
class string_largest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        String largest=words[0];
        //for(int i=0;i<words.length;i++){
          //  if(words[i].length()>largest.length()){
            //    largest=words[i];
            //}
       // }
       for(String w:words){
        if (w.length() > largest.length()) {
                largest = w;
            }
        }
        System.out.println("largest word in given string:"+largest);
         System.out.println("Length: " + largest.length());
    }
}
//["i","love","programming","in",java"]
