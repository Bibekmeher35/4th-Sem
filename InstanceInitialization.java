class InstanceInitialization {
    String name;
    int age;    
    // Constructor with no arguments (Default values)
    public InstanceInitialization() {
        this.name = "Unknown";
        this.age = 0;
    }
    // Constructor with parameters
    public InstanceInitialization(String name, int age) {
        this.name = name;
        this.age = age;
    }    
    // Constructor with only name (Default age)
    public InstanceInitialization(String name) {
        this.name = name;
        this.age = 18;
    }    
    // Constructor with only age (Default name)
    public InstanceInitialization(int age) {
        this.name = "Default Name";
        this.age = age;
    }   
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }    
    public static void main(String[] args) {
        InstanceInitialization obj1 = new InstanceInitialization();
        InstanceInitialization obj2 = new InstanceInitialization("Alice", 25);
        InstanceInitialization obj3 = new InstanceInitialization("Bob");
        InstanceInitialization obj4 = new InstanceInitialization(30);        
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}
