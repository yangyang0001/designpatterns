package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_011_template_method.service.prop.common;


import com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_011_template_method.dto.prop.common.*;
import com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_011_template_method.service.common.PropGameServiceImpl;

/**
 *
 */
public abstract class PropCommonServiceImpl extends PropGameServiceImpl implements PropCommonService {


    @Override
    public PropInitResult propInit(PropInitParam propInitParam) {
        return doInit(propInitParam);
    }

    @Override
    public PropBeginResult propBegin(PropBeginParam propBeginParam) {
        return doBegin(propBeginParam);
    }

    @Override
    public PropEndResult propEnd(PropEndParam propEndParam) {
        return doEnd(propEndParam);
    }


    public abstract PropInitResult doInit(PropInitParam propInitParam);

    public abstract PropBeginResult doBegin(PropBeginParam propBeginParam);

    public abstract PropEndResult doEnd(PropEndParam propEndParam);
}
