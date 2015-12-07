/**
 * Created by Mohammad Yaqoob.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class TicTacToe extends JFrame implements ActionListener{

    JFrame frame = new JFrame("TIC-TAC-TOE for 2 players!");
    JPanel panel = new JPanel();
    JButton b[][] = new JButton[3][3];

    boolean flag = true;

    public TicTacToe(){
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(new GridLayout(3,3));
        panel = addButtonsToPanel(panel);

        frame.add(panel);
        frame.setVisible(true);
    }

    int b00lock=0;
    int b01lock=0;
    int b02lock=0;
    int b10lock=0;
    int b11lock=0;
    int b12lock=0;
    int b20lock=0;
    int b21lock=0;
    int b22lock=0;

    static int buttonValue[][] = new int[3][3];

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == b[0][0]){

            if(b00lock == 0) {
                if (flagCheck() == true) {
                    b[0][0].setText("X");
                    buttonValue[0][0] = 1;
                    if(buttonValue[0][0] + buttonValue[0][1] + buttonValue[0][2] == 3){

                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[0][0] + buttonValue[1][0] + buttonValue[2][0] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[0][0] + buttonValue[1][1] + buttonValue[2][2] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    flag = false;
                    b00lock=1;

                } else {
                    b[0][0].setText("O");
                    buttonValue[0][0] = 0;
                    if(buttonValue[0][0] + buttonValue[1][0] + buttonValue[2][0] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[0][0] + buttonValue[0][1] + buttonValue[0][2] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[0][0] + buttonValue[1][1] + buttonValue[2][2] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    flag = true;
                    b00lock=1;
                }
            }
        }
        if(e.getSource() == b[0][1]){

            if(b01lock == 0) {
                if (flagCheck() == true) {
                    b[0][1].setText("X");
                    buttonValue[0][1] = 1;
                    if(buttonValue[0][1] + buttonValue[0][0] + buttonValue[0][2] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[0][1] + buttonValue[1][1] + buttonValue[2][1] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }

                    flag = false;
                    b01lock=1;

                } else {
                    b[0][1].setText("O");
                    buttonValue[0][1] = 0;
                    if(buttonValue[0][1] + buttonValue[0][0] + buttonValue[0][2] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[0][1] + buttonValue[1][1] + buttonValue[2][1] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    flag = true;
                    b01lock=1;
                }
            }
        }
        if(e.getSource() == b[0][2]){

            if(b02lock == 0) {
                if (flagCheck() == true) {
                    b[0][2].setText("X");
                    buttonValue[0][2] = 1;
                    if(buttonValue[0][2] + buttonValue[0][1] + buttonValue[0][0] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[0][2] + buttonValue[1][1] + buttonValue[2][0] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[0][2] + buttonValue[1][2] + buttonValue[2][2] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    flag = false;
                    b02lock=1;

                } else {
                    b[0][2].setText("O");
                    buttonValue[0][2] = 0;
                    if(buttonValue[0][2] + buttonValue[0][1] + buttonValue[0][0] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[0][2] + buttonValue[1][1] + buttonValue[2][0] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[0][2] + buttonValue[1][2] + buttonValue[2][2] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    flag = true;
                    b02lock=1;
                }
            }
        }
        if(e.getSource() == b[1][0]){

            if(b10lock == 0) {
                if (flagCheck() == true) {
                    b[1][0].setText("X");
                    buttonValue[1][0] = 1;
                    if(buttonValue[1][0] + buttonValue[1][1] + buttonValue[1][2] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[1][0] + buttonValue[0][0] + buttonValue[2][0] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    flag = false;
                    b10lock=1;

                } else {
                    b[1][0].setText("O");
                    buttonValue[1][0] = 0;
                    if(buttonValue[1][0] + buttonValue[1][1] + buttonValue[1][2] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[1][0] + buttonValue[0][0] + buttonValue[2][0] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    flag = true;
                    b10lock=1;
                }
            }
        }
        if(e.getSource() == b[1][1]){

            if(b11lock == 0) {
                if (flagCheck() == true) {
                    b[1][1].setText("X");
                    buttonValue[1][1] = 1;
                    if(buttonValue[1][1] + buttonValue[1][0] + buttonValue[1][2] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[1][1] + buttonValue[0][1] + buttonValue[2][1] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[1][1] + buttonValue[0][2] + buttonValue[2][0] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[1][1] + buttonValue[0][0] + buttonValue[2][2] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    flag = false;
                    b11lock=1;

                } else {
                    b[1][1].setText("O");
                    buttonValue[1][1] = 0;
                    if(buttonValue[1][1] + buttonValue[1][0] + buttonValue[1][2] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[1][1] + buttonValue[0][1] + buttonValue[2][1] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[1][1] + buttonValue[0][2] + buttonValue[2][0] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[1][1] + buttonValue[0][0] + buttonValue[2][2] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    flag = true;
                    b11lock=1;
                }
            }
        }
        if(e.getSource() == b[1][2]){

            if(b12lock == 0) {
                if (flagCheck() == true) {
                    b[1][2].setText("X");
                    buttonValue[1][2] = 1;
                    if(buttonValue[1][2] + buttonValue[1][1] + buttonValue[1][0] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[1][2] + buttonValue[0][2] + buttonValue[2][2] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    flag = false;
                    b12lock=1;

                } else {
                    b[1][2].setText("O");
                    buttonValue[1][2] = 0;
                    if(buttonValue[1][2] + buttonValue[1][1] + buttonValue[1][0] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[1][2] + buttonValue[0][2] + buttonValue[2][2] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    flag = true;
                    b12lock=1;
                }
            }
        }
        if(e.getSource() == b[2][0]){

            if(b20lock == 0) {
                if (flagCheck() == true) {
                    b[2][0].setText("X");
                    buttonValue[2][0] = 1;
                    if(buttonValue[2][0] + buttonValue[2][1] + buttonValue[2][2] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[2][0] + buttonValue[1][0] + buttonValue[0][0] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[2][0] + buttonValue[1][1] + buttonValue[0][2] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    flag = false;
                    b20lock=1;

                } else {
                    b[2][0].setText("O");
                    buttonValue[2][0] = 0;
                    if(buttonValue[2][0] + buttonValue[2][1] + buttonValue[2][2] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[2][0] + buttonValue[1][0] + buttonValue[0][0] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[2][0] + buttonValue[1][1] + buttonValue[0][2] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    flag = true;
                    b20lock=1;
                }
            }
        }
        if(e.getSource() == b[2][1]){

            if(b21lock == 0) {
                if (flagCheck() == true) {
                    b[2][1].setText("X");
                    buttonValue[2][1] = 1;
                    if(buttonValue[2][1] + buttonValue[2][0] + buttonValue[2][2] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[2][1] + buttonValue[1][1] + buttonValue[0][1] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    flag = false;
                    b21lock=1;

                } else {
                    b[2][1].setText("O");
                    buttonValue[2][1] = 0;
                    if(buttonValue[2][1] + buttonValue[2][0] + buttonValue[2][2] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[2][1] + buttonValue[1][1] + buttonValue[0][1] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    flag = true;
                    b21lock=1;
                }
            }
        }
        if(e.getSource() == b[2][2]){

            if(b22lock == 0) {
                if (flagCheck() == true) {
                    b[2][2].setText("X");
                    buttonValue[2][2] = 1;
                    if(buttonValue[2][2] + buttonValue[2][1] + buttonValue[2][0] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[2][2] + buttonValue[1][2] + buttonValue[0][2] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[2][2] + buttonValue[1][1] + buttonValue[0][0] == 3){
                        JOptionPane.showMessageDialog(frame, "X wins!");
                        System.exit(0);
                    }
                    flag = false;
                    b22lock=1;

                } else {
                    b[2][2].setText("O");
                    buttonValue[2][2] = 0;
                    if(buttonValue[2][2] + buttonValue[2][1] + buttonValue[2][0] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[2][2] + buttonValue[1][2] + buttonValue[0][2] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    else if(buttonValue[2][2] + buttonValue[1][1] + buttonValue[0][0] == 0){
                        JOptionPane.showMessageDialog(frame, "O wins!");
                        System.exit(0);
                    }
                    flag = true;
                    b22lock=1;
                }
            }
        }
    }

    public boolean flagCheck(){
        if(flag == true){
            return true;
        }
        else
            return false;
    }

    public JPanel addButtonsToPanel(JPanel panel){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j] = new JButton("");
                panel.add(b[i][j]);
                b[i][j].addActionListener(this);
            }
        }
        return panel;
    }

    public static void main(String lol[]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                buttonValue[i][j] = -10;
            }
        }
        new TicTacToe();
    }
}