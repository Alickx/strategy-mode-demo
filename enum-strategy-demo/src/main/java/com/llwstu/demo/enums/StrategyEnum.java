package com.llwstu.demo.enums;

import com.llwstu.demo.strategy.AdultStrategyImpl;
import com.llwstu.demo.strategy.ElderStrategyImpl;
import com.llwstu.demo.strategy.IStrategy;
import com.llwstu.demo.strategy.StudentStrategyImpl;

/**
 * @Author: 蔡国鹏
 * @Date: 2022/08/24/11:41
 * @Description: 策略枚举类
 */
public enum StrategyEnum {

    /**
     * 学生策略
     */
    StudentStrategy(1,new StudentStrategyImpl()),

    /**
     * 成年人策略
     */
    AdultStrategy(2,new AdultStrategyImpl()),

    /**
     * 老人策略
     */
    ElderStrategy(3,new ElderStrategyImpl()),
    ;


    /**
     * 判断类型
     */
    private final Integer type;

    /**
     * 对应执行策略
     */
    private final IStrategy strategy;

    public Integer getType() {
        return type;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    StrategyEnum(Integer type, IStrategy strategy) {
        this.type = type;
        this.strategy = strategy;
    }

    public static IStrategy getStrategy(Integer type){
        for (StrategyEnum strategyEnum : values()) {
            if(strategyEnum.getType().equals(type)){
                return strategyEnum.getStrategy();
            }
        }
        return null;
    }

}
