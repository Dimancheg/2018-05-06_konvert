
public class Post {
	public int userId;
	public int id;
	public String title;
	public String body;
	public int getUserId() {
		return userId;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getBody() {
		return body;
	}
	@Override
	public String toString() {
		return "Post [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}
	
	

}
