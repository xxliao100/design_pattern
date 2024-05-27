package com.xxliao.pattern.behavioral.interpreter.demo;

import java.util.HashMap;

/**
 * @description  减法表达式
 * @author  xxliao
 * @date  2024/5/26 22:55
 */
public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
