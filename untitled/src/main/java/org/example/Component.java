package org.example;

public enum Component {
    ENGINE("Fusion Engine"),
    SHOULDER("Shoulder"),
    UPPERARMACTUATOR("Upper Arm Actuator"),
    LOWERARMACTUATOR("Lower Arm Actuator"),
    HANDACTUATOR("Hand Actuator"),
    WEAPON,
    HEATSINK,
    HIP,
    UPPERLEGACTUATOR,
    LOWERLEGACTUATOR,
    FOOTACTUATOR,
    LIFESUPPORT,
    SENSORS,
    COCKPIT,
    AMMO,
    GYRO,
    NONE;
    private final String compName;
    Component(String ComponentName){compName=ComponentName;}
    Component(Weapon WeaponName){compName=}
}
