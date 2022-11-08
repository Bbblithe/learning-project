package com.blithe.service.impl;

import com.blithe.dao.StudentDao;
import com.blithe.model.Student;
import com.blithe.service.StudentService;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import javax.annotation.Resource;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/8 14:44
 * Description:
 */

// 暴露Dubbo服务
@DubboService(interfaceClass = StudentService.class, timeout = 5000)
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Resource
    private RedisTemplate redisTemplate;

    /**
     * @param student
     * @return int
     * 1：添加成功
     * 2：手机号重复
     * 3: 手机号为空
     */
    @Override
    public int addStudent(Student student) {
        // 查询手机号是否是唯一
        if (student.getPhone() != null) {
            Student stu = studentDao.selectByPhone(student.getPhone());
            if (stu != null) {
                return 2;
            }
            return studentDao.insertStudent(student);
        } else {
            return 3;
        }
    }

    @Override
    public Student queryStudent(Integer id) {
        // 从redis 查询Student，使用json存储对象
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // 值是存为json
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));

        final String USER_KEY = "STUDENT:";
        Student student = null;
        if (id != null) {
            // STUDENT:
            String key = USER_KEY + id;
            student = (Student) redisTemplate.opsForValue().get(key);
            if (student == null) {
                student = studentDao.selectById(id);
                if (student != null) {
                    // 存放到缓存中
                    redisTemplate.opsForValue().set(key, student);
                }else {
                    // 数据库查不到，在redis添加一个 id 默认值
                    redisTemplate.opsForValue().set(key,Student.defaultStudent());
                }
            }
        }
        return student;
    }
}
