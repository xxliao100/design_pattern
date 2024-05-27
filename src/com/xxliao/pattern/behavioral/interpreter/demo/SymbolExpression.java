package com.xxliao.pattern.behavioral.interpreter.demo;

import java.util.HashMap;

/**
 * @description 抽象运算符号解析器 这里，每个运算符合都只和自己左右两个数字有关系，
 * 但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression类的实现类
 *
 * -- 非终结表达式。
 *
 * @author  xxliao
 * @date  2024/5/26 22:53
 */
public class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * @description  由子类来实现
	 * @author  xxliao
	 * @date  2024/5/26 22:54
	 */
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
