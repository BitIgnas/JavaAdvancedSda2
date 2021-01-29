package Composition.Example1;

public class Monitor {

    public Monitor(int displaySize) {
        this.displaySize = displaySize;
    }

    private int displaySize;

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "displaySize=" + displaySize +
                '}';
    }
}
