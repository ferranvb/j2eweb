package com.emprul.test;

import com.emprul.dao.ProjectDao;
import com.emprul.entity.Project;
import com.emprul.entity.Scientist;

public class Test {

	public static void main(String[] args) {
		ProjectDao pdao = new ProjectDao();
		
		for ( Project p : pdao.llistaProjectes()) {
			System.out.println(p.getName());
			System.out.println(p.getHours());
			for (Scientist s: p.getScientists()) {
				System.out.println("   :::::::::::" + s.getName());
			}
		}

	}

}
