package Abstract;

public class Customer implements IEntity {

	private int id;
	private String Email;

	public Customer() {
	}

	public Customer(int id, String email) {
		super();
		this.id = id;
		Email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
