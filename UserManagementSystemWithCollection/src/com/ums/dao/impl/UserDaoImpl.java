package com.ums.dao.impl;

import java.util.ArrayList;
import java.util.Scanner;

import com.ums.dao.UserDao;
import com.ums.model.User;

public class UserDaoImpl implements UserDao {

	Scanner sc = new Scanner(System.in);
	ArrayList<User> addUsers = new ArrayList<>();

	@Override
	public void register() {
		// TODO Auto-generated method stub
		int k = 1;
		while (k == 1) {
			System.out.println("Enter User Id");
			int id = sc.nextInt();
			System.out.println("Enter First Name");
			String fname = sc.next();
			System.out.println("Enter Last Name");
			String lname = sc.next();
			System.out.println("Enter Email");
			String email = sc.next();
			System.out.println("Enter UserName");
			String uname = sc.next();
			System.out.println("Enter PassWord");
			String pass = sc.next();
			User user = new User(id, fname, lname, email, uname, pass);
			addUsers.add(user);
			System.out.println("Registration Successfull");

			System.out.println("Do You want to add one More User 1)Yes  2)No");
			k = sc.nextInt();

		} // end of while

	}

	@Override
	public boolean verifyUserNameAndPassWord(String uname, String pass) {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(User user :  addUsers)
		{
			if(user.getUserName().equals(uname)&&user.getPassWord().equals(pass))
			{
				flag=true;
				break;
			}
		}
		
		
		
		return flag;
	}

	@Override
	public String getPassWord(String email) {
		// TODO Auto-generated method stub
		
		for(User user :  addUsers)
		{
		if(user.getEmail().equals(email))
		{
			return user.getPassWord();
		}
		
		}
		
		return null;
	}

}
