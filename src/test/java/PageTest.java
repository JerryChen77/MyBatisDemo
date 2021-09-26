import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.projectDemo.dao.IUserDao;
import com.projectDemo.pojo.User;
import com.projectDemo.utils.MyBatisUtils;
import org.junit.Test;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/7/2 20:22
 */
public class PageTest {

  @Test
  public void pageTest(){
      PageHelper.startPage(1, 3);
      IUserDao userDao = MyBatisUtils.getMapper(IUserDao.class);
      List all = userDao.findAll();

      PageInfo pageInfo = new PageInfo(all);
      List list = pageInfo.getList();
      for (Object o : list) {
          System.out.println(o);
      }

  }

}
