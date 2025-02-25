    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotaspellcasters;


// Abstract class HeroDota
abstract class HeroDota {
    protected String nama;

    public HeroDota(String nama) {
        this.nama = nama;
    }

    // Method abstrak
    public abstract void gunakanSkillUtama();

    // Method umum
    public void info() {
        System.out.println("Hero: " + nama);
    }
}
