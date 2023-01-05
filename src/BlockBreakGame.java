import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BlockBreakGame {
    public static JFrame frame;
    CardLayout layout;

    public static Border border = BorderFactory.createLineBorder(Color.BLACK, 2);

    TitlePanel titlePanel;
    GamePanel gamePanel;
    public static void main(String[] args) {
        BlockBreakGame game = new BlockBreakGame();
        game.init();
        game.frame.setVisible(true);
    }

    BlockBreakGame() {
        frame = new JFrame("Block Break");
        frame.setSize(new Dimension(480, 640));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        layout = new CardLayout();
        frame.setLayout(layout);

        titlePanel = new TitlePanel();
        frame.add(titlePanel, "Title");

        gamePanel = new GamePanel();
        frame.add(gamePanel, "Game");
    }

    public void init() {
        layout.show(this.frame.getContentPane(), "Title");
        titlePanel.requestFocus();

        titlePanel.Init();
        gamePanel.Init();

        Timer timer = new Timer(10, (e) -> update());
        timer.start();
    }

    public void update() {
        titlePanel.Update();
        gamePanel.Update();
    }
}

class TitlePanel extends JPanel {
    TitlePanel() {
        this.setBackground(Color.white);
        this.setLayout(null);
    }

    public void Init() {
        JLabel titleLabel = new JLabel("Block Break!!");
        titleLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
        titleLabel.setBounds(0, 100, BlockBreakGame.frame.getWidth(), 50);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBorder(BlockBreakGame.border);
        this.add(titleLabel);
    }

    public void Update() {

    }


}

class GamePanel extends JPanel {
    GamePanel() {
        this.setBackground(Color.black);
        this.setLayout(null);
    }

    public void Init() {

    }

    public void Update() {

    }
}