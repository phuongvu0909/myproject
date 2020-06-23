package projectOop;

public class NotesManager<T> {
	private String id;
	private int amount;
	private T[] arr;
	private String title;
	private String content;
	private long time;

	public NotesManager() {

	}

	public NotesManager(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int n() {
		return amount;
	}

	public void add(T data) {
		amount++;
		arr[amount] = data;
	}

	public void delete(T data) {
		for (int i = 1; i < amount + 1; i++) {
			if (arr[i - 1] == data) {
				arr[i - 1] = arr[i];
				amount--;
			}
		}
	}

	// Các bạn cho ý kiến phần này nhá!
	public void repair(T data) {

	}

}
