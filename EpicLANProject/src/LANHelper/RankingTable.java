package LANHelper;
import java.util.*;


public class RankingTable implements Iterable<Player> {

    ArrayList<Player> list;

    public RankingTable() {
        list = new ArrayList<Player>();
    }
    
    public RankingTable(ArrayList<Player> list){
    	this.list = list;
    }

//    public void add(Player player) {
//    	list.add(player);
//        update();
//    }
    
    public void add(String playerName) {
    	list.add(new Player(playerName));
        update();
    }
    
    
//    public void remove(Player player) {
//    	list.remove(player);
//    }
    
    public void remove(String player) {
    	list.remove(player);
    }

    public void update() {
        Collections.sort(list);
    }

    public void print() {
        Iterator<Player> iter = iterator();
        int rank = 1;
        while(iter.hasNext()) {
            Player p = iter.next();
            System.out.println("Rank: " + rank + "\tRating: " + p.getRating()  + "\tName: " + p.getUserName());
//            + "\tID: " + Integer.toString(p.getUserID())
            rank++;
        }
    }

    public ArrayList<Player> getPlayerList() {
        return list;
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

    @Override
    public Iterator<Player> iterator() {
        return list.iterator();

    }
}
