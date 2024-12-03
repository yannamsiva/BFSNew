package com.ums.dao;

public interface UserDao {
public void register();
public boolean verifyUserNameAndPassWord(String uname,String pass);
String getPassWord(String email);
}
