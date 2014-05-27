package LANHelper;
import java.util.*;


public class RankingTable implements Iterable<Player> {

    private ArrayList<Player> theRankingTable;

    public RankingTable() {
        theRankingTable = new ArrayList<Player>();
    }
    
    public RankingTable(ArrayList<Player> list){
    	this.theRankingTable = list;
    }

//    public void add(Player player) {
//    	list.add(player);
//        update();
//    }
    
    public boolean add(String userName) {
    	if (getPlayerByUserName(userName) == null){    		
    		theRankingTable.add(new Player(userName));
    		update();
    		return true;
    	}
    	return false;
		
    }
    
    
//    public void remove(Player player) {
//    	list.remove(player);
//    }
    
    public boolean remove(String userName) {
    	Player playerToBeRemoved = getPlayerByUserName(userName);
    	if (playerToBeRemoved != null){
    		theRankingTable.remove(playerToBeRemoved); 
    		return true;
    	} else {
    		return false;
    	}
    }

    public void update() {
        Collections.sort(theRankingTable);
    }
//hemlis
    public void print() {
        Iterator<Player> iter = iterator();
        int rank = 1;
        while(iter.hasNext()) {
            Player p = iter.next();
            System.out.println("Rank: " + rank + "\tName: " + p.getUserName() + "\tRating: " + p.getRating());
//            + "\tID: " + Integer.toString(p.getUserID())
            rank++;
        }
    }
    //Barbapappa
    public Player getPlayerByUserName(String userName){
    	
    	Player player = null;
    	
    	for (Player p : theRankingTable) {
    		if (p.getUserName().equals(userName)){
    			player = p;
    		}
    	}	
    	
		return player;
    }

    public ArrayList<Player> getPlayerList() {
        return theRankingTable;
    }

//    public int generateUserID() {
//        Iterator<Player> iter = iterator();
//        int id = 0;
//        while(iter.hasNext()) {
//            Player p = iter.next();
//            if (p.getUserID() > id) {
//                id = p.getUserID();
//            }
//        }
//        return id+1;
//    }

    public Iterator<Player> iterator() {
        return theRankingTable.iterator();
//mumsfillibabba
    }
}
