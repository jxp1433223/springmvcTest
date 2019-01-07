package com.neuedu.pojo;  /*这个包里面放表*/

public class User {
    private int id;
    private String username;
    private String password;
    private String tele;
    private int grade_id;
    public User() {
    }

    public User(int id, String username, String password, String tele, int grade_id) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tele = tele;
        this.grade_id = grade_id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tele='" + tele + '\'' +
                ", grade_id='" + grade_id + '\'' +
                '}';
    }
}
