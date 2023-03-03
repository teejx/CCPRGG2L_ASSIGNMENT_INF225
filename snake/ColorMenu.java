import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import java.awt.*;

public class ColorMenu extends JFrame{

    private String[] colorNameArray = {"GREY", "LIGHT GREY", "WHITE", "PINK"};
    private Color[] colorListArray = {Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.PINK};
    JList colorList;

    ColorMenu(){

        JLabel label = new JLabel();
        label.setText("Choose your color");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        // JList
        colorList = new JList(colorNameArray);
        colorList.setFont(new Font("Arial", Font.BOLD, 25));
        // Allows only one selection in the list
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Add event
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

        this.add(colorList);

        this.setLayout(new FlowLayout());

        this.setTitle("snake game");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(250, 500);

        this.setLocationRelativeTo(null);

        this.setVisible(true);

        this.setResizable(false);

        this.getContentPane().setBackground(Color.PINK);
    }

    private class EventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGColor = colorListArray[colorList.getSelectedIndex()];

            new GameFrame();
            
            dispose();
        }
    }
        
}
    