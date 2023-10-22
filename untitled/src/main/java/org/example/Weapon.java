package org.example;

public enum Weapon {
    LLASER("Large Laser",8,8,0,5,10,15,false),
    MLASER("Medium Laser",3,5,0,3,6,9,false),
    SLASER("Small Laser",1,3,0,1,2,3,false),
    FLAMER("Flamer",3,2,0,1,2,3,false),
    PPC("PPC",10,10,3,6,12,18,false),
    AUTOCANNON2("AC/2",1,2,4,8,16,24,true),
    AUTOCANNON5("AC/5",1,5,3,6,12,18,true),
    AUTOCANNON10("AC/10",3,10,0,5,10,15,true),
    AUTOCANNON20("AC/20",7,20,0,3,6,9,true),
    MACHINEGUN("Machine Gun",0,2,0,1,2,3,true),
    LRM5("LRM 5",2,1,6,7,14,21,true),
    LRM10("LRM 10",4,1,6,7,14,21,true),
    LRM15("LRM 15",5,1,6,7,14,21,true),
    LRM20("LRM 20",6,1,6,7,14,21,true),
    SRM2("SRM 2",2,2,0,3,6,9,true),
    SRM4("SRM 4",3,2,0,3,6,9,true),
    SRM6("SRM 6",4,2,0,3,6,9,true);



    private final String weaponName;

    public String getWeaponName() {
        return this.weaponName;
    }

    public int getWeaponDamage() {
        return this.weaponDamage;
    }

    public Boolean getWeaponAmmo() {
        return this.weaponAmmo;
    }

    private final int weaponHeat;

    public int getWeaponHeat() {
        return this.weaponHeat;
    }

    private final int weaponDamage;
    private final int weaponMinRange;

    public int getWeaponMinRange() {
        return this.weaponMinRange;
    }

    private final int weaponShoRange;

    public int getWeaponShoRange() {
        return this.weaponShoRange;
    }

    private final int weaponMedRange;

    public int getWeaponMedRange() {
        return this.weaponMedRange;
    }

    private final int weaponLonRange;

    public int getWeaponLonRange() {
        return this.weaponLonRange;
    }

    private final Boolean weaponAmmo;


    Weapon(String weapName,int Heat,int Damage,int minRange, int shoRange, int medRange, int lonRange,Boolean ammo){
        weaponName = weapName;
        weaponHeat=Heat;
        weaponDamage=Damage;
        weaponMinRange=minRange;
        weaponShoRange=shoRange;
        weaponMedRange=medRange;
        weaponLonRange=lonRange;
        weaponAmmo=ammo;}
}
