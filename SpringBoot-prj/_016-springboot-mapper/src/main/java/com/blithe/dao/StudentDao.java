package com.blithe.dao;

import com.blithe.model.Student;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 10:49
 * Description:
 */

/**
 * @Mapper 告诉mybatis这是dao接口，创建此接口的代理对象。
 *      位置：在类上
 */
@Mapper
public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);
}
