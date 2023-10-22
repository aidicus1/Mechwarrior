package org.example;

import javax.lang.model.element.Name;

public enum Component {
    ENGINE("Fusion Engine"),
    SHOULDER("Shoulder"),
    UPPERARMACTUATOR("Upper Arm Actuator"),
    LOWERARMACTUATOR("Lower Arm Actuator"),
    HANDACTUATOR("Hand Actuator"),
    HEATSINK("Heat Sink"),
    HIP("Hip"),
    UPPERLEGACTUATOR("Upper Leg Actuator"),
    LOWERLEGACTUATOR("Lower Leg Actuator"),
    FOOTACTUATOR("Foot Actuator"),
    LIFESUPPORT("Life support"),
    SENSORS("Sensors"),
    COCKPIT("Cockpit"),
    GYRO("Gyro"),
    NONE("Roll Again"),
    DESTROYED("destroyed");
    private final String compName;

    public String getComponentName(){
        return this.compName;
    }
    Component(String ComponentName){compName=ComponentName;}

    Component(String WeaponName, int ammoAmount) {
        String weaponName = WeaponName;
        int Ammo=ammoAmount;
        compName="ammo "+WeaponName+" "+String.valueOf(ammoAmount);

    }
}
