import java.util.*;


public class RankingTable implements Iterable {

    ArrayList<Player> list;

    public RankingTable() {
        list = new ArrayList<Player>();
    }

    public boolean add(Player player) {
        boolean result = list.add(player);
        update();
        return result;
    }

    public void update() {
        Collections.sort(list);
    }

    public int generateUserID() {
        Iterator<Player> iter = iterator();
        int id = 0;
        while(iter.hasNext()) {
            Player p = iter.next();
            if (p.getUserID() > id) {
                id = p.getUserID();
            }
        }
        return id+1;
    }

    @Override
    public Iterator<Player> iterator() {
        return list.iterator();

    }
}
