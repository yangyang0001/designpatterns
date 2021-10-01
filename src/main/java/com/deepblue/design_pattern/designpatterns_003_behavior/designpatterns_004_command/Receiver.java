package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_004_command;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Receiver {
    private List<Doc> docList = Lists.newArrayList();
}
