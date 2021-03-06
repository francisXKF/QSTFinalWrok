package com.qst.francis.dao;

import java.util.List;

import com.qst.francis.pojo.User;

public interface UserDao {
	public boolean login(String user_name, String user_password);
	public boolean register(User user);
	public List<User> queryByName(String user_name);
	public List<User> queryById(int userId, int start, int step);
	public int queryCnt(int userId);
	public boolean deleteById(int userId);
	public boolean updatePassword(int userId, String password);
}
