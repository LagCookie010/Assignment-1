




import java.util.Scanner;
import java.security.SecureRandom;




public class CrosswordInitalizer {
    static Scanner Input = new Scanner(System.in);
    static SecureRandom random = new SecureRandom();
    static char[] randomLetters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};


    public static void CrosswordInitalizer() {
        CrossWord[][] CharArray;
        CharArray = new CrossWord[10][10 ];


        System.out.println("Type a five letter word!");
        String oneWord = Input.nextLine();


        // picker

        int startNode = random.nextInt(5);
        int startNodeRow = random.nextInt(10);
        
        // one word char/array 
        char oneWordChar0 = oneWord.charAt(0);
        int oneWordNodes1 = startNode + 1;
        char oneWordChar1 = oneWord.charAt(1);
        int oneWordNodes2 = startNode + 2;
        char oneWordChar2 = oneWord.charAt(2);
        int oneWordNodes3 = startNode + 3;
        char oneWordChar3 = oneWord.charAt(3);
        int oneWordNodes4 = startNode + 4;
        char oneWordChar4 = oneWord.charAt(4);
        int oneWordNodes5 = startNode + 5;

        //cross word
        int a = 0;
       do{
        System.out.print(startNode);
        CharArray[startNodeRow][startNode + a].CrossWord();
        System.out.println(oneWord.charAt(a));

        a++;

        } while (a < oneWord.length());






    }
        

    public static void Generator(String[] args) {
        int loopRow = 0;
        int RowAmount = 0;
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
    }// end of CrosswordInitalizer

   