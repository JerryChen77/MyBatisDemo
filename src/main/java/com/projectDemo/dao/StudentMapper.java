package com.projectDemo.dao;

import com.projectDemo.pojo.Student;
import com.projectDemo.pojo.Subject;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/7/3 11:30
 */
public interface StudentMapper {
    Student findStuWithSubById(int id);

    @Select("SELECT sb.name subName,sb.id subId,sb.grade\n" +
            "FROM student st\n" +
            "  LEFT JOIN subject_student ss\n" +
            "    ON st.id = ss.student_id\n" +
            "  LEFT JOIN SUBJECT sb\n" +
            "    ON ss.subject_id = sb.id\n" +
            "WHERE st.id = #{id}")
    @Results(id = "retMap0" ,value = {
            @Result(column = "subId", property="id"),
            @Result(column = "grade", property="grade"),
            @Result(column = "subName", property="subName")
    })
    List<Subject> findSubjectByStuId();



    @Select("select * from student where sex = #{sex}")
    @Results(id = "retMap11",value={
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "stuName"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "id", property = "subjects",many = @Many(select = "com.projectDemo.dao.StudentMapper.findSubjectByStuId",fetchType = FetchType.EAGER))
    })
    List<Student> findStudentByGender(int gender);
}
