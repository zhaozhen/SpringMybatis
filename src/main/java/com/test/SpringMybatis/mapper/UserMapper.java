package com.test.SpringMybatis.mapper;

import com.test.SpringMybatis.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by root on 2017/6/21.
 */

@Mapper
public interface UserMapper {
    @Select("select * from user where name = #{name}")
    User findUserByName(@Param("name") String name);


    @Insert("insert into users(name, age) values(#{name}, #{age})")
    public int add(User user);

    @Delete("delete from users where id = #{id}")
    public int deleteById(int id);

    @Update("update users set name = #{name}, age = #{age} where id = #{id}")
    public int update(User user);

    @Select("select * from users where id = #{id}")
    public User getUserById(int id);

    @Select("select * from users")
    public List<User> getAllUsers();
}
