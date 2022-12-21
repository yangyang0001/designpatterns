package com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_011_template_method.service.prop.dice;


import com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_011_template_method.dto.prop.common.*;
import com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_011_template_method.dto.prop.dice.*;
import com.deepblue.design_pattern_inaction.designpatterns_003_behavior.designpatterns_011_template_method.service.prop.common.PropCommonServiceImpl;

/**
 *
 */
public class DicePropServiceImpl extends PropCommonServiceImpl implements DicePropService{

    @Override
    public PropInitResult doInit(PropInitParam propInitParam) {
        DiceInitParam initParam = (DiceInitParam) propInitParam;

        return new DiceInitResult();
    }

    @Override
    public PropBeginResult doBegin(PropBeginParam propBeginParam) {
        DiceBeginParam beginParam = (DiceBeginParam) propBeginParam;
        return new DiceBeginResult();
    }

    @Override
    public PropEndResult doEnd(PropEndParam propEndParam) {
        DiceEndParam endParam = (DiceEndParam) propEndParam;
        return new DiceEndResult();
    }

}
