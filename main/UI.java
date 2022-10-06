package Main;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class UI {

    GameManager gm;

    JFrame window = new JFrame();
    JPanel[] bgPanel = new JPanel[1];
    JLabel[] bgLabel = new JLabel[1]; 

    public UI(GameManager gm)
    {
        this.gm = gm;
        createWindow();

        GamePanel gamePanel = new GamePanel();        
        window.add(gamePanel);
        createBackground();
    }


    public void createWindow()
    {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 800);
        window.setTitle("Really Bad Chess");

        window.setResizable(false);
        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setVisible(true);       
    }

    public void createBackground()
    {
        bgPanel[0]= new JPanel();
        bgPanel[0].setBounds(0,0,800,800);
        bgPanel[0].setLayout(null);
        bgPanel[0].setBackground(Color.BLACK);
        window.add(bgPanel[0]);

        bgLabel[0] = new JLabel();
        bgLabel[0].setBounds(0,0,800,800);

        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("chessBoard.png"));
        bgLabel[0].setIcon(bgIcon);

        bgPanel[0].add(bgLabel[0]);
    }

}
