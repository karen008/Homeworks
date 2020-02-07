package CustomSetHomework;

import java.util.Objects;

public class SetCoffee implements Comparable<SetCoffee> {
    private int price;
    private String type;

    public SetCoffee(String type, int price) {
        this.price = price;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetCoffee setCoffee = (SetCoffee) o;
        return price == setCoffee.price &&
                Objects.equals(type, setCoffee.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    @Override
    public int compareTo(SetCoffee setCoffee) {

        if (this.price - setCoffee.price > 0) return 1;
        if (this.price - setCoffee.price < 0) return -1;

        if (this.type.compareTo(setCoffee.type) > 0) return 1;
        if (this.type.compareTo(setCoffee.type) < 0) return -1;

        return 0;
    }

    @Override
    public String toString() {
        return type;
    }
}
