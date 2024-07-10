package designpattern;


class Pizza
{
private String dough;
private String sauce;
private String topping;

public Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
        }
   public static class Builder{

       private String dough;
       private String sauce;
       private String topping;

       public Builder(){
       }

       public Builder dough(String dough){
           this.dough=dough;
           return  this;
       }
       public  Builder souce(String sauce){
           this.sauce=sauce;
           return  this;
       }

       public Builder topping(String topping){
           this.topping=topping;
           return this;
       }

           public  Pizza buid(){
           return new Pizza(this);
       }

   }
}
public class BuiderPatternExmple {
    public static void main(String[] args) {
         Pizza pizza=new Pizza.Builder()
                              .dough("Thin")
                              .souce("Tomato")
                               .topping("Chizz")
                               .buid();
        System.out.println(pizza.toString());
    }
}
