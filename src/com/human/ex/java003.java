package com.human.ex;
import com.human.dto.*;

public class java003 {

	public static void main(String[] args) {
			
		Car c=new Car();
		Car.Tire d=c.new Tire();
		c.color="red";
		c.company="bmw";
		c.maxSpeed=300;
		c.model="x5";
		d.company="��ȣ";
		d.mileage=25000;
		d.price=300000;
		System.out.println("========BMW=========");
		System.out.println("����\tȸ��\t�ְ�ӷ�\t�𵨸�\t");
		System.out.print(c.color+"\t");
		System.out.print(c.company+"\t");
		System.out.print(c.maxSpeed+"\t");
		System.out.println(c.model+"\t");
		System.out.println("Ÿ�̾� ����");
		System.out.println("ȸ��\t����Ÿ�\t����\t");
		System.out.print(d.company+"\t");
		System.out.print(d.mileage+"\t");
		System.out.println(d.price+"\t");
		
		c.color="blue";
		c.company="�ƿ��";
		c.maxSpeed=300;
		c.model="r8";
		d.company="��ȣ";
		d.mileage=26000;
		d.price=300000;
		System.out.println("========�ƿ��=========");
		System.out.println("����\tȸ��\t�ְ�ӷ�\t�𵨸�\t");
		System.out.print(c.color+"\t");
		System.out.print(c.company+"\t");
		System.out.print(c.maxSpeed+"\t");
		System.out.println(c.model+"\t");
		System.out.println("Ÿ�̾� ����");
		System.out.println("ȸ��\t����Ÿ�\t����\t");
		System.out.print(d.company+"\t");
		System.out.print(d.mileage+"\t");
		System.out.println(d.price+"\t");
		
		c.color="silver";
		c.company="����";
		c.maxSpeed=310;
		c.model="eŬ����";
		d.company="��ȣ";
		d.mileage=30000;
		d.price=300000;
		System.out.println("========����=========");
		System.out.println("����\tȸ��\t�ְ�ӷ�\t�𵨸�\t");
		System.out.print(c.color+"\t");
		System.out.print(c.company+"\t");
		System.out.print(c.maxSpeed+"\t");
		System.out.println(c.model+"\t");
		System.out.println("Ÿ�̾� ����");
		System.out.println("ȸ��\t����Ÿ�\t����\t");
		System.out.print(d.company+"\t");
		System.out.print(d.mileage+"\t");
		System.out.print(d.price+"\t");

	}

}
