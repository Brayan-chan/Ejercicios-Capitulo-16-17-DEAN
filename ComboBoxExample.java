import javax.swing.*;
import java.awt.*;

public class ComboBoxExample extends JFrame {

    private JComboBox daysBox;
    private JComboBox monthsBox;
    private String[] days = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
    };
    private String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November",
            "December"
    };

    public ComboBoxExample() {
        setTitle("Combo Box Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createContents();
    }

    private void createContents() {
        // Create the combo boxes
        daysBox = new JComboBox(days);
        monthsBox = new JComboBox(months);

        // Create the labels
        JLabel dayLabel = new JLabel("Select a day:");
        JLabel monthLabel = new JLabel("Select a month:");

        // Create the layout
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(dayLabel);
        panel.add(daysBox);
        panel.add(monthLabel);
        panel.add(monthsBox);

        // Add the panel to the frame
        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ComboBoxExample().setVisible(true);
        });
    }
}
