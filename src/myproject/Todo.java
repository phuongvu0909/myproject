package myproject;

public class Todo extends AppManager {
	// tạo một list chứa id của tag
	private String idp;
	public Todo() {

	}

	public Todo(String idp, String content) {
		this.setId(idp);
		this.setContent(content);
	}

	
	public String getIdp() {
		return idp;
	}

	public void setIdp(String idp) {
		this.idp = idp;
	}

	@Override
	public AppManager add() {
		System.out.println("Id child: ");
		String idp = inputId();
		String content = inputContent();
		Todo todo = new Todo(idp, content);
		this.getList().add(todo);
		return todo;
	}

	@Override
	public void show() {
		for (AppManager Todos : this.getList()) {
			System.out.println("Id =  " + ((Todo) Todos).getIdp());
			System.out.println("Content = " + Todos.getContent());
		}
	}

	@Override
	public void edit(String id) {
		int i = 0;
		Todo t = null;
		while (list.get(i).getId().equals(id)) {
			t = (Todo) list.get(i);
			list.get(i).setContent(inputContent());
			i++;
			break;
		}
		if (t == null) {
			System.out.println("Id is not exist!");
		}
	}

}

