package com.llwstu.demo.strategy;

/**
 * @Author: 蔡国鹏
 * @Date: 2022/08/24/11:36
 * @Description: 学生策略
 */
public class StudentStrategyImpl implements IStrategy {

    @Override
    public void bus() {
        System.out.println("执行学生策略 - 半价票");
    }
}

