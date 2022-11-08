package com.blithe.dao;

import com.blithe.model.Student;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/8 14:51
 * Description:
 */

public interface StudentDao {
    // 查询手机号
    Student selectByPhone(String phone);

    // 添加数据
    int insertStudent(Student student);

    // 按id查询
    Student selectById(Integer id);
}
