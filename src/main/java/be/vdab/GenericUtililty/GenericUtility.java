package be.vdab.GenericUtililty;

public class GenericUtility {

    public static <E> boolean isEqualTo(E object1, E object2) {
        return object1.equals(object2);
    }

    public static void main(String[] args) {

        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println("Object test: " + GenericUtility.isEqualTo(object1,object2));

        System.out.println();
        String string1 = "klaas";
        String string2 = "klaas";
        String string3 = "danny";
        System.out.println("String same content test: " + GenericUtility.isEqualTo(string1,string2));
        System.out.println("String different content test: " + GenericUtility.isEqualTo(string1,string3));

        System.out.println();
        System.out.println("Integer same content test: " + GenericUtility.isEqualTo(2,2));
        System.out.println("Integer different content test: " + GenericUtility.isEqualTo(2,3));

    }

}
