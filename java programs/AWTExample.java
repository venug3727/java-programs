import java.awt.*;

import java.awt.event.*;

public class AWTExample extends WindowAdapter {

    Frame f;

    AWTExample() {

        f = new Frame();

        f.addWindowListener(this);

        Label label = new Label("Employee id:");

        Button button = new Button("Submit");

        TextField textField = new TextField();

        label.setBounds(20, 80, 80, 30);

        textField.setBounds(20, 100, 80, 30);

        button.setBounds(100, 100, 80, 30);

        f.add(button);

        f.add(label);

        f.add(textField);

        f.setSize(400, 300);

        f.setTitle("Employee info");

        f.setLayout(null);

        f.setVisible(true);

    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public static void main(String[] args) {
        AWTExample awt = new AWTExample();
    }
}
