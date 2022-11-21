package com.homework15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> idName = new HashMap<>();
        FileInputStream users = new FileInputStream("/Users/alexander/Desktop/IdeaProjects/" +
                "TeachMeSkills/src/com/homework15/Names");
        StringBuilder allNames = new StringBuilder();

        int c;
        while((c = users.read()) !=-1){
            allNames.append((char)c);
        }
        users.close();
         String[] names = allNames.toString().split("\n");
        for(int i = 0;i<names.length;++i){
            idName.put(i,names[i]);
        }
        idName.forEach((id, name) -> System.out.println(name));
        System.out.println("\n====================================\n");

        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<Integer,String> elements : idName.entrySet()){
            if(elements.getKey() == 1 || elements.getKey() == 2 || elements.getKey() == 5
            || elements.getKey() == 8 || elements.getKey() == 9 || elements.getKey() == 13){
                list.add(elements.getValue());
            }
        }
        list.stream().filter(symbols -> symbols.length() %2 != 0).map(x -> {
            StringBuilder str = new StringBuilder();
            return str.append(x).reverse();
        }).forEach(System.out::println);
    }
}
