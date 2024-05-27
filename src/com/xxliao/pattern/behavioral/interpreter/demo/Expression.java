package com.xxliao.pattern.behavioral.interpreter.demo;

import java.util.HashMap;


/**
 * @description  定义抽象表达式
 * @author  xxliao
 * @date  2024/5/26 22:49
 */
public abstract class Expression {

	/**
	 * @description  解释公式和数值，key就是公式（表达式）参数[a,b,c]，value就是对应的具体值
	 *
	 * HashMap<String,Integer> var : {a=10,b=20}
	 *
	 * @author  xxliao
	 * @date  2024/5/26 22:51
	 */
	public abstract int interpreter(HashMap<String, Integer> var);
}
