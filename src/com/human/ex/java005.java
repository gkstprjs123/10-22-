package com.human.ex;

import com.human.dto.Phone;


public class java005 {

	public static void main(String[] args) {
		Phone a=new Phone();
		Phone.Name b=a.new Name();
		a.model="������";
		a.price=350000;
		b.name="xr";
		System.out.println("====�ڵ���====");
		System.out.println("�̸�\t����\t�ڵ�������");
		System.out.println(a.model+"\t"+a.price+"\t"+b.name);
		
		a.model="������";
		a.price=50000;
		b.name="s9";
		System.out.println("====�ڵ���====");
		System.out.println("�̸�\t����\t�ڵ�������");
		System.out.println(a.model+"\t"+a.price+"\t"+b.name);
		
		a.model="v";
		a.price=50000;
		b.name="50";
		System.out.println("====�ڵ���====");
		System.out.println("�̸�\t����\t�ڵ�������");
		System.out.println(a.model+"\t"+a.price+"\t"+b.name);
		
		Phone c=new Phone();
		Phone.Name d=c.new Name();
		c.model="������";
		c.price=500000;
		d.name="s10";
		System.out.println(c.model+"\t"+c.price+"\t"+d.name);
		System.out.println(c.model+"\t"+c.price+"\t"+b.name);
		System.out.println(a.model+"\t"+a.price+"\t"+b.name);
		
		
//		System.out.println(Math.PI);
        
	}

}
