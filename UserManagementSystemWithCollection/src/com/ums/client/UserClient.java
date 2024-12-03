package com.ums.client;

import java.util.Scanner;

import com.ums.dao.impl.UserDaoImpl;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UserDaoImpl daoImpl = new UserDaoImpl();
		while (true) {
			System.out.println(
					"===========================================================================================");
			System.out.println(
					"                     1)Login                                                               ");
			System.out.println(
					"                     2)Register                                                            ");
			System.out.println(
					"                     3)ForGotPassword                                                               ");
			System.out.println(
					"                     4)Exit                                                               ");

			System.out.println(
					"===========================================================================================");

			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter UserName");
				String uname = sc.next();
				System.out.println("Enter Password");
				String pass = sc.next();
				
				
				boolean verifyUserNameAndPassWord = daoImpl.verifyUserNameAndPassWord(uname, pass);
				
				if(uname.equals("admin")&&pass.equals("admin@123"))
				{
					System.out.println("Admin User");
				}
				else if (verifyUserNameAndPassWord) {
					System.out.println("Valid User");
				} else
					System.out.println("In Valid User");
				break;
			case 2:
				daoImpl.register();
				break;
			case 3:
				System.out.println("Enter Email");
				String passWord = daoImpl.getPassWord(sc.next());
				if (passWord != null)
					System.out.println(passWord);
				else
					System.out.println("Email doest not Exist");
				break;
			case 4:
				System.out.println("Thx for Using This App!");
				System.exit(0);
				break;
			default:
				System.out.println("Choose 1 to 4 between");

			}// end of switch

		} // end of while

	}

}
