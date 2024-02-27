import javax.swing.*;
import java.awt.*;

public class BorderLayoutExercise extends JFrame {

    public BorderLayoutExercise() {
        setTitle("Border Layout Exercise");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Add buttons instead of labels
        add(new JButton("Bob the button"), BorderLayout.LINE_START);
        add(new JButton("Benji the button"), BorderLayout.LINE_END);
        add(new JButton("Beatrice the button"), BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExercise();
    }
}