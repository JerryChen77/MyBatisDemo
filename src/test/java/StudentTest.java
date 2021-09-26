import com.projectDemo.dao.StudentMapper;
import com.projectDemo.pojo.Student;
import com.projectDemo.pojo.Subject;
import com.projectDemo.utils.MyBatisUtils;
import org.junit.Test;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/7/3 11:57
 */
public class StudentTest {

    @Test
    public void studentWithSubById(){
        StudentMapper studentMapper = MyBatisUtils.getMapper(StudentMapper.class);
        Student stuWithSubById = studentMapper.findStuWithSubById(1001);
        System.out.println(stuWithSubById);
        for (Subject subject : stuWithSubById.getSubjects()) {
            System.out.println(subject);
        }


    }

    @Test
    public void findStudentByGender(){
        StudentMapper studentMapper = MyBatisUtils.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.findStudentByGender(0);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
