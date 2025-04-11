public class ObjectCounter {
    // Static variable to keep track of object count
    private static int count = 0;
    
    // Constructor increments the count when a new object is created
    public ObjectCounter() {
        count++;
    }
    
    // Static method to get the count of objects created
    public static int getCount() {
        return count;
    }
    
    public static void main(String[] args) {
        // Creating objects
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        
        // Displaying the number of objects created
        System.out.println("Number of objects created: " + ObjectCounter.getCount());
    }
}
