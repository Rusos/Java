package homework2;

import objects.Bus;
import objects.Dog;

public class HomeWork2 {
    public static void main(String[] args) {
        Bus bus;
        bus = new Bus();
        
        Dog dog;
        dog = new Dog();
                
        bus.Number=9;
        bus.Brand="Icarus";
        bus.Sits=56;
        bus.Duration="Circle";
        
        dog.Age=3;
        dog.Breed="Kurzhaar";
        dog.Color="Brown";
        dog.Name="Alma";
        
        bus.open();
        bus.busstop();
        System.out.println("Dog is running out of the bus.");
        dog.Characteristic();
        dog.Run();
        dog.Voice();
        dog.Sit();
        System.out.println("Dog is jumped to the bus.");
        bus.close();
        
    }
    
}
