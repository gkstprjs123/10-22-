package com.human.ex;

public class java001 {

	public static void main(String[] args) {
		//사용자가 1004를 입력할때까지 반복해보자.
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
//		for(;;) {
//			System.out.print("숫자를 입력해주세요:");
//			int a=Integer.parseInt(scanner.nextLine());
//			if(a==1004) {
//				System.out.print("반복문 끝");
//				break;
//			}else {
//				
//			}
		
		//1.while문과 for문을 이용해서 왼쪽 순서도를 프로그램으로 구현해 보자.
		//while 문
//		int a=2;
//		int b=1;
//		b++;
//		System.out.println(a+","+b);
//		while(b<15) {
//			a=a+1;
//			b=b+a;
//		}
//		System.out.println(a+","+b);
		//for 문
//		int a=2;
//		int b=1;
//		b++;
//		System.out.println(a+","+b);
//		for(int i=b; b<15; a=a+1,b=b+a) {
//			
//		}
//		System.out.println(a+","+b);
		
		//2.1~100사이의 약수를 구해라
		
//		for(int i=1; i<100; i++) {
//			if(100%i==0) {
//				System.out.println(i);
//			}
//		}
		
		//3.두 수를 입력받아 두수의 공통된 약수를 모두 출력해 보자. 0부터 하나씩 증가시키며 두수 모두 나눠지는 수를 출력하면 된다. 
		//출력된 수중에서 가장 큰수를 입력받은 두수의 최대공약수라고 한다.
//		System.out.print("첫번째 수를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 수를 입력해주세요:");
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
		
		//4.두수를 입력받아 두수의 최대 공약수를 구하는 프로그램을 만들어 보자.
//		System.out.print("첫번째 수를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 수를 입력해주세요:");
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
//		System.out.print("최대 공약수는"+t+"입니다");
		
		
		//5.사용자에게 숫자를 하나 입력받아 입력한 숫자들의
		//합이 100이 될때까지 계속입력을 받다가 100이 넘으면 합산을 출력하는 프로그램을 구현해보자.
//		int sum=0;
//		for(;;) {
//			System.out.print("숫자를 입력해주세요:");
//			int a=Integer.parseInt(scanner.nextLine());
//			
//			sum=sum+a;
//			if(sum>100) {
//				System.out.print(sum);
//				break;
//			}
//		}
		
		//6.사용자에게 계속해서 숫자를 입력받아 1~10사이의 숫자를 3번 입력 할 때 까지 반복한다. 
		//입력이 끝나면 잘못 입력한 회수와 제대로 입력한 회수를 출력하고 
		//사용자가 제대로 입력한 총합을 출력하는  프로그램을 만들어 보자.
		
//		int sum=0;
//		int aa=0;
//		int bb=0;
//		for(;;) {
//			System.out.print("숫자를 입력해주세요:");
//			int a=Integer.parseInt(scanner.nextLine());
//			if(1<=a&&a<=10) {
//				 aa++;
//				 sum=sum+a;
//				 if(aa==3) {
//					 System.out.print("제대로 입력한 횟수 "+aa+"잘못 입력한 횟수 "+bb+"총합 "+sum);
//					 break;
//				 }
//
//			}else {
//				bb++;
//			}
//				
//		}
		
		//7.두 수를 입력받아 최소공배수를 출력하는 프로그래믈 구현해보자
//		System.out.print("첫번째 수를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 수를 입력해주세요:");
//		int b=Integer.parseInt(scanner.nextLine());
//		int c=a*b;
//		System.out.print(a+"와"+b+"의 최소공배수는"+c+"이다");
		
		//8.3개의 수를 입력 받아 가장 작은 수와 가장 큰수를 출력하는 프로그램을 만들어 보자
//		System.out.print("첫번째 수를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 수를 입력해주세요:");
//		int b=Integer.parseInt(scanner.nextLine());
//		System.out.print("세번째 수를 입력해주세요:");
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
//		System.out.print("가장 작은수:"+a+" 가장 큰수"+c);
		
		//9.100이하의 수학과목 점수를 5번 입력받아 60이하 탈락자가 몇명인지 출력하는 프로그램을 구현해 보자.
//        int p=0;
//        for(int i=1; i<=5; i++) {
//        	System.out.print(i+"번의 점수를 입력해주세요:");
//    		int a=Integer.parseInt(scanner.nextLine());
//    		if(a>=60) {
//    			p++;
//    		}
//        }
//        System.out.print("탈락자는"+ p+"명 입니다");
		
		//10. 1부터 차례대로 더한 총합이 최초 100을 넘기 직전까지 누적한 결과값을 순서대로 출력하시오. 
		//1:1 2:3 3:6 4:10 5:15 6:21 …  100이전의 총합들을 다음과 같이 출력되면 된다
		
		
//		int sum=1;
//		for(int i=1; i<100; i++) {
//			
//			System.out.println(i+":"+sum);
//			sum=sum+i+1;
//			if(sum>100) {
//            	break;
//            }
//		}
		
		//11. 문자열과 숫자를 입력받아 입력받은 문자열을 숫자만큼 출력하는 프로그램을 만들어 보자.
//		System.out.print("숫자를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("문자를 입력해주세요:");
//		String b=(scanner.nextLine());
//		
//		for(int i=0; i<a; i++) {
//			System.out.println(b+" 입력받은 숫자만큼 출력");
//		}
		
		//2. 입력받은 두수 사이의 숫자들의 합을 구하는 프로그램을 만들어 보자.
		
//		System.out.print("숫자를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 숫자를 입력해주세요:");
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
		
		//13. 소수는 1과 자기 자신만으로 나누어지는 수이다. 2,3,5같은 경우 1과 본인 자신만으로 나누어지므로 소수이다. 
		//수를 하나 입력받아 소수인지 아닌지 판별하는 프로그램을 구현하시오.
		
//		System.out.print("숫자를 입력해주세요:");
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
//			System.out.print("소수이다");
//		}else {
//			System.out.print("소수가 아니다");
//		}
		
		//14. 두 수를 입력 받아 첫 번째수 부터 시작하여 하나씩 카운트하여 두번째수 수 만큼 화면에 출력 하는 프로그램을 만든다.
		// 5 6를 입력 받으면 5부터 6개 5 6 7 8 9 10 이 화면에 출력 된다.
//		System.out.print("숫자를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("두번째 숫자를 입력해주세요:");
//		int b=Integer.parseInt(scanner.nextLine());
//		
//		for(int i=0; i<b; i++) {
//			System.out.println(a);
//			a++;
//		}
		
		//15. 1~9 사이의 숫자를 하나 입력받아 해당 숫자의 구구단을 출력하여 보자.
//		System.out.print("숫자를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		
//		for(int i=1; i<10; i++) {			
//				System.out.println(a+"*"+i+"="+a*i);	
//		}
		
		//16. 숫자를 하나 입력받아 1~1000사이에 입력받은 숫자의 배수가 몇 개인지 출력하는 프로그램을 만들어 보자.
//		System.out.print("숫자를 입력해주세요:");
//		int a=Integer.parseInt(scanner.nextLine());
//		int num=0;
//		for(int i=1; i<=1000; i++) {
//			if(i%a==0) {
//				num++;
//			}
//		}
//		System.out.print(num+"개");
		
		//17. 사용자에게  행과 열을 입력받아 행과 열에 맞춰서 1부터 100까지 출력하는 프로그램을 구현해 보자. 행 가로 열 세로
//		System.out.print("행을 입력해주세요:"); //100까지 출력이면 10을 넣어야함
//		int a=Integer.parseInt(scanner.nextLine());
//		System.out.print("열을 입력해주세요:"); //여기도 10을 넣어야함
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
		
		//18. 다음과 같이 출력 되도록 프로그램을 완성해 보자.
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
		
		//19. 해당 달의 시작 요일과 일수를 입력 받아 달력을 출력해 보자.\t 탭을 이용해서 만들어 보자.
		
	  System.out.print("해당 달의 시작요일을 입력해주세요:"); 

	  String a=(scanner.nextLine());

	  System.out.print("일수를 입력해주세요:"); 

	  int b=Integer.parseInt(scanner.nextLine());

	  String day[]={"일","월","화","수","목","금","토"};

	  

	  

	        System.out.println("일\t월\t화\t수\t목\t금\t토");

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
