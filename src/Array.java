public class Array {
    public static void main(String[] args) {

        // Array String

        String[] arrayString;
        arrayString = new String[4];
        arrayString[0] = "Adrian";
        arrayString[1] = "Bimo";
        arrayString[2] = "Hernawan";
        arrayString[3] = "Pratama";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString[3]);

        // Array Integer

        Integer[] arrayInteger;
        arrayInteger = new Integer[4];
        arrayInteger[0] = 1;
        arrayInteger[1] = 2;
        arrayInteger[2] = 3;
        arrayInteger[3] = 4;

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);



        String[] namaNama = {
                "Adrian", "Bimo", "Hernawan", "Pratama"
        };

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        /* Array Initializer */

        /* Operasi di Array */

        long[] arrayLong = {
          10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        /* Array didalam Array */

        String[][] members = {
                {"Adrian", "Bimo", "Hernawan", "Pratama"},
                {"Adriannn", "bhp"},
                {"adriann", "aza"},
        };

        System.out.println(members[0]);
        System.out.println(members[0][0]);
        System.out.println(members[1][0]);
    }

}
