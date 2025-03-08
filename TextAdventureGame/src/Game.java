import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Game {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choicebtnPanel;
    JLabel titleText;
    JButton startButton,choice1,choice2,choice3,choice4;
    JTextArea mainTextArea;

    TitleScreenHandler tsHandler = new TitleScreenHandler();

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
        startButton.addActionListener(tsHandler);
        
        titleNamePanel.add(titleText);
        startButtonPanel.add(startButton);
        

        //container
        con.add(titleNamePanel);
        con.add(startButtonPanel);

        //force the window to repaint
        window.revalidate();
        window.repaint();
        
        

    }

    public void createGameScreen(){
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

            mainTextArea = new JTextArea("This is the main text area");
            mainTextArea.setBounds(100,100,600,250);
            mainTextArea.setBackground(Color.black);
            mainTextArea.setForeground(Color.white);
            mainTextArea.setFont(normalFont);
            mainTextArea.setLineWrap(true);
            mainTextPanel.add(mainTextArea);

        choicebtnPanel = new JPanel();
        choicebtnPanel.setBounds(250,350,300,150);
        choicebtnPanel.setBackground(Color.black);
        choicebtnPanel.setLayout(new GridLayout(4,1));
        con.add(choicebtnPanel);

            choice1 = new JButton("Choice 1");
            choice1.setBackground(Color.black);
            choice1.setForeground(Color.white);
            choice1.setFont(normalFont);
            choicebtnPanel.add(choice1);

            choice2 = new JButton("Choice 2");
            choice2.setBackground(Color.black);
            choice2.setForeground(Color.white);
            choice2.setFont(normalFont);
            choicebtnPanel.add(choice2);

            choice3 = new JButton("Choice 3");
            choice3.setBackground(Color.black);
            choice3.setForeground(Color.white);
            choice3.setFont(normalFont);
            choicebtnPanel.add(choice3);

            choice4 = new JButton("Choice 4");
            choice4.setBackground(Color.black);
            choice4.setForeground(Color.white);
            choice4.setFont(normalFont);
            choicebtnPanel.add(choice4);
        
    }

    public class TitleScreenHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            //Remove titlescreen
            createGameScreen();

        }
    }

}