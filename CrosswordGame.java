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

        
    System.out.println("Crossword Generator DL Verison");
    System.out.println("(c)reate a new Crossword puzzle");
    System.out.println("(v)iew the Crossword puzzle");
    System.out.println("(s)olutions to the last Crossword puzzle");
    System.out.println("(q)uit");
        String StartOptions = Input.nextLine();
        char SelectOptions = StartOptions.charAt(0);
        SelectOptions = Character.toLowerCase(SelectOptions);

        switch (SelectOptions) {
            case 'c':
                Generator(null);
            break;
            //
            case 'v':
            if (CrosswordStart == false) { // No Arrays presents
                System.out.println("Sorry no Crossword puzzles made yet");
                break;
            } else {// A Array is present

            }
            
            break;
            //
            case 's':
            if (CrosswordStart == false) { // No Arrays presents
                System.out.println("Sorry no Crossword puzzles made yet");
                break;
            } else {// A Array is present

            }

            break;
            //
            case 'q':
            System.out.println("Closinh  Program");
                loop = false;
            break;
            //
            default:

            System.out.println("Try Inputing again");
                break;
        }
    }
}//CrosswordStart ends




// Crossword Generation
public static void Generator(String[] args) {
    int loopRow = 0;
    int RowAmount = 0;
    SecureRandom random = new SecureRandom();
    char[] randomLetters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};




    do{// add rows
        loopRow = 0; // restart looping rows
        do { // add nodes to row
        System.out.print("  " + randomLetters[random.nextInt(25)]);
        loopRow++;
        
        } while(loopRow < 6);
        System.out.println("");
        RowAmount++;
    } while (RowAmount< 6);
}// Generator ends




    
}// end of CrosswordGame