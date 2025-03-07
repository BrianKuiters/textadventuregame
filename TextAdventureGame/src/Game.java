import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel;
    JLabel titleText;
    JButton startButton;

    Font titleFont = new Font("Gothic", Font.PLAIN, 90);
    Font btnFont = new Font("Gothic", Font.PLAIN, 30);
    Font normalFont = new Font("Gothic", Font.PLAIN, 25);

    public static void main(String[] args) {

        new Game();
    }

    public Game() {

        // Game window aanmaken
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true); //Zonder dit zie je de window niet
        this.con = window.getContentPane();
        //Titel van het spel
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,150);
        titleNamePanel.setBackground(Color.black);
        titleText = new JLabel("ADVENTURE");
        titleText.setForeground(Color.white);
        titleText.setFont(titleFont);
        
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(btnFont);
        
        titleNamePanel.add(titleText);
        startButtonPanel.add(startButton);
        

        //container
        con.add(titleNamePanel);
        con.add(startButtonPanel);

        //force the window to repaint
        window.revalidate();
        window.repaint();
        
        

    }

}