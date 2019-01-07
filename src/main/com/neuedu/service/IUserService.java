package com.neuedu.service; /*这个包是逻辑处理*/

import com.neuedu.pojo.User;

import java.util.List;

public interface IUserService {
    public int insert(User user);
    public User getOne(String username);
    public int amend(User user);
    public List<User> getLists();
    public int deleUser(int id);
    public User getOne(int id);
}
