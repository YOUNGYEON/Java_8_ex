package com.iu.s1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		SchoolController sc= new SchoolController();
		sc.start(); 
		// 같아 => new SchoolController().start(); 스타트 메소드 한번 호출하면 더이상 호출할 일이 없을때사용
		
		
		//System.out.println("program start");
		
		/*
		// 객체 : 눈에 보이는 사물 또는 개념 
		// 학생 : 3명 , 1명당 Object 
		Scanner sc = new Scanner (System.in);
		Student [] ar = new Student[2];  // 학생 객체를 담을수있는 공간만 만듬  아직 학생은 안채워짐   학생 1명은 집어 넣어야 
		Student student = new Student();

		for (int i =0;i<ar.length;i++) {
			student.name =sc.next();
			ar[i]=student; // i=0  iu   i=1  suji
			System.out.println(ar[i].name);

		}

		System.out.println("==================");
		for (int i = 0;i<ar.length;i++) {
			student = new Student();
			student.name= sc.next();
			ar[i]=student; // i=0  iu   i=1  suji
			System.out.println(ar[i].name);
		}
		
		ar[0]= student;  // 이게 있어야 함 . 한명은 들어가야 
		ar[1] = new Student();// 어떻게든 집어 넣어야 
		ar[0].name = sc.next();//suji  빈교실로 가서 첫번째에 넣어라 0번이름 넣어라? 불가능 
		System.out.println(ar[0].name);  //suji 안나옴 에러. 
*/
		
		
	}

}
