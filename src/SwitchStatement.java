public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Anda Lulus Congrats");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        /* Switch Lambda */

        switch(nilai) {
            case "A" -> System.out.println("Anda Lulus Congrats");
            case "B", "C" -> System.out.println("Nilai ada Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        /* Switch tanpa yield */

        String ucapan;
        switch(nilai) {
            case "A" -> ucapan = "Anda Lulus Congrats";
            case "B", "C" -> ucapan = "Nilai ada Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan ="Mungkin Anda Salah Jurusan";
            }
        }
        System.out.println(ucapan);

        /* Switch menggunakan yield */

        ucapan =  switch(nilai) {
            case "A" : yield "Anda Lulus Congrats";
            case "B", "C" : yield "Nilai ada Cukup Baik";
            case "D" : yield "Anda Tidak Lulus";
            default :
                yield "Mungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan);
    }
}
