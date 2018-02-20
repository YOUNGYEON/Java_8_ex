package com.iu.s1;

import java.util.Scanner;

public class SchoolController {
	
	// 메서드명은 start 
	// 리턴은 없어
	// 내용 : 
	// 1. 학생     등록
	// 2. 성적     입력 
	// 3. 성적     조회
	// 4. 전체     조회
	// 5. 프로그램 종료 
	// 5번 누를때까지 돌아가 
	
	Scanner sc = new Scanner (System.in);
	boolean check=true;
	
	StudentService ss= new StudentService ();
	Student [] students = null;
	
	StudentView sv = new StudentView();
	
	public void start () {
		while(check) {
		System.out.println("1. 학생     등록");
		System.out.println("2. 성적     입력 ");
		System.out.println("3. 성적     조회");
		System.out.println("4. 전체     조회");
		System.out.println("5. 프로그램 종료");
		
		int n = sc.nextInt();
			
		switch (n) {
		case 1: 
			System.out.println("학생 등록");
			students=ss.addStudent();
			break;
		case 2:
			System.out.println("성적 입력");
			break;	
		case 3:
			System.out.println("성적 조회");
			break;			
		case 4 :
			System.out.println("전체 조회");
			sv.view(students);
			break;	
		
		default:
			System.out.println("프로그램 종료");
			check =false;
			break;	
			
		}
		}
		
	}
	
	

}
