package com.kururu.parse;

import com.kururu.product.Item;
import com.kururu.readJson.ReadJsonFile;

import java.util.List;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ellery Queen on 2016/3/6.
 */
public class bulkParser extends Parser{
    private final Pattern PATTERN = Pattern.compile("^(\\w+)-(\\d+)$");
    private Item item;

    public Item parseLine(String carItemLine) {
        Matcher matcher = PATTERN.matcher(carItemLine);
        if (matcher.matches()) {
            System.out.println(matcher.group(1));
            //carItem = new CarItem(new Item(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        } else {

            System.out.println("NO MATCH!");
            //carItem = new CarItem(new Item(matcher.group(1)), 1);
        }
        return null;
    }

    /*public static void main(String[] args) {
        List<String> test = new bulkParser().parser(ReadJsonFile.PatternList(ReadJsonFile.ReadJsonFile("test\\smallTicket.json")));
        for (String s:
             test) {
            System.out.println(s);
        }
    }*/

}
