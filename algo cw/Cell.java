/**
 * Created by Visur on 17/03/28.
 */

public class Cell implements Comparable<Cell> {

    private int x;
    private int y;
    private int huristic;
    private int movement;
    private Cell parent;
    private boolean blocked;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.huristic = 0;
        this.movement = 0;
        this.parent = null;
        this.blocked = false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int compareTo(Cell c) {
        int value = this.getFValue() - c.getFValue();
        return (value);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int gethuristic() {
        return huristic;
    }

    public void sethuristic(int huristic) {
        this.huristic = huristic;
    }

    public int getmovement() {
        return movement;
    }

    public void setmovement(int movement) {
        this.movement = movement;
    }

    public int getFValue() {
        int sum = movement+huristic;
        return (sum);
    }

    public Cell getParent() {
        return parent;
    }

    public void setParent(Cell parent) {
        this.parent = parent;
    }

    public boolean isblocked() {
        return blocked;
    }

    public void setblocked(boolean isblocked) {
        this.blocked = isblocked;
    }



}
