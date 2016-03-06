package com.kururu.readJson;


import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ellery Queen on 2016/3/4.
 */

public class ReadJsonFile {
    //read data from json file in test dir
    private static List<String> ReadJsonFile(String jsonFilePath){
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

    //delete the "" and , in the strings
    private static List<String> PatternList(List<String> list){
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

    // get the members of list just like "ITEM000005" the member can be repeated
    private static List<String> PatternNonBulkGoods(List<String> list){
        List<String> res = new ArrayList<>();
        if(list.isEmpty())
            return null;
        for(String s : list){
            Pattern PATTERN = Pattern.compile("^(\\w+)");
            Matcher matcher = PATTERN.matcher(s);
            if(matcher.matches()){
                res.add(s);
            }else{
                continue;
            }
        }
        return res;
    }

    // make the members in the NonBulkGoods list be like that "ITEM000005-3"
    private static List<String> ChangeTheStyleOfNonBulkGoods(List<String> nonBulkGoodsList){
    //public static void ChangeTheStyleOfNonBulkGoods(List<String> nonBulkGoodsList){
        List<String> res = new ArrayList<>();
        Set<String> set = new HashSet<>(nonBulkGoodsList);
        for(String tmp : set){
            res.add(tmp + "-" + Collections.frequency(nonBulkGoodsList, tmp));
        }
        return res;
    }

    // get the members of list just like "ITEM000005-2" the member cannot be repeated
    private static List<String> PatternBulkGoods(List<String> list){
        List<String> res = new ArrayList<>();
        if(list.isEmpty())
            return null;
        for(String s : list){
            Pattern PATTERN = Pattern.compile("^(\\w+)-(\\d+)$");
            Matcher matcher = PATTERN.matcher(s);
            if(matcher.matches()){
                res.add(s);
            }else{
                continue;
            }
        }
        return res;
    }

    //add list a & b
    private static List<String> listAdd(List<String> a, List<String> b){
        if(a.addAll(b)){
            return a;
        }else{
            return null;
        }
    }

    public static List<String> ReadAndRestructureData(String jsonFilePath){
        return listAdd(
                ChangeTheStyleOfNonBulkGoods(
                        PatternNonBulkGoods(
                                PatternList(
                                        ReadJsonFile(jsonFilePath)))),
                PatternBulkGoods(
                        PatternList(
                                ReadJsonFile(jsonFilePath))));
    }
}
