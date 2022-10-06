package Main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class UI {

    GameManager gm;

    JFrame window = new JFrame();
    JPanel[] bgPanel = new JPanel[1];
    JLabel[] bgLabel = new JLabel[1]; 

    public UI(GameManager gm) throws IOException {
        this.gm = gm;
        Graphics g = new Graphics();

        JFrame myWindow = this.createWindow();

        BufferedImage img = ImageIO.read(new File("bin/chessBoard.png"));
        JLabel background = new JLabel(new ImageIcon(img));

        myWindow.paint(g.drawImage(img, 0,0));

        /**
         * GamePanel gamePanel = new GamePanel();
         *         window.add(gamePanel);
         *         createBackground();
         */

    }


    public JFrame createWindow() throws IOException {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 800);
        window.setTitle("Really Bad Chess");

        window.setResizable(false);
        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        return window;
    }

    public JPanel createPanel(String name) throws IOException {
        bgPanel[0]= new JPanel();
        bgPanel[0].setBounds(0,0,800,800);
        bgPanel[0].setLayout(null);
        bgPanel[0].setBackground(Color.BLACK);

        bgLabel[0] = new JLabel();
        bgLabel[0].setBounds(0,0,800,800);



        return bgPanel[0];
    }

}
