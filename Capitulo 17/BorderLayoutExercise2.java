import javax.swing.*;
import java.awt.*;

public class BorderLayoutExercise2 extends JFrame {

    public BorderLayoutExercise2() {
        setTitle("Border Layout Exercise");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Add buttons instead of labels
        add(new JButton("Bob the button"), BorderLayout.NORTH);
        add(new JButton("Benji the button"), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExercise2();
    }
}