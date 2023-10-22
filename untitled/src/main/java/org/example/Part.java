package org.example;

public enum Part {
    LEFTARM("Left Arm",true),
    RIGHTARM("Right Arm",true),
    HEAD("Head",false),
    CENTRETORSO("Centre Torso",true),
    LEFTTORSO("Left torso", true),
    RiGHTTORSO("Right Torso",true),
    LEFTLEG("Left Leg", false),
    RIGHTLEG("Right Leg", false);

    private final String partName;
    private final Boolean partType;
    public boolean getPartType;

    public String getPartName() {return this.partName;}
    public Boolean getPartType() {return this.partType;}
    Part(String pName, boolean type){partName = pName; partType =type;}
}
