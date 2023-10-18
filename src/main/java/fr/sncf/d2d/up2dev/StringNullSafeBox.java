package fr.sncf.d2d.up2dev;

public class StringNullSafeBox extends NullSafeBox<String> {

    public StringNullSafeBox(String value) {
        super(value);
    }

    @Override
    public String getOrDefault(String alt) {
        String str = super.getOrDefault(alt);
        return str == null ? "" : str;
    }
}
