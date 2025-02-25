/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotaspellcasters;

// Class Crystal Maiden mengimplementasikan HeroDota dan Spell
class CrystalMaiden extends HeroDota implements Spell {
    public CrystalMaiden() {
        super("Crystal Maiden");
    }

    @Override
    public void gunakanSkillUtama() {
        System.out.println(nama + " mengeluarkan Frostbite.");
    }

    @Override
    public void gunakanSpell() {
        System.out.println(nama + " menggunakan Glimmer Cape!");
        System.out.println(nama + " Menggunakan Blink Dagger!");
    }

    @Override
    public void ultimate() {
        System.out.println(nama + " mengaktifkan Freezing Field!");
    }
}

