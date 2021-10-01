package com.deepblue.design_pattern.designpatterns_003_behavior.designpatterns_004_command;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SpecificExecutor {

    private long id;
    private String executorName;

    private List<Doc> docList = Lists.newArrayList();

    public void add(Doc doc) {
        this.getDocList().add(doc);
    }

    public void remove(Doc doc) {
        List<Doc> collect = this.getDocList().stream().filter(item -> {
            return doc.getId() != item.getId();
        }).collect(Collectors.toList());
        this.docList = collect;
    }

}
