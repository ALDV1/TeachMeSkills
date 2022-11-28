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
        StringBuilder text = new StringBuilder();

        int c;
        while ((c = users.read()) != -1) {
            text.append((char) c);
        }
        users.close();

        String[] names = text.toString().split("\n");
        for (int i = 0; i < names.length; ++i) {
            idName.put(i, names[i]);
        }
        idName.forEach((id, name) -> System.out.println(name));

        System.out.println("\n====================================\n");

        List<String> result = idName.entrySet().stream()
                .filter(id -> id.getKey() == 1 || id.getKey() == 2 || id.getKey() == 5 ||
                        id.getKey() == 8 || id.getKey() == 9 || id.getKey() == 13)
                .map(Map.Entry::getValue).filter(name -> name.length() % 2!= 0)
                .map(name -> String.valueOf(new StringBuilder(name).reverse())).toList();
        System.out.println(result);
    }
}
