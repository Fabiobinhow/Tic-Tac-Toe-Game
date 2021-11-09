/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe.game;

/**
 *
 * @author fabio
 */
public class GameBoard  {


}
    class gameBoard {
             char [][] gameBoard =  {{' ','|',' ','|',' '},
                               {'-','+','-','+','-'},
                               {' ','|',' ','|',' '},
                               {'-','+','-','+','-'},
                               {' ','|',' ','|',' '}};
        public  gameBoard() {
        
            for (char[] row : gameBoard  ){
                for(char gb : row){
                System.out.print(gb);
            }
                System.out.println();
        }
           
    }
        
    }