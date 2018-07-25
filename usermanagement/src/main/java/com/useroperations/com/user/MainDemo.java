package com.useroperations.com.user;
/**
 * @author Manasi J. Kale
 *
 */
class Inheritance1
{
int empid;
String empname;
public int getEmpid()
{
	return empid;
}
public void setEmpid(int empid) 
{
	this.empid = empid;
}
public String getEmpname()
{
	return empname;
}
public void setEmpname(String empname) 
{
	this.empname = empname;
}
}

class inherit extends Inheritance1
{
	long salary;
	public long getSalary()
	{
		return salary;
	}
	public void setSalary(long salary)
	{
		this.salary = salary;
	}
}
public class MainDemo
{
	public static void main(String args[])
	{
		inherit i=new inherit();
		i.setEmpid(101);
		i.setEmpname("manasi");
		i.setSalary(100000);
		
		System.out.println("Employee Id:"+i.getEmpid());
		System.out.println("Employee Name:"+i.getEmpname());
		System.out.println("Employee Salary:"+i.getSalary());		
	}
}