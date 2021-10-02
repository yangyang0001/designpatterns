package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_006_strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client {

    private Strategy strategy;

    public void execute() {
        this.getStrategy().execute();
    }

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        Client client = new Client(strategy);
        client.execute();
    }

}
