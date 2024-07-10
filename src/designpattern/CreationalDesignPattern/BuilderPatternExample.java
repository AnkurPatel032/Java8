package designpattern.CreationalDesignPattern;
//usage

//Construct complex Object step by step,with the builder handling assembly
//UseCase: Video Game Character Creation or meal Creation
//Reliability: same building process create different type object
//Achieved
//1.Encapsulations:(hide internal construction process)
//2.Separation of concerns
//3.Single Responsibility principle


class Computer{
    //Required parameter
    private String HDD;
    private String RAM;
    //option parameter
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    //private Constructor enforce object creation through builder
    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    //static nested class for Builder
    static class ComputerBuilder{
        //Required parameter
        private String HDD;
        private String RAM;
        //optional Parameter
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            this.isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
           this.isBluetoothEnabled = bluetoothEnabled;
           return this;
        }
        //Method to build Object
        public Computer buid(){
            return new Computer(this);
        }
    }

}
public class BuilderPatternExample {

    public static void main(String[] args) {

        Computer computer=new Computer.ComputerBuilder("HDD","500")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .buid();

        System.out.println("HDD:"+computer.getHDD());
        System.out.println("RAM:"+computer.getRAM());
        System.out.println("IsGraphicsEnabled:"+computer.isGraphicsCardEnabled());
        System.out.println("IsBluetoothEnabled:"+computer.isBluetoothEnabled());

    }
}
