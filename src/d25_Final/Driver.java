package d25_Final;

public class Driver {

	public static void main(String[] args) {

		Student student = new Student(11);
		System.out.println(student.getNumber());

		UniStudent uniStudent = new UniStudent(12);
		System.out.println(uniStudent.getNumber());
		uniStudent.yazdir();
	}

}
