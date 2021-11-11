package com.company;

public class Skelatioin extends Boss {
    private int kolStrel;

    public int getKolStrel() {
        return kolStrel;
    }

    public void setKolStrel(int kolStrel) {
        this.kolStrel = kolStrel;
    }
    public String printlnInfo(){
        return super.printlninfo()+" " + weapon.getWeaponName() + " " + weapon.getWeaponType();
    }
}
