package designpattern.CreationalDesignPattern;

// copying the exact value of object's properties without writing explicit code for each property
// new Objects are created by copying the existing object known as prototype
// Cloning can be Shallow Copy or Deep Copy of Object
// -> Shallow Copy Create new instance of Object BUT Doesn't create copy of Original Object REFERENCES.
// -> Instead it REUSES the reference to the same Objects
// -> Cloned Object and Original Object share References to same nested objects.Nested Object is modified, the change
//    will be visible to both Original and Cloning Object.

// -> Deep Copy create new instance of object and recursively copies all object referenced by the original Object.
// -> Each references is new instance. The clone Object and Original Object are completely independent.
//USE CASE:Graphics Design Applications.

import java.util.HashMap;
import java.util.Map;

//Prototype interface
interface ProtoType extends Cloneable {
    ProtoType clone() throws CloneNotSupportedException;
}

//Concrete ProtoType
class Circle1 implements ProtoType {

    private int radius;

    public Circle1(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Circle1 clone() throws CloneNotSupportedException {
        return (Circle1) super.clone(); //Shallow Copy
    }
}

//ProtoType registry to manage ProtoTypes
class ProtoTypeRegistry {
    private Map<String, ProtoType> protoTypeMap = new HashMap<>();

    public void addProtoType(String key, ProtoType protoType) {
        protoTypeMap.put(key, protoType);
    }

    public ProtoType getProtoType(String key) throws CloneNotSupportedException {
        ProtoType protoType = protoTypeMap.get(key);
        if (protoType != null) {
            return protoType.clone();
        }
        return null;
    }
}

public class ProtoTypeBuilderPatternExample {
    public static void main(String[] args) {
        //create ProtoType registry
        ProtoTypeRegistry protoTypeRegistry = new ProtoTypeRegistry();
        //Add Circle ProtoType to registry
        Circle1 circleProtoType = new Circle1(5);
        protoTypeRegistry.addProtoType("Circle", circleProtoType);

        //Clone the Circle ProtoType
        try {
            Circle1 circle1 = (Circle1) protoTypeRegistry.getProtoType("Circle");
            //Print radios of the Clone Circle
            System.out.println("Radios Of Clone Circle:" + circle1.getRadius());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
