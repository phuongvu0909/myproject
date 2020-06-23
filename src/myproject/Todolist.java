package myproject;

import java.util.ArrayList;

public class Todolist extends Todo {
	private String title;
	private Todo todo;
	private ArrayList<Todo> listTodo = new ArrayList<Todo>();

	public Todolist() {

	}

	public Todolist(String id, String title) {
		this.id = id;
		this.title = title;
	}

	public Todolist(String id, String title, Todo todo) {
		this.id = id;
		this.title = title;
		this.todo = todo;
	}

	public Todolist(String id, ArrayList<Todo> listTodo) {
		this.listTodo = listTodo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Todo getTodo() {
		return todo;
	}

	public void setTodo(Todo todo) {
		this.todo = todo;
	}

	public ArrayList<Todo> getListTodo() {
		return listTodo;
	}

	public void setListTodo(ArrayList<Todo> listTodo) {
		this.listTodo = listTodo;
	}

	public String inputTitle() {
		System.out.println("Input Title:");
		return sc.nextLine();
	}

	public Todo inputTodo() {
		Todo t = new Todo();
		return (Todo) t.add();
	}

	@Override
	public AppManager add() {
		String id = inputId();
		String title = inputTitle();
		todo = inputTodo();

		Todolist todolist = new Todolist(id, title, todo);
		this.getListTodo().add(todolist);
		this.getList().addAll(listTodo);

		return todolist;
	}

	// show tạm ổn
	@Override
	public void show() {
		for (Todo todolists : this.getListTodo()) {
			System.out.println("Id =  " + todolists.getId());
			System.out.println("Title = " + ((Todolist) todolists).getTitle());
  		System.out.println("Content = " + ((Todolist)todolists).getTodo().getContent());
		}

	}
	//chưa sửa được 
	@Override
	public void edit(String id) {
//		id = todo.getIdp();
		for (Todo todolists : this.getListTodo()) {
			if (((Todolist)todolists).getTodo().getIdp().equals(id)) {
				String newcontent = inputContent();
				((Todolist) todolists).getTodo().setContent(newcontent);
			}

		}
	}
}
