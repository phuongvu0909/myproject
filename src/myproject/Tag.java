package myproject;

import java.util.ArrayList;

public class Tag extends AppManager{
	// trong tag có danh sách các notes và todolist
	private ArrayList<String> notes = new ArrayList<String>();
	private ArrayList<String> todolists = new ArrayList<String>();

	public Tag() {

	}

	public Tag(String id, String content) {
		super();
	}

	public void getIdNote(Note note) {
		notes.add(note.getId());
	}

	public void getIdTodoList(Todolist list) {
		todolists.add(list.getId());
	}

	@Override
	public AppManager add() {
		String id = inputId();
		String content = inputContent();
		Tag tag = new Tag(id,content);
		if(tag != null) {
			this.getList().add(tag);
		}
		for(AppManager tags : this.getList()) {
			if(tags.getId().equals(tag.getId())) {
				return tag;
			}
			
		}
		return null;
	}

	@Override
	public AppManager remove(String id) {
	
		return null;
	}

	@Override
	public void edit(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}


