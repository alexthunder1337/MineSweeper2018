package com.MineSweeper;

import javax.swing.*;

public class MineSweeper extends JFrame {
    public static void main(String[] args) {
        new MineSweeper().setVisible(true);
    }

    private MineSweeper(){
        initFrame();
    }
    private void initFrame (){
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mine Sweeper 2018");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
