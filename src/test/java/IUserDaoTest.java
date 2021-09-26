import com.projectDemo.dao.IUserDao;
import com.projectDemo.pojo.User;
import com.projectDemo.utils.MyBatisUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cjl
 * @date 2021/7/5 16:45
 */
public class IUserDaoTest {
    @Test
    public void selectAll(){
        IUserDao userDao = MyBatisUtils.getMapper(IUserDao.class);
        List all = userDao.findAll();
        for (Object o : all) {
            System.out.println(o);
        }
        MyBatisUtils.commit();


        IUserDao userDao2 = MyBatisUtils.getMapper(IUserDao.class);
        System.out.println("userDao==userDao2???)"+(userDao==userDao2));
        List all2 = userDao2.findAll();
        System.out.println("all==all2???"+(all==all2));
        for (Object o : all2) {
            System.out.println(o);
        }


    }

    @Test
    public void findByOrder(){
        IUserDao userDao = MyBatisUtils.getMapper(IUserDao.class);
        User user = new User();
        user.setGender(0);


        List<User> byOrder = userDao.findByOrder(user);
        for (User user1 : byOrder) {
            System.out.println(user1);
        }
    }

    @Test
    public void update(){
        IUserDao userDao = MyBatisUtils.getMapper(IUserDao.class);
        User user = new User();
        user.setUid("9");
        user.setUsername("Rick");

        user.setAge(10000);
        int update = userDao.update(user);
        System.out.println(update);
        MyBatisUtils.commit();
    }

    @Test
    public void findByList(){
        IUserDao userDao = MyBatisUtils.getMapper(IUserDao.class);
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(5);

        List<User> byList = userDao.findByList(list);
        for (User user : byList) {
            System.out.println(user);
        }


    }


    @Test
    public void findByOrder2(){
        IUserDao userDao = MyBatisUtils.getMapper(IUserDao.class);
        User user = new User();
//        user.setGender(1);
        List<User> byOrder = userDao.findByOrder2(user);
        for (User user1 : byOrder) {
            System.out.println(user1);
        }
    }
}
