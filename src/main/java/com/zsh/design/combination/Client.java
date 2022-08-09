package com.zsh.design.combination;

public class Client {

	public static void main(String[] args) {
		// 创建大学
		Component university = new University("清华大学", "非常好的大学");

		// 创建学院
		Component college1 = new College("信息工程学院", "信息工程学院好多专业");
		Component college2 = new College("建设工程学院", "建设工程学院好多专业");

		// 将学院添加到学校中
		university.add(college1);
		university.add(college2);

		// 创建专业，并把专业添加到学院中
		college1.add(new Department("计算机科学与技术", "计算机科学与技术好专业"));
		college1.add(new Department("网络工程", "网络工程好专业"));
		college2.add(new Department("土木", "土木好专业"));
		college2.add(new Department("测绘", "测绘好专业"));

		university.print();

	}

}
