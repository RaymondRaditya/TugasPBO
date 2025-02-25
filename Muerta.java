/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotaspellcasters;

// Class Muerta mengimplementasikan HeroDota dan Spell
class Muerta extends HeroDota implements Spell {
    public Muerta() {
        super("Muerta");
    }

    @Override
    public void gunakanSkillUtama() {
        System.out.println(nama + " menembakkan Dead Shot.");
    }

    @Override
    public void gunakanSpell() {
        System.out.println(nama + " Menggunakan Zirah BLack King Bar!");
    }

    @Override
    public void ultimate() {
        System.out.println(nama + " memasuki Wailing Revenant mode!");
    }
}
