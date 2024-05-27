package com.xxliao.pattern.behavioral.interpreter.demo;

import java.util.HashMap;
import java.util.Stack;

/**
 * @description  context角色
 * @author  xxliao
 * @date  2024/5/27 15:05
 */
public class Calculator {

	// 定义表达式
	private Expression expression;

	// 构造函数传参，并解析
	public Calculator(String expStr) {
		// 安排运算先后顺序
		Stack<Expression> stack = new Stack<>();
		char[] charArray = expStr.toCharArray();// {a,+,b,-,c}

		Expression left = null;
		Expression right = null;
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+': // 加法表达式
				left = stack.pop();//
				right = new VarExpression(String.valueOf(charArray[++i]));//
				stack.push(new AddExpression(left, right));//
				break;
			case '-': // 减法表达式
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default: 
				stack.push(new VarExpression(String.valueOf(charArray[i]))); // 创建值表达式
				break;
			}
		}
		this.expression = stack.pop();
	}

	/**
	 * @description  计算方法
	 * @author  xxliao
	 * @date  2024/5/27 15:06
	 */
	public int run(HashMap<String, Integer> var) {
		return this.expression.interpreter(var);
	}
}