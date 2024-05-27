package com.xxliao.pattern.behavioral.interpreter.demo;

import java.util.HashMap;
import java.util.Stack;

/**
 * @description  context��ɫ
 * @author  xxliao
 * @date  2024/5/27 15:05
 */
public class Calculator {

	// ������ʽ
	private Expression expression;

	// ���캯�����Σ�������
	public Calculator(String expStr) {
		// ���������Ⱥ�˳��
		Stack<Expression> stack = new Stack<>();
		char[] charArray = expStr.toCharArray();// {a,+,b,-,c}

		Expression left = null;
		Expression right = null;
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+': // �ӷ����ʽ
				left = stack.pop();//
				right = new VarExpression(String.valueOf(charArray[++i]));//
				stack.push(new AddExpression(left, right));//
				break;
			case '-': // �������ʽ
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default: 
				stack.push(new VarExpression(String.valueOf(charArray[i]))); // ����ֵ���ʽ
				break;
			}
		}
		this.expression = stack.pop();
	}

	/**
	 * @description  ���㷽��
	 * @author  xxliao
	 * @date  2024/5/27 15:06
	 */
	public int run(HashMap<String, Integer> var) {
		return this.expression.interpreter(var);
	}
}