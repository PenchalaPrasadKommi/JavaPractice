package Word_Counter;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity {
    static int getCount(String[] input,String s)
    {
        int wordCount = 0;
        for(String i : input)
        {
            if(i.equalsIgnoreCase(s))
                wordCount++;
        }
        return wordCount;
    }
    public static void main(String[] args) {
        System.out.println("Please enter the string:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String lowerInput = input.toLowerCase();
        String[] inputWords = lowerInput.split(" ");
        ArrayList<String> uniqueWords = new ArrayList<String>();
        for(String i: inputWords)
        {
            if(!uniqueWords.contains(i))
            {
                uniqueWords.add(i);
            }
        }
        for(String word: uniqueWords)
        {
            System.out.println(word+" -> "+getCount(inputWords,word));
        }
    }
}
