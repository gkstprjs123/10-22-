package com.human.ex;

public class java001 {

	public static void main(String[] args) {
		//����ڰ� 1004�� �Է��Ҷ����� �ݺ��غ���.
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
//		for(;;) {
//			System.out.print("���ڸ� �Է����ּ���:");
//			int a=Integer.parseInt(scanner.nextLine());
//			if(a==1004) {
//				System.out.print("�ݺ��� ��");
//				break;
//			}else {
//				
//			}
		
		//1.while���� for���� �̿��ؼ� ���� �������� ���α׷����� ������ ����.
		//while ��
//		int a=2;
//		int b=1;
//		b++;
//		System.out.println(a+","+b);
//		while(b<15) {
//			a=a+1;
//			b=b+a;
//		}
//		System.out.println(a+","+b);
		//for ��
//		int a=2;
//		int b=1;
//		b++;
//		System.out.println(a+","+b);
//		for(int i=b; b<15; a=a+1,b=b+a) {
//			
//		}
//		System.out.println(a+","+b);
		
		//2.1~100������ ����� ���ض�
		
//		for(int i=1; i<100; i++) {
//			if(100%i==0) {
//				System.out.println(i);
//			}
//		}
		
		//3.�� ���� �Է¹޾� �μ��� ����� ����� ��� ����� ����. 0���� �ϳ��� ������Ű�� �μ� ��� �������� ���� ����ϸ� �ȴ�. 
		//��µ� ���߿��� ���� ū���� �Է¹��� �μ��� �ִ�������� �Ѵ�.
//		System.out.print("ù��° ���� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("�ι�° ���� �Է����ּ���:");
//		int b=Integer.parseInt(scanner.nextLine());
//		
//		
//		if(a<b) {
//			
//		}else {
//			int c=0;
//			c=b;
//			b=a;
//			a=c;
//		}
//		
//		for(int i=1; i<a; i++) {
//			if(a%i==0&&b%i==0){
//				System.out.println(i);
//			}else {
//				
//			}
//		}
		
		//4.�μ��� �Է¹޾� �μ��� �ִ� ������� ���ϴ� ���α׷��� ����� ����.
//		System.out.print("ù��° ���� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("�ι�° ���� �Է����ּ���:");
//		int b=Integer.parseInt(scanner.nextLine());
//
//		if(a<b) {
//			
//		}else {
//			int c=0;
//			c=b;
//			b=a;
//			a=c;
//		}
//		int t=0;
//		for(int i=1; i<a; i++) {
//			
//			if(a%i==0&&b%i==0){
//				t=i;
//			}else {
//				
//			}
//			
//		}
//		System.out.print("�ִ� �������"+t+"�Դϴ�");
		
		
		//5.����ڿ��� ���ڸ� �ϳ� �Է¹޾� �Է��� ���ڵ���
		//���� 100�� �ɶ����� ����Է��� �޴ٰ� 100�� ������ �ջ��� ����ϴ� ���α׷��� �����غ���.
//		int sum=0;
//		for(;;) {
//			System.out.print("���ڸ� �Է����ּ���:");
//			int a=Integer.parseInt(scanner.nextLine());
//			
//			sum=sum+a;
//			if(sum>100) {
//				System.out.print(sum);
//				break;
//			}
//		}
		
		//6.����ڿ��� ����ؼ� ���ڸ� �Է¹޾� 1~10������ ���ڸ� 3�� �Է� �� �� ���� �ݺ��Ѵ�. 
		//�Է��� ������ �߸� �Է��� ȸ���� ����� �Է��� ȸ���� ����ϰ� 
		//����ڰ� ����� �Է��� ������ ����ϴ�  ���α׷��� ����� ����.
		
//		int sum=0;
//		int aa=0;
//		int bb=0;
//		for(;;) {
//			System.out.print("���ڸ� �Է����ּ���:");
//			int a=Integer.parseInt(scanner.nextLine());
//			if(1<=a&&a<=10) {
//				 aa++;
//				 sum=sum+a;
//				 if(aa==3) {
//					 System.out.print("����� �Է��� Ƚ�� "+aa+"�߸� �Է��� Ƚ�� "+bb+"���� "+sum);
//					 break;
//				 }
//
//			}else {
//				bb++;
//			}
//				
//		}
		
		//7.�� ���� �Է¹޾� �ּҰ������ ����ϴ� ���α׷��� �����غ���
//		System.out.print("ù��° ���� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("�ι�° ���� �Է����ּ���:");
//		int b=Integer.parseInt(scanner.nextLine());
//		int c=a*b;
//		System.out.print(a+"��"+b+"�� �ּҰ������"+c+"�̴�");
		
		//8.3���� ���� �Է� �޾� ���� ���� ���� ���� ū���� ����ϴ� ���α׷��� ����� ����
//		System.out.print("ù��° ���� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("�ι�° ���� �Է����ּ���:");
//		int b=Integer.parseInt(scanner.nextLine());
//		System.out.print("����° ���� �Է����ּ���:");
//		int c=Integer.parseInt(scanner.nextLine());
//		
//		if(a>b) {
//			int t=0;
//			t=a;
//			a=b;
//			b=t;
//		}
//		if(b>c) {
//			int t=0;
//			t=b;
//			b=c;
//			c=t;
//		}
//		if(a>b) {
//			int t=0;
//			t=a;
//			a=b;
//			b=t;
//		}
//		
//		
//		System.out.print("���� ������:"+a+" ���� ū��"+c);
		
		//9.100������ ���а��� ������ 5�� �Է¹޾� 60���� Ż���ڰ� ������� ����ϴ� ���α׷��� ������ ����.
//        int p=0;
//        for(int i=1; i<=5; i++) {
//        	System.out.print(i+"���� ������ �Է����ּ���:");
//    		int a=Integer.parseInt(scanner.nextLine());
//    		if(a>=60) {
//    			p++;
//    		}
//        }
//        System.out.print("Ż���ڴ�"+ p+"�� �Դϴ�");
		
		//10. 1���� ���ʴ�� ���� ������ ���� 100�� �ѱ� �������� ������ ������� ������� ����Ͻÿ�. 
		//1:1 2:3 3:6 4:10 5:15 6:21 ��  100������ ���յ��� ������ ���� ��µǸ� �ȴ�
		
		
//		int sum=1;
//		for(int i=1; i<100; i++) {
//			
//			System.out.println(i+":"+sum);
//			sum=sum+i+1;
//			if(sum>100) {
//            	break;
//            }
//		}
		
		//11. ���ڿ��� ���ڸ� �Է¹޾� �Է¹��� ���ڿ��� ���ڸ�ŭ ����ϴ� ���α׷��� ����� ����.
//		System.out.print("���ڸ� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("���ڸ� �Է����ּ���:");
//		String b=(scanner.nextLine());
//		
//		for(int i=0; i<a; i++) {
//			System.out.println(b+" �Է¹��� ���ڸ�ŭ ���");
//		}
		
		//2. �Է¹��� �μ� ������ ���ڵ��� ���� ���ϴ� ���α׷��� ����� ����.
		
//		System.out.print("���ڸ� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("�ι�° ���ڸ� �Է����ּ���:");
//		int b=Integer.parseInt(scanner.nextLine());
//		int c=0;
//		for(;;) {
//			if(a==b) {
//				break;
//			}else {
//				a++;
//				if(a==b) {
//					
//				}else {
//					c=c+a;
//				}
//				
//			}
//		}
//		System.out.print(c);
		
		//13. �Ҽ��� 1�� �ڱ� �ڽŸ����� ���������� ���̴�. 2,3,5���� ��� 1�� ���� �ڽŸ����� ���������Ƿ� �Ҽ��̴�. 
		//���� �ϳ� �Է¹޾� �Ҽ����� �ƴ��� �Ǻ��ϴ� ���α׷��� �����Ͻÿ�.
		
//		System.out.print("���ڸ� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		boolean aa=true;
//		
//		for(int i=2; i<a; i++) {
//			if(a%i==0) {
//				aa=false;
//			}else {
//				
//			}
//		}
//		if(aa==true) {
//			System.out.print("�Ҽ��̴�");
//		}else {
//			System.out.print("�Ҽ��� �ƴϴ�");
//		}
		
		//14. �� ���� �Է� �޾� ù ��°�� ���� �����Ͽ� �ϳ��� ī��Ʈ�Ͽ� �ι�°�� �� ��ŭ ȭ�鿡 ��� �ϴ� ���α׷��� �����.
		// 5 6�� �Է� ������ 5���� 6�� 5 6 7 8 9 10 �� ȭ�鿡 ��� �ȴ�.
//		System.out.print("���ڸ� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("�ι�° ���ڸ� �Է����ּ���:");
//		int b=Integer.parseInt(scanner.nextLine());
//		
//		for(int i=0; i<b; i++) {
//			System.out.println(a);
//			a++;
//		}
		
		//15. 1~9 ������ ���ڸ� �ϳ� �Է¹޾� �ش� ������ �������� ����Ͽ� ����.
//		System.out.print("���ڸ� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		
//		for(int i=1; i<10; i++) {			
//				System.out.println(a+"*"+i+"="+a*i);	
//		}
		
		//16. ���ڸ� �ϳ� �Է¹޾� 1~1000���̿� �Է¹��� ������ ����� �� ������ ����ϴ� ���α׷��� ����� ����.
//		System.out.print("���ڸ� �Է����ּ���:");
//		int a=Integer.parseInt(scanner.nextLine());
//		int num=0;
//		for(int i=1; i<=1000; i++) {
//			if(i%a==0) {
//				num++;
//			}
//		}
//		System.out.print(num+"��");
		
		//17. ����ڿ���  ��� ���� �Է¹޾� ��� ���� ���缭 1���� 100���� ����ϴ� ���α׷��� ������ ����. �� ���� �� ����
//		System.out.print("���� �Է����ּ���:"); //100���� ����̸� 10�� �־����
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("���� �Է����ּ���:"); //���⵵ 10�� �־����
//		int b=Integer.parseInt(scanner.nextLine());
//		
//	    int z=1;
//	    for(int i=0; i<a; i++) {
//	    	for(int j=0; j<b; j++) {
//	    		System.out.print(z+" ");
//	    		z++;
//	    	}
//	    	System.out.println("");
//	    }
		
		//18. ������ ���� ��� �ǵ��� ���α׷��� �ϼ��� ����.
//		1   2   3   4   5
//		10  9   8   7   6
//		11 12  13  14  15
//		21 22  23  24  25
//		int z=1;
//		int y=10;
//		for(int i=0; i<4; i++) {
//			if(i%2==0) {
//		    	for(int j=0; j<5; j++) {
//		    		if(i==2) {
//		    			y++;
//		    			System.out.print(y+" ");
//		    		}else if(i==0){		    			
//		    			System.out.print(z+" ");
//		    			z++;
//		    		}
//		    	}
//			}else {
//				for(int j=0; j<5; j++) {
//		    		if(i==1) {
//		    			z=10;
//		    			z=z-j;
//		    			System.out.print(z+" ");		    			
//		    		}else if(i==3){
//		    		    y=21;
//		    		    y=y+j;
//		    			System.out.print(y+" ");
//		    		}
//		    	}
//			}
//			System.out.println("");
//		}
		
		//19. �ش� ���� ���� ���ϰ� �ϼ��� �Է� �޾� �޷��� ����� ����.\t ���� �̿��ؼ� ����� ����.
		
	  System.out.print("�ش� ���� ���ۿ����� �Է����ּ���:"); 

	  String a=(scanner.nextLine());

	  System.out.print("�ϼ��� �Է����ּ���:"); 

	  int b=Integer.parseInt(scanner.nextLine());

	  String day[]={"��","��","ȭ","��","��","��","��"};

	  

	  

	        System.out.println("��\t��\tȭ\t��\t��\t��\t��");

	  if(a.equals(day[0])) {

	   int num=1;

	   

	   for(int i=0; i<6; i++) {

	    for(int j=0; j<day.length; j++) {

	     if(num<=b) {

	      System.out.print(num+"\t");

	      num++;

	     }else {

	      break;

	     }

	    }

	    System.out.println("");

	   }   

	  }else if(a.equals(day[1])) {

	   int num=1;   

	   for(int i=0; i<6; i++) {

	    for(int j=0; j<day.length; j++) {

	     if(i==0) {

	      if(j>0) {

	       System.out.print(num+"\t");

	       num++;       

	      }else {

	       System.out.print("\t");

	      }

	     }else {     

	      if(num<=b) {

	       System.out.print(num+"\t");

	       num++;

	      }else {

	       break;

	      }

	         }    

	    }

	    System.out.println("");

	   } 

	  }else if(a.equals(day[2])) {

	   int num=1;   

	   for(int i=0; i<6; i++) {

	    for(int j=0; j<day.length; j++) {

	     if(i==0) {

	      if(j>1) {

	       System.out.print(num+"\t");

	       num++;       

	      }else {

	       System.out.print("\t");

	      }

	     }else {     

	      if(num<=b) {

	       System.out.print(num+"\t");

	       num++;

	      }else {

	       break;

	      }

	         }    

      }

	    System.out.println("");

	   } 

	  }else if(a.equals(day[3])) {

	   int num=1;   

     for(int i=0; i<6; i++) {

	    for(int j=0; j<day.length; j++) {

	     if(i==0) {

	      if(j>2) {

	       System.out.print(num+"\t");

	       num++;       

	      }else {

	       System.out.print("\t");

	      }

	     }else {     

	      if(num<=b) {

	       System.out.print(num+"\t");

	       num++;

	      }else {

	       break;

	      }

	         }    

	    }

	    System.out.println("");

	   } 

	  }else if(a.equals(day[4])) {

	   int num=1;   

	   for(int i=0; i<6; i++) {

	    for(int j=0; j<day.length; j++) {

	     if(i==0) {

	      if(j>3) {

	       System.out.print(num+"\t");

	       num++;       

	      }else {

	       System.out.print("\t");

	      }

	     }else {     

	      if(num<=b) {

	       System.out.print(num+"\t");

	       num++;

	      }else {

	       break;

	      }

	         }    

	    }

	    System.out.println("");

	   } 

	  }else if(a.equals(day[5])) {

	   int num=1;   

	   for(int i=0; i<6; i++) {

	    for(int j=0; j<day.length; j++) {

	     if(i==0) {

	      if(j>4) {

	       System.out.print(num+"\t");

	       num++;       

	      }else {

	       System.out.print("\t");

	      }

	     }else {     

	      if(num<=b) {

	       System.out.print(num+"\t");

	       num++;

	      }else {

	       break;

	      }

	         }    

	    }

	    System.out.println("");

	   } 

	  }else if(a.equals(day[6])) {

	   int num=1;   

	   for(int i=0; i<7; i++) {

	    for(int j=0; j<day.length; j++) {

	     if(i==0) {

	      if(j>5) {

	       System.out.print(num+"\t");

	       num++;       

	      }else {

	       System.out.print("\t");

	      }

	     }else {     

	      if(num<=b) {

	       System.out.print(num+"\t");

	       num++;

	      }else {

	       break;

	      }

	         }    

	    }

	    System.out.println("");

	   } 

	  }
			
		


		
		
		


			
	

	

	}

}
