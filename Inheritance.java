
//Base class 
class Shape{

    public void area()
    {
        System.out.println("Dispaly area");
    }

}

//Single level inheritance
class Traingle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
// Multilevel inheritance 
class EquilateralTraingle extends Traingle {
    public void area(int l, int h){
         System.out.println(1/2*l*h);

    }
}
//Hierarchical level inheritance
class Circle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}


public class Inheritance{
    public static void main(String[] args) {
        
    }

}
