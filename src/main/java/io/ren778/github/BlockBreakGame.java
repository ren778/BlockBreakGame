package io.ren778.github;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BlockBreakGame {
    JFrame frame;
    static BlockBreakGame Class;
    CardLayout layout;

    Border border = BorderFactory.createLineBorder(Color.BLACK, 2);

    TitlePanel titlePanel;
    GamePanel gamePanel;
    public static void main(String[] args) {
        BlockBreakGame game = new BlockBreakGame();
        game.init();
        game.frame.setVisible(true);
    }

    BlockBreakGame() {
        Class = this;
        frame = new JFrame("Block Break");
        frame.setSize(new Dimension(480, 640));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        layout = new CardLayout();
        frame.setLayout(layout);
    }

    public void init() {
        titlePanel = new TitlePanel();
        frame.add(titlePanel, "Title");

        gamePanel = new GamePanel();
        frame.add(gamePanel, "Game");

        layout.show(this.frame.getContentPane(), "Title");
        titlePanel.requestFocus();

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

        JLabel titleLabel = new JLabel("Block Break!!");
        titleLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
        titleLabel.setBounds(0, 100, BlockBreakGame.Class.frame.getWidth(), 50);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBorder(BlockBreakGame.Class.border);
        this.add(titleLabel);

        JButton playButton = new JButton("Play!");
        playButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 30));
        playButton.setBounds(0,0, 100, 50);
        this.add(playButton);
    }

    public void Update() {

    }


}

class GamePanel extends JPanel {
    GamePanel() {
        this.setBackground(Color.black);
        this.setLayout(null);
    }

    public void Update() {

    }
}