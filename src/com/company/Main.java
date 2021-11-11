package com.company;

import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss();
        boss.setHp(400);
        boss.setDamage(50);
        boss.weapon.setWeaponName("AK_47");
        boss.weapon.setWeaponType("Wintovka");
        System.out.println(boss.printlnfo());

        Skelatioin skelatioin = new Skelatioin();
        skelatioin.setHp(500);
        skelatioin.setDamage(60);
        skelatioin.weapon.setWeaponName("GSH-18");
        skelatioin.weapon.setWeaponType("Gun");
        skelatioin.printlnfo();
        System.out.println(skelatioin.printlnfo());
    }
}
