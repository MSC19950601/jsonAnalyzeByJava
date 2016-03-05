package com.kururu;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.Iterator;

/**
 * Created by Ellery Queen on 2016/3/4.
 */
public class AnalyzeJson {

    public static void AnalyzeJsonS(String jsonStr){
        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        JSONArray jsonArray = jsonObject.getJSONArray("message");

        Iterator iterator = jsonArray.iterator();
        while(iterator.hasNext()){
            JSONObject object = (JSONObject)iterator.next();
            System.out.println(object.getString("name"));
            System.out.println(object.getInt("age"));
            System.out.println(object.getString("position"));
            System.out.println(object.getInt("salary"));
            System.out.println(object.getString("skills"));
            System.out.println("\n");
        }
    }
    //use function in ReadJsonFile.java ReadJsonFile()
    public static void AnalyzeJsonT(String jsonStr){
        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        JSONArray jsonArray = jsonObject.getJSONArray(null);

        Iterator iterator = jsonArray.iterator();
        while(iterator.hasNext()){
            JSONObject object = (JSONObject)iterator.next();
            System.out.println(object.getString(null));
            System.out.println("\n");
        }
    }
}
