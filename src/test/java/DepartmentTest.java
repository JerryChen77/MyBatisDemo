import com.projectDemo.dao.DepartmentMapper;
import com.projectDemo.pojo.Department;
import com.projectDemo.utils.MyBatisUtils;
import org.junit.Test;

/**
 * @author Cjl
 * @date 2021/7/3 10:28
 */
public class DepartmentTest {
    @Test
    public void findDeptWithEmpById(){
        DepartmentMapper departmentMapper = MyBatisUtils.getMapper(DepartmentMapper.class);
        Department deptWithEmpById = departmentMapper.findDeptWithEmpById(2);
        System.out.println(deptWithEmpById);

    }
}
