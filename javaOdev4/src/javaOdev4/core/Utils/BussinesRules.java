package javaOdev4.core.Utils;

import java.util.ArrayList;
import java.util.List;

import javaOdev4.bussines.concretes.UserManager;
import javaOdev4.dataAccess.abstracts.UserDao;
import javaOdev4.dataAccess.concretes.UserInMemoryDao;
import javaOdev4.entities.concretes.User;

public class BussinesRules {
	
	
	 public static boolean run(boolean... logics) {
	   	 for(boolean b : logics) {
	   		 if(!b) return false;
	   	 }
	   	 return true;
	    }
	
}
