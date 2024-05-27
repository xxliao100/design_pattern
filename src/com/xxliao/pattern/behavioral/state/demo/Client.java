package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: 状态模式 测试客户端
 * @date 2024/5/27 16:38
 */
public class Client {

    public static void main(String[] args) {
        // 创建环境角色
        Context context = new Context();
        // 设置当前状态
        context.setCurrentLiftState(Context.CLOSEABLE_STATE);

        // 开启电梯
        context.open();
        // 运行电梯
        context.run();
        // 停止电梯
        context.stop();
        // 关闭电梯
        context.close();
    }
}
