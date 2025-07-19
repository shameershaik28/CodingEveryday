package DesignPatterns.Factory;

public class CarFactory {
    public static Car getCar(String type) {
        if(type.equalsIgnoreCase("Tesla")){
            return new Tesla();
        }
        else if(type.equalsIgnoreCase("Hyundai")){
            return new Hyundai();
        }
        else
        {
            throw new  IllegalArgumentException("Unknown car type: " + type);
        }
    }
}
