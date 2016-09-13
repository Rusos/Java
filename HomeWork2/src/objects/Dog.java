package objects;

public class Dog {
    public int Age;
    public String Name;
    public String Color;
    public String Breed;
    
    public void Characteristic()
    {
        System.out.println("Dog "+Name+" is "+Age+" years old. Color: "+Color+". Breed: "+Breed);
    }
    
    public void Voice()
    {
        System.out.println("Dog "+Name+" is barks.");
    }
    
    public void Sit()
    {
        System.out.println("Dog "+Name+" is sits.");
    }
    
    public void Run()
    {
        System.out.println("Dog "+Name+" is runs.");
    }
}
