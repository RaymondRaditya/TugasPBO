/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotaspellcasters;

// Class Lina mengimplementasikan HeroDota dan Spell
class Lina extends HeroDota implements Spell {
    public Lina() {
        super("Lina");
    }

    @Override
    public void gunakanSkillUtama() {
        System.out.println(nama + " menggunakan Dragon Slave.");
    }

    @Override
    public void gunakanSpell() {
        System.out.println(nama + " menggunakan Ethereal Blade!");
    }

    @Override
    public void ultimate() {
        System.out.println(nama + " mengeluarkan Laguna Blade!");
    }
}
