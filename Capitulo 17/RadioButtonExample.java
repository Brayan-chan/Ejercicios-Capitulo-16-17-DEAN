import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample {

    public static void main(String[] args) {
        // Crear un ButtonGroup
        ButtonGroup genderGroup = new ButtonGroup();

        // Crear objetos JRadioButton
        JLabel genderJLabel = new JLabel("Gender");
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");

        // Agregar los botones de radio al ButtonGroup
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        
        // Agregar los botones de radio a un panel
        JPanel panel = new JPanel();
        panel.add(genderJLabel);
        panel.add(maleRadioButton);
        panel.add(femaleRadioButton);

        // Seleccionar un botón de radio por defecto
        maleRadioButton.setSelected(true);

        // Agregar un ActionListener a los botones de radio
        maleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Se ha seleccionado el botón de radio "Male"
                System.out.println("Male seleccionado");
            }
        });

        femaleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Se ha seleccionado el botón de radio "Female"
                System.out.println("Female seleccionado");
            }
        });

        // Agregar el panel a un JFrame
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
