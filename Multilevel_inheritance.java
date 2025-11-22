class Animal{
    void displayAnimal(){
        System.out.println("Animal eats food");
    }
}
class dog extends Animal{
    void displaydog(){
        System.out.println("Dog barks");
    }
}
class puppy extends dog{
    void displaypuppy(){
        System.out.println("Puppy cry");
    }
}
public class Multilevel_inheritance{
    public static void main(String[] args) {
        puppy obj=new puppy();
        obj.displayAnimal();
        obj.displaydog();
        obj.displaypuppy();
    }
}