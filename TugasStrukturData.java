import java.util.LinkedList;

public class TugasStrukturData {


    public static void main(String[] args) {
        // tugas no 1
        int StrukturBaris;


        // tugas no 2
        String KataBaru = "Deklarasi tipe data String";
        System.out.println(KataBaru);


        // tugas no 3
        int[] empatAngka = {07, 10, 20, 23};
        System.out.println("Array satu dimensi: ");
        for (int angka :  empatAngka) {
            System.out.println(angka + " ");
        }
        System.out.println();


        // tugas no 4
        String[][] Angka = {
            {"1", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "29"},
        };  
        System.out.println("Array dua dimensi: ");
        for (int i = 0; i < Angka.length; i++) {
            for (int j = 0; j < Angka[i].length; j++) {
                System.out.print(Angka[i][j] + " ");
            }
            System.out.println();
        }

        // tugas no 5
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(22);
        listAngka.add(19);      
        listAngka.add(44);
        listAngka.add(60);
        listAngka.add(72);
        System.out.println("Linked List: " + listAngka);

    }

    
}