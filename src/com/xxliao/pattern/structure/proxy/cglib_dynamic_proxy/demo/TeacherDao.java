package com.xxliao.pattern.structure.proxy.cglib_dynamic_proxy.demo;

/**
 * @author xxliao
 * @description: cglig ���� Ŀ�������
 * @date 2024/5/24 23:21
 */

public class TeacherDao {

    public void teach() {
        System.out.println("teacher is teaching...");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
