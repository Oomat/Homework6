package com.company;

public class Boss extends GameEntity{
   Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printlnfo(){
         return super.printlninfo()+" " + weapon.getWeaponName() + " " + weapon.getWeaponType();
    }
}
