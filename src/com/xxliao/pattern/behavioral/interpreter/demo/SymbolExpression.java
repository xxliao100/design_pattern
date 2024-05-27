package com.xxliao.pattern.behavioral.interpreter.demo;

import java.util.HashMap;

/**
 * @description ����������Ž����� ���ÿ��������϶�ֻ���Լ��������������й�ϵ��
 * ���������������п���Ҳ��һ�������Ľ�������ۺ������ͣ�����Expression���ʵ����
 *
 * -- ���ս���ʽ��
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
	 * @description  ��������ʵ��
	 * @author  xxliao
	 * @date  2024/5/26 22:54
	 */
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
