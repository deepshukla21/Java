/******************************************************************************
 *  Purpose: TicTacToe game between computer and user  
 *  @author  Deep Shukla
 *  @version 1.0
 *  @since   03-09-2019
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class TicTacToeGame {
	// Static input required
    static String player = "user";
    static char[] board = {'0', '1', '2', '3', '4', '5', '6', '7' ,'8','9'};
    static int flag = 0;
    static int choice;
    
    // Display  board
    public static void board(){
      System.out.println(board[1] + "  | " + board[2] + "  | " + board[3]);
	  System.out.println("___|___ |___");
	  System.out.println(board[4] + "  | " + board[5] + "  | " + board[6]);
	  System.out.println("___|___ |___");
	  System.out.println(board[7] + "  | " + board[8] + "  | " + board[9]);
	  System.out.println("   |    |  ");
    }
    
    // Updating the board after every input
    public static void updateBoard(int choice) {
    	if (board[choice] != 'O' && board[choice] != 'X') {
            if (player == "user") {
            	board[choice] = 'O';
                player = "computer";
            }
            else {
            	board[choice] = 'X';
                player = "user";
            }
        }
        else {
            System.out.println("Your choice  is already existed with " + choice + " " + board[choice]);
        }
    }
 // Check for winning condition
    public static int checkWin() {
        // checking horizontally
        if(board[1] == board[2] && board[2] == board[3]) {
            return 1;
        }
        else if (board[4] == board[5] && board[5] == board[6]) {
            return 1;
        }
        else if (board[7] == board[8] && board[8] == board[9])
        {
            return 1;
        }
        //check vertically
        else if (board[1] == board[4] && board[4] == board[7]) {
            return 1;
        }
        else if (board[2] == board[5] && board[5] == board[8])
        {
            return 1;
        }
        else if (board[3] == board[6] && board[6] == board[9]) {
            return 1;
        }
        //check diagonally
        else if (board[1] == board[5] && board[5] == board[9]) {
            return 1;
        }
        else if (board[3] == board[5] && board[5] == board[7]) {
            return 1;
        }
        // Check if there is no empty cells, it's a draw
        else if(board[1] != '1' && board[2]!= '2' && board[3]!='3' && board[4]!='4' 
        		&& board[5]!='5' && board[6] !='6' && board[7]!='7'&& board[8]!='8' && board[9]!='9') {
            return -1;
        }
        // Condition for game is still continuing
        else {
            return 0;
        }
    }

    /* The main function is written to test TicTacToeGame class
     */
   public static void main(String[] args) {
	 board();
	 Scanner sc = new Scanner(System.in);
	 // 
	 do {
		if(player == "user") {
			System.out.println("User enter your choice ");
			choice = sc.nextInt();
		}
		else {
			System.out.println("computer will enter choice ");
			choice = (int) (Math.random() * 10);
			System.out.println(choice);
		}
		updateBoard(choice);
        board();
		flag = checkWin();
	  }
	 
	 // Before going inside do while loop again checking if someone win or game is draw
	while (flag != 1 && flag != -1); {
     if(flag == 1) {
    	if(player == "user")
        System.out.println("computer has won ");
    	else {
    		System.out.println("user has won ");
    	}
    }
    else {
        System.out.println("Game is draw nobody wins");
    }		
   }
	// Close open resources
	try {
		if(sc != null) {
			sc.close();
		}
	}catch(Exception ex) {
		ex.printStackTrace();
	}
 }
}

