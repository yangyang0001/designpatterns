package com.deepblue.design_pattern_inaction.designpatterns_002_structure.designpatterns_007_composite;

import com.alibaba.fastjson.JSON;

public class Client {

    public static Graphic callCompositeMethod(Graphic graphic) {
        System.out.println("graphic.getId:" + graphic.getId());

        Text text1 = new Text();
        text1.setId(1L);
        graphic.addChild(text1);
        Text text2 = new Text();
        text2.setId(2L);
        graphic.addChild(text2);

        return graphic;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.setId(1000L);

        Graphic graphic = Client.callCompositeMethod(picture);
        System.out.println("graphic:" + JSON.toJSONString(graphic));
        graphic.getAllChild().stream().forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------");
        graphic.removeChild(picture.getChildList().get(0));
        graphic.getAllChild().stream().forEach(System.out::println);
    }

}
