//Java Program to find the number of the words in the given text file

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountNumberOfWordInGivenFile {

    public static void main(String[] args)throws IOException {

        String line;
        int count = 0;


        FileReader file = new FileReader("C:\\Users\\STS173\\IdeaProjects\\FirstProject\\src\\data.txt");
        BufferedReader br = new BufferedReader(file);

        int i=1;
        while((line = br.readLine()) != null) {

            String words[] = line.split(" ");
            System.out.println("Number of words present in "+i+" line are "+words.length);
            i++;
        }

        br.close();
    }
}
// Number of words present in 1 line are 4
// Number of words present in 2 line are 7
