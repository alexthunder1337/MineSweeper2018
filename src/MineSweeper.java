import javax.swing.*;
import java.awt.*;

public class MineSweeper extends JFrame {
    private JPanel panel;
    private final int COLS =15;
    private final int ROWS = 1;
    private final int IMAGE_SIZE = 50;
    public static void main(String[] args) {
        new MineSweeper();
    }
    private MineSweeper(){
        initPanel();
        initFrame();
    }
    private void initPanel(){
        panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(getImage("bomb"),0,0,this);
            }
        };
        panel.setPreferredSize(new Dimension(COLS*IMAGE_SIZE,
                ROWS*IMAGE_SIZE));
        add (panel);
    }
    private void initFrame (){
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mine Sweeper 2018");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    private Image getImage (String img_name){
        String filename = "img/" + img_name + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        return icon.getImage();
    }
}
