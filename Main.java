import java.util.Scanner;

public class Main {
	
	private static Singer singer = new Singer();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("\t Welcome to Singer Application");
		
		show_operations();
		
		boolean isRunning = true;
		int transaction;
		
		while(isRunning) {
			System.out.println("Please select transaction : ");
			
			transaction = scanner.nextInt();
			
			scanner.nextLine();
			
			switch (transaction) {
				case 0:
					show_operations();
					break;
				case 1:
					show_singer();
					break;
				case 2:
					add_singer();
					break;
				case 3:
					update_singer();
					break;
				case 4:
					delete_singer();
					break;
				case 5:
					search_singer();
					break;
				case 6:
					System.out.println("Goodbye...");
					isRunning = false;
					break;
			}
		}
	}
	public static void show_operations() {
		System.out.println("\t 0 - Operations");
		System.out.println("\t 1 - Showing Singers");
		System.out.println("\t 2 - Adding Singer");
		System.out.println("\t 3 - Updating Sİnger");
		System.out.println("\t 4 - Deleting Singer");
		System.out.println("\t 5 - Searching Singer");
		System.out.println("\t 6 - Exit");
	}
	
	public static void show_singer() {
		singer.show_singer();
	}
	
	public static void add_singer() {
		System.out.println("Enter a singer name : ");
		String singer_name = scanner.nextLine();
		singer.add_singer(singer_name);
	}
	
	public static void update_singer() {
		System.out.println("The position that you would like to update (1, 2, 3....) : ");
		
		int position = scanner.nextInt();
		scanner.nextLine();
		String newSinger_name = scanner.nextLine();
		
		singer.update_singer(newSinger_name, position-1);
	}
	public static void delete_singer() {
		System.out.println("The position that you would like to delete (1, 2, 3....) : ");
		
		int position = scanner.nextInt();		
		singer.delete_singer(position-1);
	}
	public static void search_singer() {
		System.out.println("The singer name that you would like to search  : ");
		String singer_name = scanner.nextLine();
		singer.search_singer(singer_name);
	}
}
