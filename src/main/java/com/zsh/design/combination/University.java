package com.zsh.design.combination;

import java.util.ArrayList;
import java.util.List;

/*
 * 大学
 */
public class University extends Component{

	//List存放的是学院的信息
    List<Component> components =  new ArrayList<>();
	
	public University(String name, String desc) {
		super(name, desc);
	}

	
	@Override
	protected void add(Component component) {
		// TODO Auto-generated method stub
		components.add(component);
	}

	@Override
	protected void remove(Component component) {
		// TODO Auto-generated method stub
		components.remove(component);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes();
	}

	@Override
	protected void print() {
		// TODO Auto-generated method stub
		 System.out.println("===============名称："+getName()+"描述："+getDes()+"===============");
	        for (Component coms : components){
	            coms.print();
	        }
	}

}
