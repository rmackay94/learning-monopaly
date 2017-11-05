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
 * Version 1
 */
public class Board {
    
    Tile tiles[];
    
    Board() {
        tiles[0] = new ActionTile();
        tiles[1] = new Tile(0,0,10,10);
    }
}
