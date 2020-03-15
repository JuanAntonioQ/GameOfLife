import java.util.ArrayList;
import java.util.List;

public class World {
    List<Cell> cells = new ArrayList<Cell>();

    public World(List<Cell> cells) {
        this.cells = cells;
    }

    public boolean isEmpty(){
        return cells.isEmpty();
    }

    public Cell getCellInPosition(int x, int y) {
        return cells.get(0).getPosition().equals(new Position(x, y)) ? cells.get(0) : null;
        /*for(Cell cell : cells){
        }*/
    }
}
