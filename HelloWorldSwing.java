import javax.swing.*;        
import java.awt.*; //Includes GridLayout and Dimension
import java.awt.event.*;

public class HelloWorldSwing implements ActionListener {

    public HelloWorldSwing(){
        System.out.println("Created");
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Construct your query");
        label.setVisible(true); 
        panel.add(label);
        String[] choices = { "Highest","Lowest", "Average"};
        JComboBox<String> cb = new JComboBox<String>(choices);
        cb.setVisible(true);
        panel.add(cb);
        JButton btn = new JButton("Query");
        panel.add(btn);
        btn.addActionListener(this);
        frame.getContentPane().add(panel);

        //Add the ubiquitous "Hello World" label.
        //JLabel label2 = new JLabel("Hello World");
        //frame.getContentPane().add(label2);
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked.");
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloWorldSwing h = new HelloWorldSwing();
                h.createAndShowGUI();
            }
        });
    }
}