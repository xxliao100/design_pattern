package com.xxliao.pattern.behavioral.interpreter.demo;

import java.util.HashMap;


/**
 * @description  加法表达式
 * @author  xxliao
 * @date  2024/5/26 22:54
 */
public class AddExpression extends SymbolExpression  {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}
