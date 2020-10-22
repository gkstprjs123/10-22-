package com.human.ex;

public class Java006 {

	public static void main(String[] args) {
		int num=1352;
		int num2=num+11;
		for(int i=0; i<4; i++) {
			if(i==0) {
				for(int j=0; j<4; j++) {
					System.out.print(num+"\t");
					num++;
				}
				System.out.println("");
			}else if(i==1) {
				for(int j=0; j<4; j++) {
					if(j<3) {
						System.out.print(num2+"\t");
						num2++;
					}else {
						System.out.print(num);
						num++;
					}					
				}
				System.out.println("");
			}else if(i==2) {
				num2=num2-4;
				for(int j=0; j<4; j++) {
					if(j==0) {
						System.out.print(num2+"\t");
						num2+=5;
					}else {
						if(j<3) {
							System.out.print(num2+"\t");
							num2--;
						}else {
							System.out.print(num);
						}
					}
				}
				System.out.println("");
			}else if(i==3) {
				num=num2-4;
				for(int j=0; j<4; j++) {
					System.out.print(num+"\t");
					num--;
				}			
			}
		}
	}

}
