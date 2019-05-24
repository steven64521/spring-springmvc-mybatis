package com.jiexun.mapper;

import com.jiexun.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> getAllUsers();
}
