package com.xxliao.pattern.behavioral.chain_responsibility.demo;

/**
 * @author xxliao
 * @description: ��������
 * @date 2024/5/27 17:28
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    // �ô����߿��Դ����ȡ��
    private int startNum;
    private int endNum;

    // �ϼ��쵼
    private Handler nextHandler;

    // �����������
    public Handler(int startNum) {
        this.startNum = startNum;
    }

    // �������������Χ
    public Handler(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    // �����ϼ��쵼
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * @description  �ύ�����
     * @author  xxliao
     * @date  2024/5/27 17:32
     */
    public final void submit(LeaveRequest leave) {
        if(0 == this.startNum) {
            return;
        }

        if(leave.getNum() >= this.startNum) {
            this.handleLeave(leave);
            //��������ϼ� ����������������˵�ǰ�쵼�Ĵ���Χ
            if(null != this.nextHandler && leave.getNum() > endNum){
                this.nextHandler.submit(leave);//�����ύ
            } else {
                System.out.println("���̽���");
            }
        }
    }

    protected abstract void handleLeave(LeaveRequest leave);
}
