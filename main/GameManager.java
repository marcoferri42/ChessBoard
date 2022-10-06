package Main;

public class GameManager 
{

    UI ui = new UI(this);

    public static void main(String[] args) {
      new GameManager();
        
      GamePanel gamePanel = new GamePanel();  
      gamePanel.startGameThread();    

      
    }


    public GameManager()
    {
      // Make GameManager
    }
}

