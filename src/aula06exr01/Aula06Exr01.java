package aula06exr01;

import javax.swing.JFrame;

public class Aula06Exr01 {

    public static void main(String[] args) {
        JanelaJogo janela = new JanelaJogo();
        janela.setSize(450, 300);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
