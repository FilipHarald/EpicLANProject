public class Player implements Comparable<Player> {

	private String userName;
	private int rating;
	private int userID;

	public Player(String userName, int userID) {
		setUserName(userName);
		setRating(1500);
		this.userID = userID;
	}

	public Player(String userName, int userID, int rating) {
		setUserName(userName);
		setRating(rating);
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
	public void increaseRating(int increase) {
		this.rating += increase;
	}
	public void decreaseRating(int decrease) {
		this.rating -= decrease;
	}
	public int getRating() {
		return rating;
	}

    @Override
    public int compareTo(Player o) {
        return o.getRating() - getRating();
    }
}
