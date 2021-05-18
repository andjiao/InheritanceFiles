import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Exercise 3
     Write a program that reads a file with n number of strings seperated by line breaks.
     The program determines and prints how many words are in the file*/

public class Filer {
    public static void main(String[] args) throws FileNotFoundException {

            //passing in the file object
            File text = new File("src/textFile");

            //Scanner reads the file
            Scanner readFile = new Scanner(text);

            //making a counter
            int count = 0;

            /*Using while loop, because we don't know how many times the loops should go.
            * Saying as long as the file has a next token, the loop should run*/
            while (readFile.hasNext()) {

                //definere at der skal læses næste token
                String word = readFile.next();
                //og at hver token skal tælles
                count++;
            }

            System.out.println("total words " + count);
    }
}
