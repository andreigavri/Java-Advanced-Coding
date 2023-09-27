package ro.sda._4_generics._3_thirdExample;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myStringList = Arrays.asList("a","b","c","d");
        int lastIndex = myStringList.size();
        myStringList.get(lastIndex);


    }
}
