package springcloud.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.transaction.domain.User;
import springcloud.transaction.mapper.test01.UserMapper1;
import springcloud.transaction.mapper.test02.UserMapper2;

import javax.transaction.Transactional;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-09 20:05
 * @author: 十一
 */
@Service
public class UserService {

    @Autowired
    private UserMapper1 userMapper1;
    @Autowired
    private UserMapper2 userMapper2;

    @Transactional
    public void addUser(User user)throws Exception{
        userMapper1.addUser(user.getName(),user.getAge());
        userMapper2.addUser(user.getName(),user.getAge());
    }
}
