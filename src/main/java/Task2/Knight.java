package Task2;

public class Knight {
    private Cell cell;

    public Knight(Cell cell) {
        this.cell = cell;
    }

    public boolean canMove(Cell target) {
        int dX = Math.abs(this.cell.getX() - target.getX());
        int dY = Math.abs(this.cell.getY() - target.getY());
        return (dX == 1 && dY == 2) || (dX == 2 && dY == 1);
    }

    public void move(Cell cell) {
        this.cell = cell;
    }

    @Override
    public String toString() {
        return "Knight{" +
                " Y:" + cell.getY() +
                " X:" + cell.getX() +
                '}';
    }

}
