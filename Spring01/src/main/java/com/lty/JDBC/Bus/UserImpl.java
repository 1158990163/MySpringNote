package com.lty.JDBC.Bus;

import com.lty.JDBC.Bus.Dao.UserDao;
import com.lty.JDBC.Bus.Dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.SERIALIZABLE)

public class UserImpl implements User {

    @Autowired
    private UserDao userDao;

    @Override
    public void accountMoney() {
//        try{
            //开启事务

            //执行业务
            userDao.addMoney();
            int a = 10/0;
            userDao.increaseMoney();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
