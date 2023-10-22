package org.example;

public class Mech {
    private String mechName;

    private Part[] mechParts;
    Mech(String name){mechName=name;mechParts=Part.values();}
}
