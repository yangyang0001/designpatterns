package com.deepblue.designpatterns_001_create.designpatterns_002_factory;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AbstractProduct {
    protected long id;
    protected String productName;
}
