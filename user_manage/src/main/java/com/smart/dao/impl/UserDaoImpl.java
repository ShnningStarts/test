package com.smart.dao.impl;

import com.smart.dao.UserDao;
import com.smart.entity.UserBaseEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UserDaoImpl implements UserDao{

    public static SessionFactory sessionFactory;
    static {
        try {
          sessionFactory=new Configuration().addClass(UserBaseEntity.class).buildSessionFactory();
        }catch (RuntimeException e){e.printStackTrace();}
    }
    @Override
    public int add(UserBaseEntity user) {
        Session session=sessionFactory.openSession();
        Transaction tx=null;
        try {
            tx=session.beginTransaction();
            session.createQuery("from UserBaseEntity c WHERE c.id>0", UserBaseEntity.class).list().iterator();

            session.save(UserBaseEntity.class);
            tx.commit();
        }catch (RuntimeException e){
            if (tx!=null){tx.rollback();}throw  e;
        }finally {
            session.close();
        }



        return 0;
    }

}
