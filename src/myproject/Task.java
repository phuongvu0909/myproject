package myproject;

import java.util.ArrayList;

public class Task extends AppManager {

	// dãy các todolist và dã các note
	private Todolist listTodo = new Todolist();
	private ArrayList<Note> listNotes = new ArrayList<Note>();
	private String title;
	private String idTask;
	
	public Todolist getListTodo() {
		return listTodo;
	}

	public void setListTodo(Todolist listTodo) {
		this.listTodo = listTodo;
	}

	public ArrayList<Note> getListNotes() {
		return listNotes;
	}

	public void setListNotes(ArrayList<Note> listNotes) {
		this.listNotes = listNotes;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.content = title;
	}

	
	public String getIdTask() {
		return idTask;
	}

	public void setIdTask(String idTask) {
		this.idTask = idTask;
	}

	public Task() {

	}

	public Task(String idTask, String title) {
		this.idTask = idTask;
		this.setContent(title); 
	}

	public Task(String idTask, String title, ArrayList<Note> listNotes, Todolist listTodo) {
		this.idTask = idTask;
		this.setContent(title);
		this.listNotes = listNotes;
		this.listTodo = listTodo;
	}
	public String inputTitle() {
		System.out.println("Input Title:");
		return sc.nextLine();
	}

	@Override
	public AppManager add() {
		System.out.println("ID Task ");
		String id = inputId();
		String title = inputContent();
		
		System.out.println("Todolist ");
		Todolist todolist = new Todolist();	
		Todolist t = (Todolist) todolist.add();
		this.getList().add(t);
		
		System.out.println("Notes ");
		Note note = new Note();
		note.add();
		this.getListNotes().add(note);
		
		Task task = new Task(id, title, listNotes, listTodo);
		this.getList().add(task);
		
		return task;
	}

	@Override
	public AppManager remove(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void edit(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		for(AppManager tasks : this.getList()) {
			System.out.println("ID task " + ((Task)tasks).getIdTask());
			System.out.println("Title task " +  tasks.getContent());
			
		/*nếu chỉ in mỗi id và content của task thì ra kết quả đúng nhưng 
			nếu in cả todolist và notes chứa trong đó thì lại lỗi(có thể do task, todolist
			 , note đều dùng cái getid từ appmanager nên nó bị lộn id với nhau */
			listTodo.show();
			
			System.out.println("List note ");
			for(Note listnotes : this.getListNotes()) {
				listnotes.show();
			}
					}
	

	}
}

