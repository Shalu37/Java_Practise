class Pen{

    String color;
    String type; // ballpoint , gel


    public void write(){
        System.out.println("Writing something");
    }

    public void printColor()
    {
        System.out.println(this.color); /// this keyword is used to access that what thing calling that obeject 
    }

}

//class name by convention starts with capital letter and functions/ methods name starts with small or in camelcase.
class Student{
    String name;
    int age ;

    public void printName(){
        System.out.println(this.name);
    }
}



public class OOPS{

    //main function
    public static void main(String args[]){
        Pen pen1 = new Pen(); //object making //new keyword is used to allocat a palce for object in the heap memory 
        pen1.color = "blue";
        pen1.type = "gel";
        //Function/methods calls 
        pen1.write();


        Pen pen2 = new Pen(); //object making
        pen2.color = "red";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();


    }


    
}
