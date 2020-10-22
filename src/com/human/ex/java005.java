package com.human.ex;

import com.human.dto.Phone;


public class java005 {

	public static void main(String[] args) {
		Phone a=new Phone();
		Phone.Name b=a.new Name();
		a.model="아이폰";
		a.price=350000;
		b.name="xr";
		System.out.println("====핸드폰====");
		System.out.println("이름\t가격\t핸드폰버전");
		System.out.println(a.model+"\t"+a.price+"\t"+b.name);
		
		a.model="갤럭시";
		a.price=50000;
		b.name="s9";
		System.out.println("====핸드폰====");
		System.out.println("이름\t가격\t핸드폰버전");
		System.out.println(a.model+"\t"+a.price+"\t"+b.name);
		
		a.model="v";
		a.price=50000;
		b.name="50";
		System.out.println("====핸드폰====");
		System.out.println("이름\t가격\t핸드폰버전");
		System.out.println(a.model+"\t"+a.price+"\t"+b.name);
		
		Phone c=new Phone();
		Phone.Name d=c.new Name();
		c.model="갤럭시";
		c.price=500000;
		d.name="s10";
		System.out.println(c.model+"\t"+c.price+"\t"+d.name);
		System.out.println(c.model+"\t"+c.price+"\t"+b.name);
		System.out.println(a.model+"\t"+a.price+"\t"+b.name);
		
		
//		System.out.println(Math.PI);
        
	}

}
