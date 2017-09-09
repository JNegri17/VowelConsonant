/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testactionlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestActionListener extends JFrame implements ActionListener
{
     private final int WIDTH = 250;
    private final int HEIGHT = 250;
   JButton[] buttons = new JButton[12];
JLabel output = new JLabel("Hello");
    public TestActionListener()
    {
      
        
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        Container con = getContentPane();
        setLayout(new GridLayout(2,2));
        
        
        buttons[0] = new JButton("A");
        buttons[0].addActionListener(this);
        buttons[1] = new JButton("B");
                buttons[1].addActionListener(this);
        buttons[2] = new JButton("C");
             buttons[2].addActionListener(this);
        buttons[3] = new JButton("D");
                buttons[3].addActionListener(this);
        buttons[4] = new JButton("E");
                buttons[4].addActionListener(this);
        buttons[5] = new JButton("F");
                buttons[5].addActionListener(this);

        buttons[6] = new JButton("G");
                buttons[6].addActionListener(this);

        buttons[7] = new JButton("H");
                buttons[7].addActionListener(this);

        buttons[8] = new JButton("I");
                buttons[8].addActionListener(this);

        buttons[9] = new JButton("J");
                buttons[9].addActionListener(this);

        buttons[10] = new JButton("K");
                buttons[10].addActionListener(this);

        buttons[11] = new JButton("L");
                buttons[11].addActionListener(this);

        
        Random r = new Random();
        int b1 = r.nextInt(12);
        int b2 = r.nextInt(12);
        int b3 = r.nextInt(12);
        int b4 = r.nextInt(12);
        
        int b5 = r.nextInt(12);
        int b6 = r.nextInt(12);
        int b7 = r.nextInt(12);
        int b8 = r.nextInt(12);
        
       
        
        int f = r.nextInt(12);
        //System.out.println(b1);
        
        add(panel1, BorderLayout.WEST);
        con.add(panel2, BorderLayout.CENTER);
        con.add(panel3, BorderLayout.EAST);
       panel1.add(buttons[b1]);
       panel1.add(buttons[b2]);
       panel1.add(buttons[b3]);
       panel1.add(buttons[b4]);
   


     panel2.add(buttons[b5]);
     panel2.add(buttons[b6]);
     panel2.add(buttons[b7]);
     panel2.add(buttons[b8]);
     
     panel3.add(output);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source == buttons[0] || source == buttons[4] || source == buttons[8]){
            output.setText("Vowel");
        }
        else{
            output.setText("Consonant");
        }
        
                
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestActionListener frame = new TestActionListener();
        frame.setVisible(true);
    }
    
}
