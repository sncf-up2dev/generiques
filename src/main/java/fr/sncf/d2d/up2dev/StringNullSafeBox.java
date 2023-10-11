package fr.sncf.d2d.up2dev;

public class StringNullSafeBox extends NullSafeBox {

    public StringNullSafeBox(String value) {
        super(value);
    }

    @Override
    public String getValue() {
        return (String) super.getValue();
    }

    @Override
    public void setValue(Object value) {
        if (value instanceof String) {
            super.setValue(value);
        } else {
            throw new IllegalStateException();
        }
    }
}
