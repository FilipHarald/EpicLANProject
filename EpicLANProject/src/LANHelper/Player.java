package LANHelper;
import java.util.Calendar;

public class Player implements Comparable<Player> {

	private String userName;
	private int rating;
//	private int userID;
	private Calendar registrationDate;

	public Player(String userName) {
		setUserName(userName);
		setRating(0);
//		userID = userID;
		registrationDate.getInstance();
	}

	public Player(String userName, int rating) {
		setUserName(userName);
		setRating(rating);
//		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
//	
//	public int getUserID(){
//		return userID;
//	}

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
	
	public Calendar getRegistrationDate(){
		return registrationDate;
	}

    @Override
    public int compareTo(Player o) {
        return getRating() - o.getRating();
    }
}
