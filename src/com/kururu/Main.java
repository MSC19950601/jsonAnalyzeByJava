package com.kururu;

import com.kururu.parse.AnalyzeJson;
import com.kururu.parse.Parser;
import com.kururu.parse.bulkParser;
import com.kururu.readJson.ReadJsonFile;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<String> test = ReadJsonFile.ReadAndRestructureData("test\\smallTicket.json");
        for(String s : test){
            System.out.println(s);
        }
    }
}
