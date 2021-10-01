package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_004_command;

public class Client {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        SpecificExecutor executor = new SpecificExecutor();
        executor.setId(1L);
        executor.setExecutorName("executorName");

        Command add = new CommandAdd(receiver, executor);
        Command rem = new CommandRemove(receiver, executor);
        Command get = new CommandGet(receiver, executor);

        Invoker addInvoker = new Invoker(add);
        Invoker remInvoker = new Invoker(rem);
        Invoker getInvoker = new Invoker(get);

        addInvoker.execute();
        receiver.getDocList().stream().forEach(System.out::println);

        System.out.println("-------------------------------------------------------");

        remInvoker.execute();
        receiver.getDocList().stream().forEach(System.out::println);

        System.out.println("-------------------------------------------------------");

        getInvoker.execute();
        receiver.getDocList().stream().forEach(System.out::println);



    }
}
