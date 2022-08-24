package com.llwstu.demo.strategy;

/**
 * @Author: 蔡国鹏
 * @Date: 2022/08/24/11:36
 * @Description: 老人策略
 */
public class ElderStrategyImpl implements IStrategy {

    @Override
    public void bus() {
        System.out.println("执行老人策略 - 免票");
    }
}

