package sesionalciviaed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;


public class SesionAlciviaED_PILAS {

   
    public static void main(String[] args) {
        //DECLRACION DE PILA
        Stack <Integer> pilaAlcivia = new Stack<>();
        pilaAlcivia.push(100);
        pilaAlcivia.push(150);
        pilaAlcivia.push(200);
        pilaAlcivia.push(250);
        pilaAlcivia.push(300);
        
        JOptionPane.showMessageDialog(null,"datos en pila ordenada es: \n"+pilaAlcivia);

        JOptionPane.showMessageDialog(null,"Autor: Alcivia Pacheco Luis");


       
    }
    
}
