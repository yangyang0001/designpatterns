package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_003_command;

public class Client {

    public static void main(String[] args) {
        ApplicationView receiver = new ApplicationView();
        Document document = new Document(1L, "TestDocument");
        Command command  = new CopyCommand(receiver, document);
        command.execute();

        receiver.getDocumentList().forEach(System.out::println);
    }
}
