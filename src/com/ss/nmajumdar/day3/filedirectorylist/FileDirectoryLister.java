package com.ss.nmajumdar.day3.filedirectorylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * @author Neil Majumdar
 */
public class FileDirectoryLister
{

    public static void main(String[] args)
    {
        try {
                File[] files = getFiles("resources");
                printFiles(files);
            }
            catch(SecurityException | NullPointerException e)
            {
                e.printStackTrace();
            }
    }

    /**
     *
     * @param path
     * @return files from path
     */
    public static File[] getFiles(String path)
    {
        File file = new File(path);
        return file.listFiles();

    }

    /**
     *
     * @param files array of files
     */
    public static void printFiles(File[] files)
    {
        for(File file : files)
        {
            if(file.isDirectory())
            {
                System.out.println("Directory: " + file.getName());


            }
            else
            {
                System.out.println(file.getName());
            }
        }
    }

}
