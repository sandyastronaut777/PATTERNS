package singleton_pattern;

//A singleton class should have public visibility
//so that complete application can use
public class Single {

    //static instance of class globally accessible
    public static Single instance = new Single();

    private Single() {
        // private constructor so that class
        //cannot be instantiated from outside
        //this class
    }
}
