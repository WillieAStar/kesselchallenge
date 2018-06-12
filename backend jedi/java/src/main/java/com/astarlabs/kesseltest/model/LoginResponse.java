package com.astarlabs.kesseltest.model;

import java.util.Date;

public class LoginResponse {

	private Result result;
	private Error error;
	private Date date;
	

}

class Result{
	private String status;
	private String token;
}

class Error{
	private String error;
	private String stack;
}
