import javax.swing.*;
import java.util.Scanner;

/*
    How to design a go-bang with Java?
    Today is 8th,Oct,2022.
    cp_cp built the programme.
**********************************************
Main Part:
-------------------
- 1. The structure of GUI / to be learnt
    a. demarcate boundaries
        size 20*20?
    b. the buttons
    c. pictures
- 2. The basis of game logic /simple
    a. store
    b.
 */
public class Main
{

    public  static void main(String[] args)
    {
        JFrame frame=new JFrame("五子棋");
        frame.setSize(500,300);
        frame.setLocation(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口后软件关闭
        frame.getContentPane().add(new ButtonSubmits());
        frame.setVisible(true);
    }
}