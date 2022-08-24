package com.llwstu.demo;

import com.llwstu.demo.enums.StrategyEnum;
import com.llwstu.demo.strategy.IStrategy;

/**
 * @Author: 蔡国鹏
 * @Date: 2022/08/24/11:45
 * @Description:
 */
public class Main {

    public static void main(String[] args) {

        // 这里模拟一个请求参数
        int type = 1;

        // 获取对应策略
        IStrategy strategy = StrategyEnum.getStrategy(type);

        // 执行策略
        if (strategy != null) {
            strategy.bus();
        }

    }

}
