/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopolylearning;

import java.util.Random;

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
public class Player {
    
    private int playerNumber;
    private int playerToken;
    private String playerName;
    private int playerBalance;
    private boolean playerInJail;
    private boolean playerGonePastGo;
    private int doublesRolledInRow;
    private int diceTotal;
    
    Player() {
        
        playerNumber = 0;
        playerToken = 0;
        playerName = "Unnamed";
        playerBalance = 0;
        playerInJail = false;
        playerGonePastGo = false;
        doublesRolledInRow = 0;
        diceTotal = 0;
        
    }
    
    
    public void rollDice() {
        Random rand = new Random();

        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        
        diceTotal = dice1 + dice2;
        
        if (dice1 == dice2) {
            doublesRolledInRow ++;
        } else {
            doublesRolledInRow = 0;
        }
    }

}
