package kodlama.io;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setEmail("engindemirog@gmail.com");
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Ezgi");
		student1.setLastName("Eyice");
		student1.setEmail("ezgieyice17@gmail.com");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Emre");
		student2.setLastName("Öztürk");
		student2.setEmail("emreoztrk@gmail.com");
		
		
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.add(student1);
		
		userManager.editProfile(student1);
		userManager.editProfile(instructor1);
		
	    InstructorManager instructorManager = new InstructorManager();
	    instructorManager.addLecture();
		
	    userManager.comment(student1);
		userManager.comment(instructor1);
		
		instructorManager.removeLecture();
		
		StudentManager studentManager = new StudentManager();
		studentManager.markLecture();
	}

}
