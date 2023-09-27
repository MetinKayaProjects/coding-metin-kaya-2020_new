package realLifeQuestions.Mixed;
/*
For a summer reading program, we want to find out how many books students read during the summer.

There is a file at https://public.karat.io/content/test/test_file.txt  with lines like this:

157,Kelly,a wrinkle in time,50
231,Selina,to kill a mockingbird,300
74,Juan,to kill a mockingbird,300
558,Elysse,hush hush,200

Each line contains four fields
* A unique ID for the reader
* The given name of a reader
* The name of a book.
* The number of pages in the book.

Fields will only contain letters, numbers, and spaces.

We would like to know how many books and how many pages were read this summer. Write a script that fetches/downloads the file, reads it, and outputs the total number of books read and total number of pages that were read. For example, for the four lines above, you would output 4 and 850.

Test output: (in any format, as long as the numbers are output)
Book count:  20015
Page count:  2805094
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class ReadFromURL_BookPage {
    public static void main(String[] args) {

        try{
            URL url = new URL("https://public.karat.io/content/test/test_file.txt");

            BufferedReader eachLine = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            int pageCount_Total=0;
            int bookCount_Total = 0;



            while((line = eachLine.readLine()) != null){

                String[] lineSplit = line.split(",");
                bookCount_Total ++;
                int pageOfTheBookInLine = Integer.valueOf(lineSplit[3]);
                pageCount_Total += pageOfTheBookInLine;

            }
            eachLine.close();

            System.out.println("bookCount_Total = " + bookCount_Total);
            System.out.println("pageCount_Total = " + pageCount_Total);


        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());;
        } catch (IOException e) {
            System.out.println("IOEXception: " + e.getMessage());;
        }


    }

}
