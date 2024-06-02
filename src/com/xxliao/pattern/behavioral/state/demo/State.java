package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: 状态顶层接口 - 抽象状态类
 * @date 2024/5/27 15:54
 */

public interface State {

    /**
     * @description  开启电梯
     * @author  xxliao
     * @date  2024/5/27 15:55
     */
    void open();

    /**
     * @description  电梯运行
     * @author  xxliao
     * @date  2024/5/27 15:56
     */
    void run();

    /**
     * @description  电梯暂停
     * @author  xxliao
     * @date  2024/5/27 15:56
     */
    void stop();

    /**
     * @description  停止电梯
     * @author  xxliao
     * @date  2024/5/27 15:56
     */
    void close();

}
