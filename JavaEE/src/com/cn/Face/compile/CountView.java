package com.cn.Face.compile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CountView extends Thread implements ActionListener {
    JFrame main;
    JPanel centre;
    JTextArea t01;
    JButton bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt_0,bt_1,bt_2,bt_3,bt_4,bt_5,bt_6,bt_7,bt_8;
    public void run() {
        main = new JFrame("一个计算器");
        centre = new JPanel(new GridLayout(4,4));
        bt0 = new JButton("0");
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");
        bt_0 = new JButton("+");
        bt_1 = new JButton("-");
        bt_2 = new JButton("x");
        bt_3 = new JButton("/");
        bt_4 = new JButton("=");
        bt_5 = new JButton(".");
        bt_6 = new JButton("(");
        bt_7 = new JButton(")");
        bt_8 = new JButton("Reset");
        t01 = new JTextArea(1,390);

        bt0.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt_0.addActionListener(this);
        bt_1.addActionListener(this);
        bt_2.addActionListener(this);
        bt_3.addActionListener(this);
        bt_4.addActionListener(this);
        bt_5.addActionListener(this);
        bt_6.addActionListener(this);
        bt_7.addActionListener(this);
        bt_8.addActionListener(this);

        main.setLayout(null);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setSize(400,300);
        main.setLocationRelativeTo(null);
        main.setResizable(false);
        main.setVisible(true);
        main.getContentPane().add(centre);
        main.getContentPane().add(bt_6);
        main.getContentPane().add(bt_7);
        main.getContentPane().add(bt_8);
        main.getContentPane().add(t01);
        bt_6.setBounds(0,40,(main.getWidth()-10)/3,20);
        bt_7.setBounds(130,40,(main.getWidth()-10)/3,20);
        bt_8.setBounds(260,40,(main.getWidth()-10)/3,20);
        centre.setBounds(0,60,main.getWidth()-10,main.getHeight()-100);
        t01.setBackground(Color.BLACK);
        t01.setForeground(Color.WHITE);
        t01.setSize(main.getWidth()-10,40);
        t01.setFont(new Font("宋体",Font.BOLD,18));

        centre.add(bt7);
        centre.add(bt8);
        centre.add(bt9);
        centre.add(bt_0);
        centre.add(bt4);
        centre.add(bt5);
        centre.add(bt6);
        centre.add(bt_1);
        centre.add(bt1);
        centre.add(bt2);
        centre.add(bt3);
        centre.add(bt_2);
        centre.add(bt_3);
        centre.add(bt0);
        centre.add(bt_5);
        centre.add(bt_4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() != bt_4 && e.getSource() != bt_8){
            fontStyle(t01,0);
            strJoint(t01, (JButton) e.getSource());
        }else if (e.getSource() == bt_8){
            fontStyle(t01,-1);
        }else {
            if (checkoutBracket(t01)) getTextAndTransmit(t01);
        }
    }

    public void strJoint(JTextArea jTextArea,JButton jButton){
        jTextArea.append(jButton.getText().replace(" ",""));
    }

    public void getTextAndTransmit(JTextArea jTextArea){
        String resu = "";
        Count count = new Count();
        Clip clip = count.pushCount(jTextArea.getText());
        List<String> result = count.countFormula(clip);
        for (String s : result){
            resu += s;
        }
        fontStyle(t01,2);
        jTextArea.setText(resu);
    }

    public boolean checkoutBracket(JTextArea jTextArea) {
        Count count = new Count();
        Clip clip = count.pushCount(jTextArea.getText());
        if (!clip.isFlag()) {
            fontStyle(t01,1);
            return false;
        } else return true;
    }

    //设置样式
    public void fontStyle(JTextArea jTextArea, int i){
        switch (i){
            case -1:
                jTextArea.setText("");
                jTextArea.setForeground(Color.WHITE);
                jTextArea.setFont(new Font("宋体", Font.BOLD,18));
                break;
            case 0:
                jTextArea.setForeground(Color.WHITE);
                jTextArea.setFont(new Font("宋体",Font.BOLD,18));
                break;
            case 1:
                jTextArea.setForeground(Color.RED);
                jTextArea.setText("公式可能存在括号不匹配错误！");
                jTextArea.setFont(new Font("宋体",Font.BOLD,23));
                break;
            case 2:
                jTextArea.setForeground(Color.GREEN);
                jTextArea.setFont(new Font("宋体",Font.BOLD,23));
                break;
        }
    }
}
