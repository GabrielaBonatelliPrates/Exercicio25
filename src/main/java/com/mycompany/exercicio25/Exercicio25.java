

package com.mycompany.exercicio25;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Exercicio25 {

    public static void main(String[] args) {
    int soma = 0;
        int numeros[] = new int[20];
        for (int i = 0; i < 20; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número" + i + ":"));
        }
        for (int i = 0; i < 20; i++) {
            soma = soma + numeros[i];
        }

        double media = soma / 20;
        JOptionPane.showMessageDialog(null, "A média é: " + media);   
    }
}
