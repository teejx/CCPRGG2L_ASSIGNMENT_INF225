import javax.swing.JButton;
import javax.swing.JFrame;
import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class TryAgain extends JFrame {
    TryAgain(){

        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();

        tryAgainButton.setText("Try Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        EventHandler handler = new EventHandler();
        tryAgainButton.addActionListener(handler);

        exitButton.setText("Jaehyun");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));
        exitHandler handler2 = new exitHandler();
        exitButton.addActionListener(handler2);

        this.add(tryAgainButton);
        this.add(exitButton);
        
        this.setLayout(new FlowLayout());

        this.setTitle("snake game");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(250, 500);

        this.setLocationRelativeTo(null);

        this.setVisible(true);

        this.setResizable(false);

        this.getContentPane().setBackground(Color.PINK);

       

    }

    private class EventHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            new GameFrame();
            dispose();

        }
    }

    private class exitHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            dispose();
        }
    
    }
}
