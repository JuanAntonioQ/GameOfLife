import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object object){
        if (object instanceof Position){
            return ((Position) object).getX() == this.x && ((Position) object).getY() == this.y;
        }
        return false;
    }
}
