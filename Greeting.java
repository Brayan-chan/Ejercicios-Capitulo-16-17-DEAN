//Ejercicio 3 del capítulo 17. Modificación de FlowLayout a BorderLayout

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Greeting extends JFrame {

    private static final int WIDTH = 300;
    private static final int HEIGHT = 100;

    private JTextField nameBox; 
    private JLabel greeting; 

    public Greeting() {
        setTitle("Greeting");
        setSize(WIDTH, HEIGHT);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    }

    private void createContents() {
        JLabel namePrompt = new JLabel("¿Cómo te llamas?");
        nameBox = new JTextField(15);
        greeting = new JLabel();

        add(namePrompt, BorderLayout.NORTH);
        add(nameBox, BorderLayout.CENTER);
        add(greeting, BorderLayout.SOUTH);

        nameBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameBox.getText();
                greeting.setText("Encantado de conocerte, " + name + "!");
            }
        });
    }

    public static void main(String[] args) {
        new Greeting();
    }
}