package myproject;

public class Note extends AppManager {
	private String title;
	// tạo một list chứa id của tag
	
	public Note() {
		
	}

	public Note(String id, String content, String title) {
		this.setId(id);
		this.setContent(content);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String inputTitle() {
		System.out.println("Input Title:");
		return sc.nextLine();
	}
	@Override
	public AppManager add() {
		String id = inputId();
		String title = inputTitle();
		String content = inputContent();
		Note n = new Note(id,content,title);
		this.getList().add(n);
		return n;

	}
	@Override
	public void show() {
		for( AppManager notes : this.getList()) {
			System.out.println("Id =  " + notes.getId());
			System.out.println("Title = " + ((Note)notes).getTitle());
			System.out.println("Content = " + notes.getContent());
		}
	
	}
	
	@Override
	public void edit(String id) {
		int i = 0;
		Note t = null;
		String choose;
		
		while(list.get(i).getId().equals(id)) {
			t = (Note) list.get(i);
			System.out.println("What you want to edit?");
			choose = sc.nextLine();
			switch(choose) {
				case "title" :((Note) list.get(i)).setTitle(inputTitle());break;
				case "content" : list.get(i).setContent(inputContent());break;
				case "both" : {
					((Note) list.get(i)).setTitle(inputTitle());
					list.get(i).setContent(inputContent());
					break;
				}
				default: break;
			}				
			i++;
			break;
		}
		if(t == null) {
			System.out.println("Id is not exist!");
		}		
	}
}