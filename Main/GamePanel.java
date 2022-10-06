package Main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    // Screen Settings
    
    final int originalTileSize = 10;  // blocco pixel 16x16
    final int scale = 10;

    final int tileSize = originalTileSize * scale; // blocco scalato 48x48
    final int screenWidth = tileSize * 8; 
    final int screenHeight = tileSize * 8;

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setDoubleBuffered(true);

    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }


    public void run() {
        while(gameThread != null) {
            //System.out.print("Running\n");

            update();
            repaint();
        
        }
        
    }

    /*
        nel loop dentro run facciamo tante cose,
        tra cui gli UPDATE delle informazioni di gioco
        e y DRAW che l'utente vede nel GamePanel
    */

    private void update() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // SUPER -> JPanel
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.BLUE);

        drawChessBoard(g2);

        g2.dispose();
    }

    private void drawChessBoard(Graphics2D g2){
        for(int y = 0; y<8; y++) {
            if(y%2 == 0) {
                for(int x = 0; x<8; x=x+2){
                    g2.fillRect( x*tileSize, y*tileSize, tileSize, tileSize);
                }
            }
            else {
                for(int x = 1; x<8; x=x+2) {
                    g2.fillRect( x*tileSize, y*tileSize, tileSize, tileSize);
                }
            }
        }
    }

}
