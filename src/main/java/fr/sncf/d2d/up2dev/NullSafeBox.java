package fr.sncf.d2d.up2dev;

public class NullSafeBox {

    private Object value;

    public NullSafeBox(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getOrDefault(Object alt) {
        if (this.value == null) {
            return alt;
        } else {
            return this.value;
        }
    }
}
