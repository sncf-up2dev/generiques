package fr.sncf.d2d.up2dev;

public class NullSafeBox<T> {

    private T value;

    public NullSafeBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getOrDefault(T alt) {
        if (this.value == null) {
            return alt;
        } else {
            return this.value;
        }
    }
}
