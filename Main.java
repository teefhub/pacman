import java.awt.EventQueue;
import javax.swing.JFrame;

class Main{
    public static void main(String[] args) {
            EventQueue.invokeLater(() -> {
                Player ex = new Player();
                ex.setVisible(true);
            });
        }
}