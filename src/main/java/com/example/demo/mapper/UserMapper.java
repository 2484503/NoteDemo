package com.example.demo.mapper;

import com.example.demo.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User getUserByNamePassword(@Param("username") String username, @Param("password") String password);
}