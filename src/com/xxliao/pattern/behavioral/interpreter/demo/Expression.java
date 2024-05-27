package com.xxliao.pattern.behavioral.interpreter.demo;

import java.util.HashMap;


/**
 * @description  ���������ʽ
 * @author  xxliao
 * @date  2024/5/26 22:49
 */
public abstract class Expression {

	/**
	 * @description  ���͹�ʽ����ֵ��key���ǹ�ʽ�����ʽ������[a,b,c]��value���Ƕ�Ӧ�ľ���ֵ
	 *
	 * HashMap<String,Integer> var : {a=10,b=20}
	 *
	 * @author  xxliao
	 * @date  2024/5/26 22:51
	 */
	public abstract int interpreter(HashMap<String, Integer> var);
}
