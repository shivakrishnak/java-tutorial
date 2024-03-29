package com.ksk.java8.ocp.enm;

enum Vehicle {
    AUTO("wala"), TRACTOR("dosth");
    public String type;

    Vehicle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        for (Vehicle p : Vehicle.values()) {
            System.out.println(p + " " + p.getType());
        }
        System.out.println(Vehicle.values());
        Vehicle.AUTO.setType("car");
        for (Vehicle p : Vehicle.values()) {
            System.out.println(p + " " + p.getType());
        }
    }
}
