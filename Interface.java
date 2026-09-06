interface Animal{
    public void walk();
}

interface Herbivore{
    public void walk();
}

class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class Interface {
//Static means here vo cheez jo sabke liye accesible hai 
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
    
}
