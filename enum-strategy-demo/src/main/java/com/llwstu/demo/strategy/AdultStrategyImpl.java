package com.llwstu.demo.strategy;

/**
 * @Author: 蔡国鹏
 * @Date: 2022/08/24/11:36
 * @Description: 成年人策略
 */
public class AdultStrategyImpl implements IStrategy {

    @Override
    public void bus() {
        System.out.println("执行成年人策略 - 全票");
    }
}

