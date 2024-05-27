package com.xxliao.pattern.behavioral.chain_responsibility.demo;

/**
 * @author xxliao
 * @description: ������ģʽ ���Կͻ���
 * @date 2024/5/27 17:41
 */
public class Client {

    public static void main(String[] args) {
        //�������һ��
        LeaveRequest leave = new LeaveRequest("С��",5,"���岻��");
        //��λ�쵼
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        groupLeader.setNextHandler(manager);//С�鳤���쵼�ǲ��ž���
        manager.setNextHandler(generalManager);//���ž�����쵼���ܾ���
        //֮���������������ϼ��쵼������Ϊ���Ը���ʵ���������������ã����ʵս���ϼ��쵼�˶��ǹ̶��ģ�������Ƶ��쵼ʵ�����С�
        //�ύ����
        groupLeader.submit(leave);
    }
}
