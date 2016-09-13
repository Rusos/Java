package objects;

public class Bus {

    public int Number;
    public String Brand;
    public int Sits;
    public String Duration;
    
    public void open()
    {
        System.out.println("Bus "+Brand+" "+"#"+Number+" is going to his route. Duration: "+Duration);
    }
    
    public void close()
    {
        System.out.println("Bus "+Brand+" "+"#"+Number+" is going to depo.");
    }
    
    public void busstop()
    {
        System.out.println("Bus is stoped to pick passengers. Number of sits: "+Sits);
    }
    
    
            
}
