package com.homework17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/alexander/Desktop/IdeaProjects/" +
                "TeachMeSkills/src/com/homework17/randomtext.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        StringBuilder str = new StringBuilder();
        int c = -1;
        while((c = isr.read()) !=-1){
            str.append((char)c);
        }
        System.out.print(str);


        Matcher phoneNumber = Pattern.compile("\\+\\d{12}|(\\+\\(\\d{2}\\)\\d{7})").matcher(str);
        Matcher email = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[a-z]{2,6}").matcher(str);
        Matcher document = Pattern.compile("(\\d{4}-){2}\\d{2}").matcher(str);
        HashMap<String,String> data = new HashMap<>();
        while(phoneNumber.find() && email.find() && document.find()){
            data.put("email",email.group());
            data.put("phone number", phoneNumber.group());
            data.put("document",document.group());
        }
        System.out.println(data.entrySet());
    }
}


