package com.kururu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static List<String> ReadJsonFileSed(String jsonFilePath){
        List<String> result = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(jsonFilePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String oneline;
            while((oneline = bufferedReader.readLine()) != null) {
                result.add(oneline);
            }
            result.remove(0);
            result.remove(result.size()-1);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("NO FILE!");
            return null;
        }catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }

    public static List<String> PatternList(List<String> list){
        List<String> res = new ArrayList<>();
        if(list.isEmpty()){
            System.out.println("the list is empty");
            return null;
        }
        for(String eachLine : list){
            eachLine = eachLine.trim();
            eachLine = eachLine.substring(1,eachLine.length() - 1);
            res.add(eachLine);
        }
        for(int i = 0;i < res.size() - 1; ++i){
            String s = res.get(i).substring(0,res.get(i).length() - 1);
            res.remove(i);
            res.add(i,s);
        }
        return res;
    }

    public static void main(String[] args) {
        //System.out.println(ReadJsonFile.ReadJsonFile("smallTicket.json"));
        List<String> test = ReadJsonFileSed("smallTicket.json");
        test = PatternList(test);
        for(String s : test){
            System.out.println(s);
        }
    }
}
