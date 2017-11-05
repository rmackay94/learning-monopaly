/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopolylearning;

/**
 *
 *@author Robbie
 *
 * Robbie Mackay
 * 16003059
 * HND Computer Science
 * 
 * 03-Nov-2017
 * Version X
 */
public class Tile {
    
    private int xPos;
    private int yPos;
    private int height;
    private int width;
    
    
    Tile(int newX, int newY, int newHeight, int newWidth) {
        xPos = newX;
        yPos = newY;
        height = newHeight;
        width = newWidth;   
    }
    
    public void setX(int newX) {
        
        xPos = newX;
        
    }
}
