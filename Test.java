// Name: Darren Lagbao, 
// Date: 10/9/2024
// Class: CS 145, Computer Science 2, Darrell Criss
// Lab: 3, Letter Inventory
// Citation: W3 Schools, Darrell Criss's Lectures, 
// Purpose: A Program that counts and records a specific letter in a String/Word. 
// Class Purpose: Main is the class hosting main functions and is the main interface.
/* Notes:  */

import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
            LetterInventory[] Inventory = new LetterInventory[26];
    System.out.println("");


    System.out.println("Please input a word to count.");
            String text = input.nextLine();

    int Currentletter = 1;

    while (Currentletter < 27) {
        int number = 0;
    
    char currentLScan = LetterChecker(Currentletter);
  

    for(int i = 0;  i < text.length(); i ++){

            char letter = text.charAt(i);
            

            if (letter == currentLScan){
                number++;
            }


    }// loop word

    if (number > 0 ) {
        System.out.print(currentLScan + " = " + number);
        System.out.println("");}
    Currentletter++;


        }// while loop end

        
        }// main end
    



    public static char LetterChecker(int loop){
        char Currentletter = 'a';

        switch (loop) {
                case 1:
                Currentletter = 'a';
                return Currentletter;

                case 2:
                Currentletter = 'b';
                return Currentletter;

                case 3:
                Currentletter = 'c';
                return Currentletter;

                case 4:
                Currentletter = 'd';
                return Currentletter;
                
                case 5:
                Currentletter = 'e';
                return Currentletter;

                case 6:
                Currentletter = 'f';
                return Currentletter;

                case 7:
                Currentletter = 'g';
                return Currentletter;

                case 8:
                Currentletter = 'h';
                return Currentletter;

                case 9:
                Currentletter = 'i';
                return Currentletter;
                
                case 10:
                Currentletter = 'j';
                return Currentletter;

                case 11:
                Currentletter = 'k';
                return Currentletter;

                case 12:
                Currentletter = 'l';
                return Currentletter;

                case 13:
                Currentletter = 'm';
                return Currentletter;

                case 14:
                Currentletter = 'n';
                return Currentletter;
                
                case 15:
                Currentletter = 'o';
                return Currentletter;

                case 16:
                Currentletter = 'p';
                return Currentletter;

                case 17:
                Currentletter = 'q';
                return Currentletter;

                case 18:
                Currentletter = 'r';
                return Currentletter;

                case 19:
                Currentletter = 's';
                return Currentletter;
                
                case 20:
                Currentletter = 't';
                return Currentletter;

                case 21:
                Currentletter = 'u';
                return Currentletter;

                case 22:
                Currentletter = 'v';
                return Currentletter;

                case 23:
                Currentletter = 'w';
                return Currentletter;

                case 24:
                Currentletter = 'x';
                return Currentletter;
                
                case 25:
                Currentletter = 'y';
                return Currentletter;

                case 26:
                Currentletter = 'z';
                return Currentletter;
            default:
                break;
        }
        return Currentletter;
    }


    
}// end of Main