package com.neuedu.service;   /*这个包是逻辑处理*/

import com.neuedu.dao.IUserDao;
import com.neuedu.dao.UserDaolmpl;
import com.neuedu.pojo.User;

import java.util.List;

public class UserServiceImpl implements IUserService {
    private IUserDao dao = new UserDaolmpl();
    @Override
    public int insert(User user) {   //去调用了一下dao层
        return dao.insert(user);
    }

    @Override
    public User getOne(String username) {  //通过用户名查找出这个用户
        return dao.getOne(username);   //去dao层，通过用户名查找出这个用户
    }

    @Override
    public int amend(User user) {  //修改
        return dao.amend(user);
    }

    @Override
    public List<User> getLists() {
        return dao.getLists();
    }

    @Override
    public int deleUser(int id) {
        return dao.deleUser(id);
    }

    @Override
    public User getOne(int id) {
        return dao.getOne(id);
    }
}
