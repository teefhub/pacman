import java.awt.EventQueue;
import javax.swing.JFrame;

public class Player extends JFrame {

    public Player() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Game());
        
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
    }
}