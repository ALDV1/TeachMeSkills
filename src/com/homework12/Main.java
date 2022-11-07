package com.homework12;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/alexander/Desktop/TeachMeSkills/" +
                "lessons12/romeo-and-juliet.txt");
        StringBuilder romeo = new StringBuilder();
        int i;
        while ((i = fileInputStream.read()) != -1) {
            romeo.append((char) i);
        }
        System.out.println(romeo);
        fileInputStream.close();
        File file = new File("/Users/alexander/Desktop/TeachMeSkills/" +
                "lessons12/longest-word.txt");
        if (file.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exists.");
        }
        FileWriter writer = new FileWriter(file);
        String[] words = romeo.toString().replaceAll("\\W", " ").split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        String resultStr = "the longest word in this text is " + longestWord;
        System.out.println(resultStr);
        writer.write(resultStr);
        writer.close();
    }
}
