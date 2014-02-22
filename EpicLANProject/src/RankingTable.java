import java.util.*;


public class RankingTable implements Iterable {

    ArrayList<Player> list;

    public RankingTable() {
        list = new ArrayList<Player>();
    }

    public boolean add(Player player) {
        boolean result = list.add(player);
        Collections.sort(list);
        return result;
    }

    @Override
    public Iterator<Player> iterator() {
        return list.iterator();

    }
}
