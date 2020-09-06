package com.atguigu.service.Impl;

import com.atguigu.dao.UserDao;
import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {


    // @Autowired   报红
    @Resource
    UserDao userDao;


    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}