package testobject;

public class Computer 
{
    private String name;
    private int ram;
    private int hdd;
    private double weight;
    private String mac;
    private int monitor;
    private String os;
    private double cpu;
    private double time;
    private String cd;
    private boolean cdReadable;
    
    public Computer(){
    
    }
    
    public Computer(String name, int ram, int hdd, double weight, String mac, int monitor, String os, double cpu, double time, String cd, boolean cdReadable){
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
        this.mac = mac;
        this.monitor = monitor;
        this.os = os;
        this.cpu = cpu;
        this.time = time;
        this.cd = cd;
        this.cdReadable = cdReadable;
        on();
    }
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getRam(){
        return ram;
    }
    
    public void setRam(int ram){
        if (ram>0){
            this.ram = ram;
        }
        else{
            System.out.println("Incorret data "+ram);
        }
    }
    
    public int getHdd(){
        return hdd;
    }
    
    public void setHdd(int hdd){
        if (hdd>0){
            this.hdd = hdd;
        }
        else{
            System.out.println("Incorret data "+hdd);
        }
    }
    
    public String getMac(){
        return mac;
    }
    
    public void setMac(String mac){
        this.mac = mac;
    }
    
    public int getMonitor(){
        return monitor;
    }
    
    public void setMonitor(int monitor){
        if (monitor>0){
            this.monitor = monitor;
        }
        else{
            System.out.println("Incorret data "+monitor);
        }
    }
    
    public String getOs(){
        return os;
    }
    
    public void setOs(String os){
        if ("iOS".equals(os)) {
            this.os = os;
        } else {
            System.out.println("This type of Operating System is forbidden!");
        }
    }
    
    public double getCpu(){
        return cpu;
    }
    
    public void setCpu(double cpu){
        if (cpu>0){
            this.cpu = cpu;
        }
        else{
            System.out.println("Incorret data "+cpu);
        }
    }
    
    public double getWeight(){
        return weight;
    }
    
    public void setWeight(double weight){
        if (weight>0){
            this.weight = weight;
        }
        else{
            System.out.println("Incorret data "+weight);
        }
    }
    
    public double getTime(){
        return time;
    }
    
    public void setTime(double time){
        if (time>0){
            this.time = time;
        }
        else{
            System.out.println("Incorret data "+time);
        }
    }
    
    public boolean iscdReadable(){
        return cdReadable;
    }
    
    public void setcdReadable(boolean cdReadable){
        this.cdReadable = cdReadable;
    }
    
    public String getCd(){
        return cd;
    }
    
    public void setCd(String cd){
        if ("DVD".equals(cd) || "CD".equals(cd)) {
            this.cd = cd;
        } else {
            System.out.println("This type of Optical Disk is forbidden!");
        }
    }
    
    public void on(){
        print("I'm on. My model: "+name+".");
    }
    public void off(){
        print("I'm off.");
    }
    public void load(){
        print("I'm loading. My HDD is: "+hdd+" Gb. My RAM is: "+ram+" Mb. My CPU is: "+cpu+" HHz. My OS is: "+os+". My Monitor is: "+monitor);
    }
    
    public void reboot(){
        print("I'm rebooting now. Please wait: "+time+" minutes.");
    }
    
    public void reading(){
        if(cdReadable){
            setCd(cd);
            print("I'm reading "+cd+".");
        }
        else{
        print("Can't read disk.");
        }
    }
    
    private void print(String str){
        System.out.println(str);
    }
    
}
