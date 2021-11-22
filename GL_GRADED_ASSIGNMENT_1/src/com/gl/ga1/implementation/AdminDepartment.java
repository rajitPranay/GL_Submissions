package com.gl.ga1.implementation;

import com.gl.ga1.supercls.SuperDepartment;

public class AdminDepartment extends SuperDepartment  {
	public String departmentName()
	{
		return "Admin Department";
	}
	public String getTodaysWork()
	{
		return "Complete your documents Submission";
	}
	public String getWorkDeadline()
	{
		return "Complete by EOD ";
	}
	

}
