package kodlama.io;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println("Kullanýcý sisteme kayýt edildi. " + user.firstName +" " + user.lastName);
	}
	
	public void comment(User user) {
		
		System.out.println("Yorumunuz gönderildi. " + user.firstName +" " + user.lastName);
	}
	
	public void editProfile(User user) {
		
		System.out.println("Profiliniz güncellendi. " + user.firstName +" " + user.lastName);
	}
	
	
	
	
}
