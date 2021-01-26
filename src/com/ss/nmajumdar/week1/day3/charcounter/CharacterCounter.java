package com.ss.nmajumdar.week1.day3.charcounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Neil Majumdar
 */
public class CharacterCounter
{
    public static void main(String[] args)
    {
        if((args.length == 1) && (args[0].length() == 1) && (Character.isLetter(args[0].charAt(0))))
        {
            try {
                CharacterCounter counter = new CharacterCounter();
                System.out.println("Number of " + args[0] + "'s in hello.txt: " + counter.getNumCharsInFile("resources/hello.txt", args[0]));
            }
            catch (IOException | NullPointerException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.err.println("Must enter only 1 character");
        }
    }

    /**
     *
     * @param path of file
     * @param character to be counted for in file
     * @return number of specific character in file
     * @throws IOException
     */
    public int getNumCharsInFile(String path, String character) throws IOException
    {
        BufferedReader bufReader = null;
        bufReader = new BufferedReader(new FileReader(path));
        String currentLine = "";
        currentLine = bufReader.readLine();
        int count = 0;
        while (currentLine != null)
        {
            count += getNumCharsInLine(currentLine, character.charAt(0));
            currentLine = bufReader.readLine();
        }

        bufReader.close();

        return count;
    }

    /**
     *
     * @param line of file
     * @param character to be counted for in file
     * @return number of specific character in line
     */
    public int getNumCharsInLine(String line, char character)
    {
        int count = 0;
        for(int i = 0; i < line.length(); i++)
        {
            if(line.charAt(i) == character)
                count++;
        }

        return count;
    }
}
