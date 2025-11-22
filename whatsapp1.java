class whatsapp1{
    public static void aa(){
        System.out.println("chatting");
        dd();
    }
    public static void bb(){
        System.out.println("calls");
        aa();
    }
    public static void cc(){
        System.out.println("status");
        bb();
    }
    public static void dd(){
        System.out.println("meta AI");
        cc();
    }
}
class main{
    public static void main(String args[]){
        whatsapp1 wb=new whatsapp1();
        wb.cc();
    }
}