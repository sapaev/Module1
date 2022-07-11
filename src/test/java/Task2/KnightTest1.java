package Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest1 {
    private static Knight knight;

    @Test
    void canMove() {
        Cell targetCell = new Cell(3, 6);
        Assertions.assertTrue(knight.canMove(targetCell));

        Cell targetCell2 = new Cell(1, 4);
        Assertions.assertFalse(knight.canMove(targetCell2));
    }

    @BeforeAll
    private static void init() {
        Cell cell = new Cell(1, 7);
        knight = new Knight(cell);
    }
}