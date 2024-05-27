package com.xxliao.pattern.behavioral.interpreter.demo;

import java.util.HashMap;


/**
 * @description  ֵ���ʽ
 *
 * --�ս���ʽ
 *
 * @author  xxliao
 * @date  2024/5/26 22:56
 */
public class VarExpression extends Expression {

	private String key; 

	public VarExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
