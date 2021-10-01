package com.deepblue.design_pattern.designpatterns_001_create.designpatterns_004_builder;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AbstractProduct {
    protected long productNo;
    protected String productName;
}
