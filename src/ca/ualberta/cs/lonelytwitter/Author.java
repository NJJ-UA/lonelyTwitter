package ca.ualberta.cs.lonelytwitter;

public class Author extends User {

	public Author() {
		super();
		// TODO Auto-generated constructor stub
		name ="wumingshi_author";
	}

	public Author(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name= name;
	}

}
