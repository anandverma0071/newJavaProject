package com.coforge.githubJavaEx.GithubJavaProject;

import java.util.Scanner;

import com.coforge.githubJavaEx.GithubJavaProject.Service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeServiceImpl e =new EmployeeServiceImpl();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("ENTER 1 FOR ADDEMP AND 2 FOR DISPEMP");
    	switch(sc.nextInt()) {
    	case 1: e.addEmp();
    	
    	case 2: e.displayEmp();
    			break;
    			
    	default: System.out.println("Requesting you to enter only 1 or 2");
    			break;
    	}
    }
}
