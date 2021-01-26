package com.ss.nmajumdar.week1.day3.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Neil Majumdar
 */
public class FileAppender
{
    public static void main(String[] args)
    {
        FileAppender fileAppender = new FileAppender();
        fileAppender.appendToFile("resources/output/output.txt", " Hello World");
        fileAppender.appendToFile("resources/output/output.txt", " Thanos brought balance to the universe");
    }

    /**
     *
     * @param path for the file
     * @param data to be appended to file
     */
    public void appendToFile(String path, String data)
    {
        FileWriter fw = null;
        try{
            fw = new FileWriter(path, true);
            fw.write(data);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            try{
                fw.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
}
