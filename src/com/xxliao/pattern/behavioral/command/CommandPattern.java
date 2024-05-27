package com.xxliao.pattern.behavioral.command;

/**
 * @author xxliao
 * @description: ���ģʽ-��Ϊ��ģʽ-����ģʽ
 *
 * ���壺����ģʽҲ�ж���ģʽ��������ģʽ�����ǽ����������װ�ɶ���ʹ�ÿ����ò�ͬ������Կͻ��˽��в�������������������������ʱ���ġ��ŶӺͼ�¼��
 * ���� ������ �� ������ ���˳���ǣ� ������ --> ���� --> ������
 *
 * �ṹ��
 * 1.�������Abstract Command��: ����������һ���ӿڣ�������ִ�в�����ͳһ������������������ʵ������ӿڣ����ṩִ����Ӧ�����ľ����߼�
 * 2.�������Concrete Command��������������ʵ���˳��������࣬��ӵ�� �����߶��� ����ͨ�����ý����ߵĹ������������Ҫִ�еĲ�����
 * 3.�����ߣ�Receiver��: ִ��ʵ��������࣬����������ý����ߵķ�����ִ������
 * 4.�����ߣ�Invoker���������������ͨ���Ƕ������ͨ���������������ִ�������������ֱ�ӷ��ʽ����ߡ�
 *
 *
 * ʵ��ʹ�ã�
 * 1.Spring JdbcTemplate �е�execute/query������
 * 2.Runnable Thread start()��
 *
 * @date 2024/5/25 19:17
 */

public class CommandPattern {
}