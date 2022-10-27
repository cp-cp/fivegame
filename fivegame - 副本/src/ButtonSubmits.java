import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonSubmits extends JPanel {
    private JPanel panel = new JPanel();
    Hand hand = new Hand("Player1", "Player2");
    Chess chessMap = new Chess();
    private JButton[][] buttons = new JButton[20][20];

    public ButtonSubmits() {
        panel.setPreferredSize(new Dimension(850, 900));
        //panel.add(inputLabel);
        for (int i = 1; i <= 15; i++) {
            for (int j = 1; j <= 15; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].addActionListener(new ClickListener());
                buttons[i][j].setPreferredSize(new Dimension(50, 50));
                panel.add(buttons[i][j]);
            }
        }
        add(panel);
        setBackground(Color.GRAY);
    }

    private class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Object source = event.getSource();
            int x = 0, y = 0;
            for (int i = 1; i <= 15; i++) {
                for (int j = 1; j <= 15; j++) {
                    if (source == buttons[i][j]) {
                        x = i;
                        y = j;
                    }
                }
            }
            if (chessMap.map[x][y] == 0) {
                chessMap.Puts(x, y, hand.Player());
                buttons[x][y].setText(chessMap.c[chessMap.map[x][y]] + "");
                if (chessMap.Win(x, y)) {
                    end(hand.pointer);
                } else {
                    hand.change();
                }
            }
        }

        public class JDialogTest extends JDialog {
            public JDialogTest()
            {
                super();
                Container container = getContentPane();
                container.setBackground(Color.white);
                JButton checkButton=new JButton("结束游戏");
                        checkButton.addActionListener(new endListener());
                container.add(checkButton);
                setBounds(120, 120, 100, 100);
            }
        }
        public class endListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                System.exit(0);
            }
        }
            public void end(int winner) {
            JDialogTest jdialog = new JDialogTest();
            jdialog.setVisible(true);
            jdialog.setSize(500,300);
            jdialog.setLocation(500,300);
        }
    }
}