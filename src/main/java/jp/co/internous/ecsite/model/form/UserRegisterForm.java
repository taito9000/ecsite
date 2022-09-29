package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class UserRegisterForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    private String newUserName;
	    
	    private String newFullName;

	    private String newpassword;

	    public String getNewUserName() {
	        return newUserName;
	    	}

	    public void setNewUserName(String newUserName) {
	        this.newUserName = newUserName;
	    	}

	    public String getNewFullName() {
	    	return newFullName;
	    	}

	    public void setNewFullName(String newFullName) {
	        this.newFullName = newFullName;
	    	}
	    
	    public String getNewpassword() {
	    	return newpassword;
	    	}
	
	    public void setNewpassword(String newpassword) {
	    	this.newpassword=newpassword;
	    	}
	    }