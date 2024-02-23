import java.awt.*;

import java.awt.event.*;

public class EventHandling extends WindowAdapter implements ActionListener {

    Frame f;
    TextField tf;

    EventHandling() {
        // Create components
        f = new Frame();
        f.addWindowListener(this);

        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);

        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);

        // Register listener
        b.addActionListener(this); // Passing current instance

        // Add components and set size, layout, and visibility
        f.add(b);
        f.add(tf);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public static void main(String args[]) {
        new EventHandling();
    }
}
