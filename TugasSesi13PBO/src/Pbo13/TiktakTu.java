package Pbo13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TiktakTu extends JFrame implements ActionListener{
    boolean x = true;
    JButton[] btn = new JButton[9];
    GridLayout gl = new GridLayout(3,3);

    TiktakTu(){
        super("Tic-Tac-Toe");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(gl);
        
        for(int i = 0; i < 9; i++){
            btn[i] = new JButton();
            btn[i].setBackground(Color.gray);
            btn[i].addActionListener(this);
            add(btn[i]);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        TiktakTu t = new TiktakTu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
        for (int i = 0; i < 9; i++){
            if(e.getSource() == btn[i] && btn[i].getText().isEmpty()){
                if(x){
                    btn[i].setText("X");
                    x = !x;
                }
                else{
                    btn[i].setText("O");
                    x = !x;
                }
                btn[i].setBackground(Color.white);
            }
        }

        
    }

}