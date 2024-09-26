/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labor3.Masodfoku_egyenlet;

/**
 *
 * @author marosandor
 */
public class Teszt_equation {
    public static void main(String[] args) {
        QuadraticEquation q1 = new QuadraticEquation(2, -4, 5);
        QuadraticEquation q2 = new QuadraticEquation(2, 2, 2);

        System.out.println("x1=" + q1.getRoot1());
        System.out.println("x2=" + q1.getRoot2());
        System.out.println(q1);

        // Házi: írjunk bele if utasításokat, úgy hogy a q1 kiírása szép legyen, legyen meg minden előjel, összeadás, stb!
    }
}
