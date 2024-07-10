package designpattern.CreationalDesignPattern;


class Singleton {

  //  private static Singleton instance;   //static singleton instance   //lazy initialization
    private static Singleton instance=new Singleton(); //eager initialization
    private Singleton() {   //private Constructor  for prevent instantiations
        System.out.println("Constructor calling...");
    }
    //static method

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Creating first instance...");
        }
        System.out.println("Fetching instance...");
        return instance;
    }
}

public class SingletonDesignPatternExample {

    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();

        System.out.println("Are both instances are same?-->"+(s1==s2));

    }
}
//Achieved
//1.Reduce memory usage
//2.Guaranteed one instance