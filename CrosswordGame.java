// Name: Darren Lagbao, 
// Date: 10/9/2024
// Class: CS 145, Computer Science 2, Darrell Criss
// Assignment: 1, Word Search Engine
// Citation: W3 Schools, Darrell Criss's Lectures, 
// Purpose: A Crossword Game that uses Arrays to form the crossword.
// Sub Purpose: Array Objects

// Imports
import java.util.Scanner;
import java.security.SecureRandom;

public class CrosswordGame {
    static Scanner Input = new Scanner(System.in);

public static void CrosswordStart() {

    // Variables:
    boolean loop = true;
    boolean CrosswordStart = false;

    while (loop == true) {

    Manager.Spacer();
    System.out.println("Crossword Generator DL Verison");
    System.out.println("(c)reate a new Crossword puzzle");
    System.out.println("(v)iew the Crossword puzzle");
    System.out.println("(s)olutions to the last Crossword puzzle");
    System.out.println("(q)uit");
    Manager.Spacer();

    String StartOptions = Input.nextLine();
    char SelectOptions = StartOptions.charAt(0);
    SelectOptions = Character.toLowerCase(SelectOptions);

    System.out.println("===---===---===---===");
    System.out.println("");

        switch (SelectOptions) {
            case 'c':
                CrosswordInitalizer.CrosswordInitalizer();
            break;
            //
            case 'v':
            if (CrosswordStart == false) { // No Arrays presents
                System.out.println("Sorry no Crossword puzzles made yet");
                Manager.Spacer();
                break;
            } else {// A Array is present

            }
            
            break;
            //
            case 's':
            if (CrosswordStart == false) { // No Arrays presents
                System.out.println("Sorry no Crossword puzzles made yet");
                Manager.Spacer();

                break;
            } else {// A Array is present

            }

            break;
            //
            case 'q':
            Manager.Spacer();
            System.out.println("Closinh  Program");
                loop = false;
            break;
            //
            default:

            System.out.println("Try Inputing again");
            Manager.Spacer();

                break;
        }
    }
}//CrosswordStart ends






    
}// end of CrosswordGame