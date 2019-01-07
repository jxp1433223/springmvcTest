package com.neuedu.dao;

import com.neuedu.untilTest.RowMap;
import com.neuedu.pojo.User;
import com.neuedu.untilTest.JdbcUntil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaolmpl implements IUserDao {
    @Override
    public int insert(User user) {
        return JdbcUntil.executeUpdate("insert into user(username,password,tele) values(?,?,?)",user.getUsername(),user.getPassword(),user.getTele());
    }

    @Override
    public List<User> getLists() {
        return JdbcUntil.executeQuery("select * from user", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user = new User();
                try {
                    user.setId(rs.getInt("id"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    user.setTele(rs.getString("tele"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
            }, null);
    }

    @Override
    public User getOne(String username) {
        return JdbcUntil.QueryOne("select * from user where username=?", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User u = new User();
                try {
                    u.setId(rs.getInt("id"));
                    u.setUsername(rs.getString("username"));
                    u.setPassword(rs.getString("password"));
                    u.setTele(rs.getString("tele"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return u;
            }
        }, username);
    }

    @Override
    public int amend(User user) {
        int k = JdbcUntil.executeUpdate("update user set id=?,username=?,password=?,tele=? where id=?",user.getId(),user.getUsername(),user.getPassword(),user.getTele(),user.getId());
        return k;
    }

    @Override
    public int deleUser(int id) {  //删除
        return JdbcUntil.executeUpdate("delete from user where id=?",id);
    }

    @Override
    public User getOne(int id) {
        return JdbcUntil.QueryOne("select * from user where id=?", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User u = new User();
                try {
                    u.setId(rs.getInt("id"));
                    u.setUsername(rs.getString("username"));
                    u.setPassword(rs.getString("password"));
                    u.setTele(rs.getString("tele"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return u;
            }
        }, id);
    }
}
