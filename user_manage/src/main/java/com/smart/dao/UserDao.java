package com.smart.dao;
import com.smart.entity.UserBaseEntity;
import com.smart.entity.SexEnum;
import com.smart.entity.RoleEnum;

import java.util.concurrent.ConcurrentHashMap;

public interface  UserDao {
    public int add(UserBaseEntity entity);
    public UserBaseEntity findUserById();
    public ConcurrentHashMap<T,UserBaseEntity> FindUserByName();



}
