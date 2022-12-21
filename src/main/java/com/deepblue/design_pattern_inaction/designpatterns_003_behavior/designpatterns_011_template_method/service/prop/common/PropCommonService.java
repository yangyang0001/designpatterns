package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_011_template_method.service.prop.common;


import com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_011_template_method.dto.prop.common.*;
import com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_011_template_method.service.common.PropGameService;

public interface PropCommonService extends PropGameService {

    public PropInitResult propInit(PropInitParam propInitParam);
    public PropBeginResult propBegin(PropBeginParam propBeginParam);
    public PropEndResult propEnd(PropEndParam propEndParam);

}
