package com.zsh.design.template;

public class Client {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.prepareGotoSchool();
		
		Student student = new Student();
		student.prepareGotoSchool();
	}
}
