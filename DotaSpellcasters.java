/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dotaspellcasters;

/**
 *
 * @author User
 */
public class DotaSpellcasters {
    public static void main(String[] args) {
        // Membuat objek hero Dota 2
        VoidSpirit voidSpirit = new VoidSpirit();
        CrystalMaiden cm = new CrystalMaiden();
        Lina lina = new Lina();
        Muerta muerta = new Muerta();

        // Menampilkan informasi dan skill setiap hero
        voidSpirit.info();
        voidSpirit.gunakanSkillUtama();
        voidSpirit.gunakanSpell();
        voidSpirit.ultimate();

        System.out.println(); // Spacer

        cm.info();
        cm.gunakanSkillUtama();
        cm.gunakanSpell();
        cm.ultimate();

        System.out.println(); // Spacer

        lina.info();
        lina.gunakanSkillUtama();
        lina.gunakanSpell();
        lina.ultimate();

        System.out.println(); // Spacer

        muerta.info();
        muerta.gunakanSkillUtama();
        muerta.gunakanSpell();
        muerta.ultimate();
        
        System.out.println(" setelah war hebat dikarenakan Techies AFK di base jadinya kalah teamfight karena di babat habis phantom assasin musuh huhu so sad :(");
    }
}
