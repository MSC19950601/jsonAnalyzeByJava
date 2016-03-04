package com.kururu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Ellery Queen on 2016/3/4.
 */
public class ReadJsonFile {
    public static String ReadJsonFile(String jsonFilePath){
        File file = new File(jsonFilePath);
        Scanner scanner = null;
        StringBuilder buffer = new StringBuilder();
        try {
            scanner = new Scanner(file, "utf-8");
            while (scanner.hasNextLine()) {
                buffer.append(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(ReadJsonFile.ReadJsonFile("staff.json"));
    }
}
