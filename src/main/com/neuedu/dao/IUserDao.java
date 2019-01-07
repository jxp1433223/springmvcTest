package com.neuedu.dao;

import com.neuedu.pojo.User;

import java.util.List;

public interface IUserDao {
    public int insert(User user);
    public List<User> getLists();
    public User getOne(String username);
    public int amend(User user);
    public int deleUser(int id);
    public User getOne(int id);
}
