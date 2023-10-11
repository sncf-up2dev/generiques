package fr.sncf.d2d.up2dev;

public class Main {

    public static void main(String[] args) {
        NullSafeBox intBox = new NullSafeBox(13);
        NullSafeBox strBox = new NullSafeBox("toto");
        NullSafeBox objBox = new NullSafeBox(new Object());
        NullSafeBox nulBox = new NullSafeBox(null);
        NullSafeBox expBox = new NullSafeBox(new Exception());

        if (strBox.getValue() instanceof String str) {
            System.out.println(str.toUpperCase());
        }

        strBox.setValue(13);
        String str = (String) strBox.getValue();

        Object obj = nulBox.getOrDefault("hello");
    }
}
