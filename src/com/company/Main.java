package com.company;

import org.json.simple.JSONObject;

public class Main {

    public static void main(String[] args) {
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name","Ali");
        jsonObject1.put("family","Amiri");
        jsonObject1.put("average","18");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("name","Mohammad");
        jsonObject2.put("family","Karimi");
        jsonObject2.put("average","14.42");

        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("name","Behrad");
        jsonObject3.put("family","Tarighat");
        jsonObject3.put("average","16.50");

        System.out.println("First student --> "+jsonObject1.toJSONString());
        System.out.println("_____________________________");
        System.out.println("Second student --> "+jsonObject2.toJSONString());
        System.out.println("_____________________________");
        System.out.println("Third student --> "+jsonObject3.toJSONString());
    }
}
