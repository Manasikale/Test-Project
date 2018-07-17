package com.test.automation;

public interface Oldclass
{  
	void show();  
	
}  
class newclass  implements Oldclass
{  
	public void show()
		{
		System.out.println("child class");
		}  
}  
class Lastclass implements Oldclass
{  
		public void show()
		{
			System.out.println("parent class");
			}  
		}  
