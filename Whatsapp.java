class version1{
    void chats(){
        System.out.println("whatsapp chats");    
    }
}
class version2 extends version1{
    void videocalls(){
        System.out.println("Videocalls");
    }
}
class version3 extends version2{
    void status(){
        System.out.println("status");
    }
}
class version4 extends version3{
    void MetaAI(){
        System.out.println("MetaAI");
    }
}
public class Whatsapp{
    public static void main(String args[]){
        version4 ob=new version4();
        ob.chats();
        ob.videocalls();
        ob.status();
        ob.MetaAI();
    }
}