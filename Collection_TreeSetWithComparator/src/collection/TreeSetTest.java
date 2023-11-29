package collection;

public class TreeSetTest {

	public static void main(String[] args) {

		// 반 생성
		ClassRoom class1 = new ClassRoom(1);
		
		Student s1 = new Student ("23001", "둘리", 30);
		Student s2 = new Student ("23002", "또치", 90);
		Student s3 = new Student ("23003", "희동", 68);
		Student s4 = new Student ("23004", "길동", 45);
		
		class1.addStudents(s1); // collection.Student cannot be cast to java.lang.Comparable
		class1.addStudents(s2);
		class1.addStudents(s3);
		class1.addStudents(s4);
		
		class1.outputStudent();
		
	}
}
