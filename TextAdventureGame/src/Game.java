import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {

    JFrame window;
    Container con;
    JPanel titleNamePanel;
    JLabel titleText;
    Font titleFont = new Font("Gothic", Font.PLAIN, 90);

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
        titleNamePanel.setBackground(Color.blue);
        titleText = new JLabel("ADVENTURE");
        titleText.setForeground(Color.white);
        titleText.setFont(titleFont);
        titleNamePanel.add(titleText);
        con.add(titleNamePanel);

        titleNamePanel.setVisible(true);
        titleText.setVisible(true);

    }

}