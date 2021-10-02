package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_003_command;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * 作为接收者
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApplicationView {
    private List<Document> documentList = Lists.newArrayList();
}
