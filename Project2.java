import javax.swing.*; // For GUI
import java.awt.*; // Components, layout and colors etc
import java.awt.event.ActionEvent; // Represent an action (Button click)
import java.awt.event.ActionListener;  // Do the action -- button slicks

public class Project2 implements ActionListener {

    private int klikk = 0;
    private JLabel label = new JLabel("Antall klikk: 0");
    private  JFrame frame = new JFrame(); // Creates a window (JFrame) -main frame of the GUI

    Project2() {

        JButton button = new JButton("Klikk her!!");
        button.addActionListener(this);


        JPanel panel = new JPanel()
                ;
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String []Args){


        new Project2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        klikk ++;
        label.setText("Antall klikk: " + klikk);
    }
}




