package com.dj.game.state;

import com.dj.game.main.Resources;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author dannyjones
 */
public class WinState extends State {

    @Override
    public void init() {
        
        System.out.println("Entered win state");
        
    }

    @Override
    public void update() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void render(Graphics g) {
        
        g.drawImage(Resources.youwin, 0, 0, null);
        
    }

    @Override
    public void onClick(MouseEvent e) {
        
        setCurrentState(new PlayState());
    }

    @Override
    public void onKeyPress(KeyEvent e) {
        
        System.out.println("Key Press!");
    }

    @Override
    public void onKeyRelease(KeyEvent e) {
        
        System.out.println("Key Release!");
    }
    
}
