package com.smart.dao.impl;
import com.smart.dao.UserInfoChangeDao;
import com.smart.entity.UserChangeInfoEntity;
import org.hibernate.SessionFactory;

public class UserInfoChangeDaoImpl implements UserInfoChangeDao {
    public static SessionFactory sessionFactory;
    @Override
    public int update(UserChangeInfoEntity entity) {
        return 0;
    }
}
