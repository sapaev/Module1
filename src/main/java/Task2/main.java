package Task2;

public class main {
    public static void main(String[] args) {
        Cell cell = new Cell(1, 7);
        Knight knight = new Knight(cell);

        System.out.println("Initial " + knight);

        Cell targetCell = new Cell(3, 6);

        if (knight.canMove(targetCell)) {
            knight.move(targetCell);
        }

        System.out.println("After moving " + knight);
    }
}
