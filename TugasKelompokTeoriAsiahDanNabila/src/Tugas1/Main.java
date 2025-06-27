/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s1 = new Circle(2.5, "blue", false);
        Shape s2 = new Rectangle(3.0, 4.0, "green", true);
        Shape s3 = new Square(5.0, "yellow", true);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    
}
