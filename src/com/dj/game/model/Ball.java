package com.dj.game.model;

import com.dj.framework.util.RandomNumberGenerator;
import com.dj.game.main.GameMain;
import com.dj.game.main.Resources;
import java.awt.Rectangle;

/**
 *
 * @author dannyjones
 */
public class Ball {

    private int x;
    private int y;
    private int width;
    private int height;
    private int velX;
    private int velY;
    private Rectangle rect;
    
    public Ball(int x, int y, int width, int height) {
        
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        
        this.velX = 5;
        this.velY = RandomNumberGenerator.getRandIntBetween(-4, 5);
        rect = new Rectangle(x,y,width,height);
        
    }
    
    public void update() {
        
        this.x += velX;
        this.y += velY;
        correctYCollisions();
        updateRect();
        
    }
    
    public void onCollideWith(Paddle p) {
        
        if(x < GameMain.GAME_WIDTH / 2) {
            
            x = p.getX() + p.getWidth();
            
        } else {
            
            x = p.getX() - width;
            
        }
        
        velX = -velX;
        velY += RandomNumberGenerator.getRandIntBetween(-2,3);
        
    }
    
    public boolean isDead() {
        
        return ( x < 0 || x + width > GameMain.GAME_WIDTH );
        
    }
    
    public void reset() {
        
        x = 300;
        y = 200;
        velX = 5;
        velY = RandomNumberGenerator.getRandIntBetween(-4,5);
        
    }
    
    private void correctYCollisions() {
        
        if(y < 0) {
            
            y = 0;
            
        } else if (y + height > GameMain.GAME_HEIGHT) {
            
            y = GameMain.GAME_HEIGHT - height;
            
        } else {
            
            return;
            
        }
        
        velY = -velY;
        Resources.bounce.play();
        
    }
    
    private void updateRect() {
        
        rect.setBounds(x,y,width,height);
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle getRect() {
        return rect;
    }
    
}
