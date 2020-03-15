
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
// import static org.hamcrest.core.Is.is;

public class WorldTest_ {

    @Test
    public void should_be_empty_of_cells_when_it_is_created(){
        List<Cell> cells = new ArrayList<Cell>();
        World world = new World(cells);
        assertThat(world.isEmpty()).isEqualTo(true);
    }

    @Test
    public void should_create_a_cell_in_a_position_of_world(){
        List<Cell> cells = new ArrayList<Cell>();
        Cell cell = new Cell(new Position(0, 0));
        cells.add(cell);
        World world = new World(cells);
        assertThat(world.getCellInPosition(0, 0)).isEqualTo(cell);
    }

}

