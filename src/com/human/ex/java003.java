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
		d.company="금호";
		d.mileage=25000;
		d.price=300000;
		System.out.println("========BMW=========");
		System.out.println("색상\t회사\t최고속력\t모델명\t");
		System.out.print(c.color+"\t");
		System.out.print(c.company+"\t");
		System.out.print(c.maxSpeed+"\t");
		System.out.println(c.model+"\t");
		System.out.println("타이어 정보");
		System.out.println("회사\t주행거리\t가격\t");
		System.out.print(d.company+"\t");
		System.out.print(d.mileage+"\t");
		System.out.println(d.price+"\t");
		
		c.color="blue";
		c.company="아우디";
		c.maxSpeed=300;
		c.model="r8";
		d.company="금호";
		d.mileage=26000;
		d.price=300000;
		System.out.println("========아우디=========");
		System.out.println("색상\t회사\t최고속력\t모델명\t");
		System.out.print(c.color+"\t");
		System.out.print(c.company+"\t");
		System.out.print(c.maxSpeed+"\t");
		System.out.println(c.model+"\t");
		System.out.println("타이어 정보");
		System.out.println("회사\t주행거리\t가격\t");
		System.out.print(d.company+"\t");
		System.out.print(d.mileage+"\t");
		System.out.println(d.price+"\t");
		
		c.color="silver";
		c.company="벤츠";
		c.maxSpeed=310;
		c.model="e클래스";
		d.company="금호";
		d.mileage=30000;
		d.price=300000;
		System.out.println("========벤츠=========");
		System.out.println("색상\t회사\t최고속력\t모델명\t");
		System.out.print(c.color+"\t");
		System.out.print(c.company+"\t");
		System.out.print(c.maxSpeed+"\t");
		System.out.println(c.model+"\t");
		System.out.println("타이어 정보");
		System.out.println("회사\t주행거리\t가격\t");
		System.out.print(d.company+"\t");
		System.out.print(d.mileage+"\t");
		System.out.print(d.price+"\t");

	}

}
