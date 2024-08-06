package in.ineuron.entities;

//Target Object
public class Student {

	private int sId;
	private String sName;
	
	private Course course[];

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Course[] getCourse() {
		return course;
	}

	public void setCourse(Course[] course) {
		this.course = course;
	}
	
	public void display() {
		System.out.println("------------------STUDENT DETAILS-----------------");
		System.out.println(getsId());
		System.out.println(getsName());
		
		System.out.println();
		System.out.println("------------------COURSE DETAILS------------------");
		
		for(Course courses:course) {
			System.out.println(courses.getcId());
			System.out.println(courses.getcName());
			System.out.println(courses.getcCost());
		}
	}
	
}
