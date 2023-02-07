/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacetest;

/**
 *
 * @author peter
 */
public class InterfaceTest {

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();
        Card card = new Card();

        Turnable[] turnables = new Turnable[]{leaf, page, pancake, card};

        for (Turnable turnable : turnables) {
            turnable.turn();
        }
    }
}
