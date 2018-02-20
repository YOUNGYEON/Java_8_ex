package com.iu.s1;

import java.util.Scanner;

public class StudentService {

	// 학생 추가 메서드 (1번)
	// 메서드명 addStudent 
	// 학생인원수 입력 
	// 이름입력 
	// 번호입력
	// 학생 인원수 만큼 

	Scanner sc = new Scanner (System.in);

	public Student [] addStudent() {

		System.out.println("학생수를 입력하세요");
		int n = sc.nextInt();

		Student [] students = new Student [n];

		for (int i=0 ; i<students.length;i++) {
			Student student = new Student(); // 학생한명 만들고 !!
			System.out.println("이름을 입력하세요");
			student.name = sc.next();			
			System.out.println("번호를 입력하세요");
			student.num = sc.nextInt();
			students[i]=student;
		}

		return students;


	}

	//메서드명은 addPoint 
	// 내용 : 각 학생의 점수 입력  

	public void addPoint(Student [] students) {
	
		Scanner sc= new Scanner (System.in);

		for (int i=0; i<students.length; i++) {

			System.out.println(students[i].name+"국어 점수를 입력하세요");
			students[i].kor = sc.nextInt();

			System.out.println(students[i].name+"영어 점수를 입력하세요");
			students[i].eng = sc.nextInt();

			System.out.println(students[i].name+"수학 점수를 입력하세요");
			students[i].math = sc.nextInt();
			
			students[i].total= students[i].kor+students[i].eng+students[i].math;
			students[i].avg = students[i].total/3.0;

		}
	

	}

}









