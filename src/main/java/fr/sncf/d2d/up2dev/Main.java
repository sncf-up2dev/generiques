package fr.sncf.d2d.up2dev;

public class Main {

    public static void main(String[] args) {
        NullSafeBox<Integer> intBox = new NullSafeBox<>(13);
        StringNullSafeBox strBox = new StringNullSafeBox("toto");
        NullSafeBox<Object> objBox = new NullSafeBox<>(new Object());
        NullSafeBox<String> nulBox = new NullSafeBox<>(null);
        NullSafeBox<Exception> expBox = new NullSafeBox<>(new Exception());

        System.out.println(strBox.getValue().toUpperCase());

        String str1 = strBox.getValue();

        System.out.println(str1);

        String str2 = nulBox.getOrDefault("hello");
        System.out.println(str2);

        String str3 = nulBox.getOrThrow(new IllegalStateException());
        System.out.println(str3);

        boolean b;
        b = isEmpty(intBox);
        b = isEmpty(strBox);
        b = isEmpty(objBox);

        NullSafeBox<?> box;

        box = intBox;
        box = strBox;
        box = objBox;

        b = box.getValue() == null;

        Object o = box.getValue();

        NullSafeBox<Double> dblBox = new NullSafeBox<>(3.1);

        b = isEmptyOrZero(intBox);
        b = isEmptyOrZero(dblBox);
    }

    static boolean isEmpty(NullSafeBox<?> box) {
        return box.getValue() == null;
    }

    static boolean isEmptyOrZero(NullSafeBox<? extends Number> box) {
        return box.getValue() == null && box.getValue().intValue() == 0;
    }
}
