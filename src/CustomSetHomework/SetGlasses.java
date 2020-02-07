package CustomSetHomework;

import java.util.Objects;

public class SetGlasses implements Comparable<SetGlasses> {
    private int price;
    private String color;
    private String frameType;


    public SetGlasses(String frameType, String color, int price) {
        this.price = price;
        this.color = color;
        this.frameType = frameType;

    }

    public String getFrameType() {
        return frameType;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(SetGlasses setGlasses) {
        if (this.price - setGlasses.price > 0) return 1;
        if (this.price - setGlasses.price < 0) return -1;

        if (this.frameType.compareTo(setGlasses.frameType) > 0) return 1;
        if (this.frameType.compareTo(setGlasses.frameType) < 0) return -1;

        if (this.color.compareTo(setGlasses.color) > 0) return 1;
        if (this.color.compareTo(setGlasses.color) < 0) return -1;

        return 0;
    }

    @Override
    public String toString() {
        return frameType + " " + "glasses";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetGlasses setGlasses = (SetGlasses) o;
        return price == setGlasses.price &&
                Objects.equals(frameType, setGlasses.frameType) &&
                Objects.equals(color, setGlasses.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frameType, color, price);
    }
}
