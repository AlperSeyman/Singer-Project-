import java.util.ArrayList;

public class Singer {
	private ArrayList<String> singer_list = new ArrayList<String>();
	
	public void show_singer() {
		System.out.println("There are " + singer_list.size() + " singer");
		
		for (int i = 0; i < singer_list.size(); i++) {
			System.out.println((i+1) + ".Singer : " + singer_list.get(i));
		}
	}
	
	public void add_singer(String name) {
		singer_list.add(name);
		
		System.out.println("The singer list was updated...");
	}
	
	public void update_singer(String new_name, int position) {
		singer_list.set(position, new_name);
		
		System.out.println("The singer list was updated...");
	}
	public void delete_singer(int position) {
		
		String singer_name = singer_list.get(position);
		
		singer_list.remove(position);
		
		System.out.println(singer_name + "  was removed from the singer list...");
	}
	
	public void search_singer(String singer_name) {
		
		int position = singer_list.indexOf(singer_name);
		
		if (position >= 0) {
			System.out.println("The Singer was found...");
			System.out.println(singer_name + " 's position : " + (position+1) + ". position");
		}
		else {
			System.out.println("The singer was not found....");
		}
	}
}
