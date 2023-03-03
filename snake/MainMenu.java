import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame{
    MainMenu(){

        // JLabel
        JLabel imageLabel = new JLabel();
        // image from internet that is downloaded
        ImageIcon catImage = new ImageIcon("tenor.gif");
        // set image to label
        imageLabel.setIcon(catImage);


        // JButton
        JButton startButton = new JButton();
        startButton.setText("Press Start");
        startButton.setFont(new Font("Arial", Font.BOLD,25));

        // add event to start button
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        // add label and image to frame
        this.add(imageLabel);
        this.add(startButton);


        this.setLayout(new FlowLayout());
        // Frame Title
        this.setTitle("Snake Game");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame Size
        this.setSize(498, 445);
        // Puts frame in the middle
        this.setLocationRelativeTo(null);
        // Make visible
        this.setVisible(true);
        // Disable resize
        this.setResizable(false);
        // Set Background Color
        this.getContentPane().setBackground(Color.darkGray);
    }
    // event handler (button click for "Press Start")
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            // goes to game frame
            new ColorMenu();

            // Closes frame
            dispose();
        }

    }

}
