/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letterfrequency;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Yifei
 */
public class LetterFrequency {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("Untitled.txt");
        Scanner input = new Scanner(file);
        ArrayList letters = new ArrayList();
        int[] count = new int[26];
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        while (input.hasNext()) {
            String words = input.next();
            for (int i = 0; i < words.length(); i++) {
                if (Character.isLetter(words.charAt(i))) {
                    letters.add(words.toLowerCase().charAt(i));
                }

                switch (words.toLowerCase().charAt(i)) {
                    case 'a':
                        count[0]++;
                        break;
                    case 'b':
                        count[1]++;
                        break;
                    case 'c':
                        count[2]++;
                        break;
                    case 'd':
                        count[3]++;
                        break;
                    case 'e':
                        count[4]++;
                        break;
                    case 'f':
                        count[5]++;
                        break;
                    case 'g':
                        count[6]++;
                        break;
                    case 'h':
                        count[7]++;
                        break;
                    case 'i':
                        count[8]++;
                        break;
                    case 'j':
                        count[9]++;
                        break;
                    case 'k':
                        count[10]++;
                        break;
                    case 'l':
                        count[11]++;
                        break;
                    case 'm':
                        count[12]++;
                        break;
                    case 'n':
                        count[13]++;
                        break;
                    case 'o':
                        count[14]++;
                        break;
                    case 'p':
                        count[15]++;
                        break;
                    case 'q':
                        count[16]++;
                        break;
                    case 'r':
                        count[17]++;
                        break;
                    case 's':
                        count[18]++;
                        break;
                    case 't':
                        count[19]++;
                        break;
                    case 'u':
                        count[20]++;
                        break;
                    case 'v':
                        count[21]++;
                        break;
                    case 'w':
                        count[22]++;
                        break;
                    case 'x':
                        count[23]++;
                        break;
                    case 'y':
                        count[24]++;
                        break;
                    case 'z':
                        count[25]++;
                        break;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            double[] frequency = new double[26];
            frequency[i] = (double) count[i] / letters.size();
            System.out.printf("%c%s%.2f%s%d\n", alphabet[i]," frequency:",frequency[i]," Times:",count[i]);
        }
    }
}
