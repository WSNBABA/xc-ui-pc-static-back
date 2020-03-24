package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import org.apache.ibatis.annotations.Mapper;

/**
 * @AUTHOR LZG
 * @DATE 2020/3/23 21:55
 * @VERSION 1.0
 */
@Mapper
public interface TeachplanMapper {
    public TeachplanNode selectList(String courseId);
}
