package kodlama.io;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println("Kullan�c� sisteme kay�t edildi. " + user.firstName +" " + user.lastName);
	}
	
	public void comment(User user) {
		
		System.out.println("Yorumunuz g�nderildi. " + user.firstName +" " + user.lastName);
	}
	
	public void editProfile(User user) {
		
		System.out.println("Profiliniz g�ncellendi. " + user.firstName +" " + user.lastName);
	}
	
	
	
	
}
