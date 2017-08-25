package aula06exr01;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class JanelaJogo extends JFrame {
        
    private final JRadioButton pedra;
    private final JRadioButton papel;
    private final JRadioButton tesoura;
    private final JButton calcular;
    private JLabel etiqueta = new JLabel();
    
    public JanelaJogo() throws HeadlessException {
        super ("Jogo Pedra, Papel e Tesoura");
        setLayout(new FlowLayout());
        
        Icon iPedra = new ImageIcon("resources/pedra.png");
        Icon iPedraX = new ImageIcon("resources/pedra_1.png");
        Icon iPapel = new ImageIcon("resources/papel.png");
        Icon iPapelX = new ImageIcon("resources/papel_1.png");
        Icon iTesoura = new ImageIcon("resources/tesoura.png");
        Icon iTesouraX = new ImageIcon("resources/tesoura_1.png");
        
        pedra = new JRadioButton("Pedra", iPedraX, true);
        pedra.setSelectedIcon(iPedra);
        papel = new JRadioButton("Papel", iPapelX, false);
        papel.setSelectedIcon(iPapel);
        tesoura = new JRadioButton("Tesoura", iTesouraX, false);
        tesoura.setSelectedIcon(iTesoura);
        
        calcular = new JButton("Calcular");
        
        add(pedra);
        add(papel);
        add(tesoura);
        add(calcular);
        
        ButtonGroup bgEstilo = new ButtonGroup();
        
        bgEstilo.add(pedra);
        bgEstilo.add(papel);
        bgEstilo.add(tesoura);
        
        calculaVencer vencedor = new calculaVencer();
        pedra.addItemListener(vencedor);
        papel.addItemListener(vencedor);
        tesoura.addItemListener(vencedor);
        calcular.addActionListener(vencedor);
    }

    private class calculaVencer implements ActionListener, ItemListener {

        private void oVencedor() throws HeadlessException, NumberFormatException
        {
            Random r1 = new Random();
            int i = r1.nextInt(3);
            
             if (pedra.isSelected())
            {
                switch (i)
                {
                    case 0:
                        etiqueta.setText("Vencedor foi a Pedra");
                        break;
                    case 1:
                        etiqueta.setText("Vencedor foi a Papel");
                        break;
                    case 2: 
                        etiqueta.setText("Vencedor foi a Tesoura");
                }
                
            }
            else if (papel.isSelected() && i == 1)
            {
                switch (i)
                {
                    case 0:
                        etiqueta.setText("Vencedor foi a Pedra");
                        break;
                    case 1:
                        etiqueta.setText("Vencedor foi a Papel");
                        break;
                    case 2: 
                        etiqueta.setText("Vencedor foi a Tesoura");
                }
            }
            else if (tesoura.isSelected())
            {
                switch (i)
                {
                    case 0:
                        etiqueta.setText("Vencedor foi a Pedra");
                        break;
                    case 1:
                        etiqueta.setText("Vencedor foi a Papel");
                        break;
                    case 2: 
                        etiqueta.setText("Vencedor foi a Tesoura");
                }
            }
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            oVencedor();
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
           oVencedor();
        }
    }
    
}
