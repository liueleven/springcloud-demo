package springcloud.transaction.mapper.test01;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-09 20:07
 * @author: 十一
 */
@Mapper
public interface UserMapper1 {

    @Insert("insert into test_user(name,age) values(#{name},#{age})")
    void addUser(@Param("name")String name, @Param("age") int age);
}
