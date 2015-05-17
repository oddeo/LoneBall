/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dj.game.main;

//import com.apple.eawt.Application;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author dannyjones
 */
public class GameMain {
    
    public static final String GAME_TITLE = "LoneBall";
    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 450;
    public static Game sGame;
    
    public static void main(String[] args){
        
        JFrame frame = new JFrame(GAME_TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        sGame = new Game(GAME_WIDTH, GAME_HEIGHT);
        frame.add(sGame);
        frame.pack();
 
        frame.setVisible(true);
        
        frame.setIconImage(Resources.iconimage);
        //for mac
        //Application.getApplication().setDockIconImage(new ImageIcon(Resources.iconimage).getImage());
        
    }
    
}
