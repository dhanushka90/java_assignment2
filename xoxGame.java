package Game;

import java.util.ArrayList;
import java.util.Scanner;

public class xoxGame {

	public static void main(String[] args) {

       String[][] TicTacToeBoard = { { "O", "X", "O" }, { "X", "X", "O" }, { "X", "0", "0" } };
        
     
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(TicTacToeBoard[i][j] + " ");
            }
 
            System.out.println();
        }
        
        System.out.println();
        
        String[][] TicTacToeBoard2 = new String [3][3];
        TicTacToeBoard2 [0][0]="0";
        TicTacToeBoard2 [0][1]="X";
        TicTacToeBoard2 [0][2]="X";
        TicTacToeBoard2 [1][0]="X";
        TicTacToeBoard2 [1][1]="X";
        TicTacToeBoard2 [1][2]="O";
        TicTacToeBoard2 [2][0]="X";
        TicTacToeBoard2 [2][1]="0";
        TicTacToeBoard2 [2][2]="0";
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(TicTacToeBoard2[i][j] + " ");
            }
 
            System.out.println();
        }
        
        System.out.println();
        
    
        
        String[] Name = {"Ana","Ahamed","Jermano"};
        int[] Age = {16, 20, 24};
        
        
       for (int i = 0; i < 3; i++) {
    	   System.out.print(Name[i]+ " ==> ");
    	   System.out.println(Age[i]);
       }
        
       System.out.println();
        


       Scanner sc= new Scanner(System.in);
       
       ArrayList<String> nameList = new ArrayList<String> ();
       ArrayList<Integer> ageList = new ArrayList<Integer> ();
       
       String Name1 = null;
       int Age1 = 0;
       
       
       
       for (int i=0; i < 99999; i++) {
    	   System.out.print("What is Your name?");
    	   Name1 = sc.next();
    	   
    	   if (Name1.equals("end")) {
    		   break;
    	   }//end of statement
    	   
           System.out.print("What's your Age:");
           Age1 = sc.nextInt();
       
       	   System.out.println("----------------------------");
       	   
       	   nameList.add(Name1);//Add name to the array
       	   ageList.add(Age1);//Add age to the array
       	   
       		}//end of array data input for loop
       	   
       System.out.println("----------------------------");
       
       
       for (int i=0; i<nameList.size();i++) {
    	   
    	   System.out.println(nameList.get(i));
    	   System.out.println(ageList.get(i));
           System.out.println("----------------------------");
       }
       
       
	} 
	
}
        



	

