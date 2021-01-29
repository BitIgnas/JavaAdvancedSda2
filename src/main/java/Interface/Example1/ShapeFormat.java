package Interface.Example1;

public enum ShapeFormat {

    TWO_DIMENTIONAL("2D"),
    THREE_DIMENTIONAL("3D");

    String format;

    ShapeFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
