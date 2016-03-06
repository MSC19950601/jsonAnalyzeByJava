package com.kururu.parse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ellery Queen on 2016/3/6.
 */
public abstract class Parser<T> {
    public List<T> parser(List<String> itemLines) {
        List<T> result = new ArrayList<T>();
        for (String itemLine : itemLines) {
            result.add(parseLine(itemLine));
        }
        return result;
    }

    public abstract T parseLine(String itemLine);

}
