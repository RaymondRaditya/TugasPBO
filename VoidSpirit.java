/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotaspellcasters;

// Class Void Spirit mengimplementasikan HeroDota dan Spell
class VoidSpirit extends HeroDota implements Spell {
    public VoidSpirit() {
        super("Void Spirit");
    }

    @Override
    public void gunakanSkillUtama() {
        System.out.println(nama + " menggunakan Resonant Pulse.");
    }

    @Override
    public void gunakanSpell() {
        System.out.println(nama + " mengaktifkan Dagon!");
    }

    @Override
    public void ultimate() {
        System.out.println(nama + " melepaskan Astral Step!");
    }
}

