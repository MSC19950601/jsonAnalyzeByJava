package com.kururu;

import com.kururu.readJson.ReadJsonFile;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<String> test = ReadJsonFile.ReadAndRestructureData("test\\smallTicket.json");
        for(String s : test){
            System.out.println(s);
        }
    }
}
