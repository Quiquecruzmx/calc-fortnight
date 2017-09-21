/**
 * Calculadora
 */

import javax.swing.JFrame;

public class Calculadora {

    public Calculadora () {
        JFrame window = new JFrame("Calculadora");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setSize(300, 300);
        
    }
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        Calculadora calcu = new Calculadora();
    }
}