public class Player {

	private String userName;
	private int rating;
	private int userID;

	public Player(String userName, int userID) {
		setUserName(userName);
		setRating(1500);
		this.userID = userID;
	}

	public Player(String userName, int userID, int rank) {
		setUserName(userName);
		setRating(1500);
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getUserID(){
		return userID;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRank() {
		return rating;
	}

}
