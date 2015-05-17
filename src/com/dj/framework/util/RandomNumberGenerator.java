package com.dj.framework.util;

import java.util.Random;

/**
 *
 * @author dannyjones
 */
public class RandomNumberGenerator {
    
    private static Random rand = new Random();
    
    public static int getRandIntBetween(int lowerBound, int upperBound) {
        
        return rand.nextInt(upperBound - lowerBound) + lowerBound;
        
    }
    
    public static int getRandIntBetween(int upperBound) {
        
        return rand.nextInt(upperBound);
        
    }
    
}
