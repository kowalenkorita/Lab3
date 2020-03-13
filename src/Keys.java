import java.util.Objects;

public class Keys {

    public String key = "Клавиша";

    public String pressKey()
    {
        return Keys.this.key="Клавиша нажата";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keys keys = (Keys) o;
        return Objects.equals(key, keys.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return "Keys{" +
                "key='" + key + '\'' +
                '}';
    }
}
