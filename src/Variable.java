public class Variable {
    public static void main(String[] args) {

        String name;
        name = "Adrian Bimo Hernawan Pratama";

        int age = 21;

        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        name = "Adriannn";
        System.out.println(name);

        /* Kata Kunci var */

        // var lebih simpel dan cepat
        var firstName = "Adrian";
        var middleName = "Bimo";
        var lastName = "Hernawan Pratama";

        /* Kata kunci final (data tidak boleh diubah) mirip seperti const */

        final String application = "Belajar Java";

        // application = "Belajar Ruby"; // akan error karena variabel sudah final tidak bisa diubah

    }
}
