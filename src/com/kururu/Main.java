package com.kururu;

import net.sf.json.*;

public class Main {

    public static void main(String[] args) {
        AnalyzeJson.AnalyzeJsonS(ReadJsonFile.ReadJsonFile("smallTicket.json"));
        //AnalyzeJson.AnalyzeJsonS(ReadJsonFile.ReadJsonFile(args[0]));
    }
}
