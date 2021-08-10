package JavaCollections;

public class Student implements Comparable<Student>{

	String name;
	int rollno;
	
	public Student(String name, int rollNo) {
		this.name= name;
		this.rollno= rollNo;
	}
	
	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", rollNo=" + rollno + 
				'}';
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollno != other.rollno)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student that) {
		return this.rollno - that.rollno;
	}
	
	
}
