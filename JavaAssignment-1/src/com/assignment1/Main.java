
package com.assignment1;
import java.io.File;
import java.util.Scanner;
import java.util.regex.*;


public class Main {

    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        String path;
        System.out.println("Enter the path you want to search:");
        path = input.nextLine();
        File directory = new File(path);    //creating the path of directory        /MinGW/include/

        String[] fileList = directory.list();                     //Storing the file names
        int flag = 0;
        if (fileList==null) {
            System.out.println("Empty directory:");
        }

        while (fileList!=null) {
            String reg;
            System.out.println("Enter the regex pattern or 0 to exit code");
            reg = input.nextLine();
            Pattern pattern = Pattern.compile(reg);
            if(reg.equalsIgnoreCase("0"))           //to exit code
            {
                break;
            }
                for (int i = 0; i < fileList.length; i++) {     //Searching the file name with the given regex pattern
                    String filename = fileList[i];
                    Matcher matcher = pattern.matcher(filename);
                    if (matcher.matches()) {
                        System.out.println(directory.getAbsolutePath() + "\\" + filename);
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    System.out.println("No files found with given regex pattern");
                }
            }

        }
    }


