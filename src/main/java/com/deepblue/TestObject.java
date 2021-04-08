package com.deepblue;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import lombok.*;

import java.util.*;
import java.util.stream.Collectors;

public class TestObject {
    public static void main(String[] args) {

        int i= 10;
        System.out.println(~i);

        Map<String, String> paramMap = Maps.newHashMap();
        paramMap.put("zhangsan", "125");
        paramMap.put("lisi", "110");
        paramMap.put("wangwu", "122");
        paramMap.put("zhaoliu", "145");
        paramMap.put("maosan", "100");
        paramMap.put("gousi", "101");
        Map<String, Double> doubleMap = Maps.newHashMap();
        for(Map.Entry<String, String> entry : paramMap.entrySet()) {
            doubleMap.put(entry.getKey(), Double.valueOf(entry.getValue()));
        }
        // "{\"lisi\":\"110\",\"zhaoliu\":\"145\",\"zhangsan\":\"125\",\"wangwu\":\"122\",\"gousi\":\"101\",\"maosan\":\"100\"}"
        System.out.println("paramMap  :" + JSON.toJSONString(paramMap));
        System.out.println("doubleMap :" + JSON.toJSONString(doubleMap));


        Map<String, String> hashSetMap = Maps.newHashMap();
        hashSetMap.put("frist_name", "Yang");
        hashSetMap.put("last_name", "JianWei");
        hashSetMap.put("gender", "0");
        hashSetMap.put("age", "28");
        String hashSetMapJSON = "{\"gender\":\"0\",\"frist_name\":\"Yang\",\"last_name\":\"JianWei\",\"age\":\"28\"}";
        System.out.println("hashSetMap :" + JSON.toJSONString(hashSetMap));

        User user0 = new User("zhangsan", 125);
        User user1 = new User("lisi", 110);
        User user2 = new User("wangwu", 122);
        User user3 = new User("zhaoliu", 145);
        User user4 = new User("maosan", 100);

        SortedSet<User> sortedSet = new TreeSet<>(Comparator.comparingDouble(User::getScore).reversed());
        sortedSet.add(user0);
        sortedSet.add(user1);
        sortedSet.add(user2);
        sortedSet.add(user3);
        sortedSet.add(user4);

        List<String> nameList = sortedSet.stream().map(User::getUsername).collect(Collectors.toList());

        System.out.println("sortedSet :" + JSON.toJSONString(sortedSet));
        System.out.println("nameList  :" + JSON.toJSONString(nameList));


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("anchorYid", 1306214892L);

        System.out.println("jsonObject :" + JSON.toJSONString(jsonObject));




    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public static class User {
        private String username;
        private double score;
    }
}
