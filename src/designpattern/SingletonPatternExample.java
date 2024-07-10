package designpattern;

public class SingletonPatternExample {

    //let's improve the Logger class by implementing lazy initialization with double-checked
    // locking to ensure both thread safety and efficiency. Here's how you can do it:
     private static volatile SingletonPatternExample instance;//// Volatile keyword ensures visibility of changes across threads

     private SingletonPatternExample(){

     }

  //  public static synchronized SingletonPatternExample getInstance() {
    public static SingletonPatternExample getInstance() {

       if(instance==null) {
           synchronized (SingletonPatternExample.class) { // new added double checking
               if(instance==null) {  //added
                   instance = new SingletonPatternExample();
               }                //new added
           }                 //new added
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
