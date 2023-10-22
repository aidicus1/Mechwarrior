package org.example;

public enum Part {
    LEFTARM("Left Arm",true),
    RIGHTARM("Right Arm",true),
    HEAD("Head",false),
    CENTRETORSO("Centre Torso",true),
    LEFTTORSO("Left torso",true),
    RiGHTTORSO("Right Torso",true),
    LEFTLEG("Left Leg", false),
    RIGHTLEG("Right Leg", false);

    private final String partName;
    private MechPart[] components;
    public boolean getPartType;

    public String getPartName() {return this.partName;}

    Part(String pName, boolean type){partName = pName;
        new MechPart(type);}
}
