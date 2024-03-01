import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class IntercambiarJTextArea {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Intercambiar JTextArea");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear dos JTextArea
        JTextArea msg1 = new JTextArea("Texto inicial en JTextArea 1");
        JTextArea msg2 = new JTextArea("Texto inicial en JTextArea 2");

        // Crear un JButton
        JButton boton = new JButton("Intercambiar");

        // Añadir los componentes a la ventana
        JPanel panel = new JPanel();
        panel.add(msg1);
        panel.add(msg2);
        panel.add(boton);
        ventana.add(panel);

        // Crear un ActionListener para el botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Intercambiar el contenido de los dos JTextArea
                String textoMsg1 = msg1.getText();
                String textoMsg2 = msg2.getText();

                String temp = textoMsg1;
                textoMsg1 = textoMsg2;
                textoMsg2 = temp;

                msg1.setText(textoMsg1);
                msg2.setText(textoMsg2);
            }
        });

        ventana.pack();
        ventana.setVisible(true);
    }
}
