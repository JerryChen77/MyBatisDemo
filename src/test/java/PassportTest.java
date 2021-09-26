import com.projectDemo.dao.PassPortMapper;
import com.projectDemo.pojo.PassPort;
import com.projectDemo.utils.MyBatisUtils;
import org.junit.Test;

/**
 * @author Cjl
 * @date 2021/7/3 9:20
 */
public class PassportTest {
    @Test
    public void findPassportWithPassengerById(){
        PassPortMapper passPortMapper = MyBatisUtils.getMapper(PassPortMapper.class);
        PassPort passportWithPassengerById = passPortMapper.findPassportWithPassengerById(2);

        System.out.println(passportWithPassengerById);



    }

}
