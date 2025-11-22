class Animal{
    void eats(){
        System.out.println("Animal eats food");
    }
}
class Tiger extends Animal{
    void roars(){
        System.out.println("Tiger roars");
    }
}
public class Single_inheritance{
    public static void main(String[] args) {
        Tiger obj=new Tiger();
        obj.eats();
        obj.roars();
    }
}