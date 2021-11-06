package bangunDatar;

/*
    Pembuatan program menghitung bangun datar.
    Buatlah sebuah program untuk menghitung luas dan keliling bangun datar.
    Bangun datar yang akan di hitung anatar lain
        - persegi
        - segitiga siku-siku
        - persegi panjang.
    Input angka berada pada fungsi utama dan fungsi operasi diletakkan terpisah dengan fungsi utama.
 */

import java.util.Scanner;

public class Main {
    //Menampilkan menu
    public static void menu(){
        System.out.println("**********************");
        System.out.println("Program menghitung bangun datar");
        System.out.println("**********************");
        System.out.println("1. Luas persegi");
        System.out.println("2. Keliling persegi");
        System.out.println("3. Luas persegi panjang");
        System.out.println("4. Keliling persegi panjang");
        System.out.println("5. Luas segitiga siku-siku");
        System.out.println("6. Keliling segitiga siku-siku");
        System.out.println("0. Exit");
        System.out.println("**********************");
        System.out.println("Pick Menu :");

    }
    public static void main(String[] args) {
        boolean loopTrue = true;
        int userPick;
        float sisi, panjang, lebar, tinggi, alas;
        Scanner scanThis = new Scanner(System.in);
        //Looping untuk menu
        while (loopTrue==true){
            // Tampilkan menu
            menu();

            // Mengambil inputan dari user
            userPick = scanThis.nextInt();
            System.out.println("**********************");
            System.out.println("User pick : "+userPick);

            switch (userPick){
                case 1:
                    // Program luas persegi
                    System.out.println("**********************");
                    System.out.println("Luas persegi");
                    System.out.println("**********************");

                    // User menginputkan sisi
                    System.out.print("Masukkan sisi = ");
                    sisi = scanThis.nextFloat();

                    // Membuat objek persegi panjang dengan nama luasPersegi
                    persegi luasPersegi = new persegi();

                    // Menjalankan method getLuas
                    System.out.println("**********************");
                    System.out.println("Luas persegi yang memiliki sisi "+
                            sisi+
                            " adalah "+
                            luasPersegi.getLuas(sisi));

                    // Sebelum menampilkan menu lagi
                    System.out.println("Press Enter key to continue...");
                    try{
                        System.in.read();
                    }
                    catch(Exception e){}
                    break;
                case 2:
                    // Program keliling persegi
                    System.out.println("**********************");
                    System.out.println("Keliling persegi");
                    System.out.println("**********************");

                    // User menginputkan sisi
                    System.out.print("Masukkan sisi = ");
                    sisi = scanThis.nextFloat();

                    // Membuat objek persegi panjang dengan nama kelilingPersegi
                    persegi kelilingPersegi = new persegi();

                    // Menjalankan method dengan nama getKeliling
                    System.out.println("**********************");
                    System.out.println("Keliling persegi yang memiliki sisi "+
                            sisi+
                            " adalah "+
                            kelilingPersegi.getKeliling(sisi));

                    // Sebelum menampilkan menu lagi
                    System.out.println("Press Enter key to continue...");
                    try{
                        System.in.read();
                    }
                    catch(Exception e){}
                    break;
                case 3:
                    // Program luas persegi panjang
                    System.out.println("**********************");
                    System.out.println("Luas persegi panjang");
                    System.out.println("**********************");

                    // User menginputkan panjang dan lebar
                    System.out.print("Masukkan panjang = ");
                    panjang = scanThis.nextFloat();
                    System.out.print("Masukkan lebar = ");
                    lebar = scanThis.nextFloat();

                    // Membuat objek persegi panjang dengan nama luasPersegiPanjang
                    persegiPanjang luasPersegiPanjang = new persegiPanjang();

                    // Menjalankan method dengan nama getLuas
                    System.out.println("**********************");
                    System.out.println("Luas persegi panjang yang memiliki panjang "+
                            panjang+
                            " dan lebar "+
                            lebar+
                            " adalah "+
                            luasPersegiPanjang.getLuas(panjang,lebar));

                    // Sebelum menampilkan menu lagi
                    System.out.println("Press Enter key to continue...");
                    try{
                        System.in.read();
                    }
                    catch(Exception e){}
                    break;
                case 4:
                    // Program keliling persegi panjang
                    System.out.println("**********************");
                    System.out.println("Keliling persegi panjang");
                    System.out.println("**********************");

                    // User menginputkan panjang dan lebar
                    System.out.print("Masukkan panjang = ");
                    panjang = scanThis.nextFloat();
                    System.out.print("Masukkan lebar = ");
                    lebar = scanThis.nextFloat();

                    // Membuat objek persegi panjang dengan nama kelilingPersegiPanjang
                    persegiPanjang kelilingPersegiPanjang = new persegiPanjang();

                    // Menjalankan method dengan nama getKeliling
                    System.out.println("**********************");
                    System.out.println("Keliling persegi panjang yang memiliki panjang "+
                            panjang+
                            " dan lebar "+
                            lebar+
                            " adalah "+
                            kelilingPersegiPanjang.getKeliling(panjang,lebar));

                    // Sebelum menampilkan menu lagi
                    System.out.println("Press Enter key to continue...");
                    try{
                        System.in.read();
                    }
                    catch(Exception e){}
                    break;
                case 5:
                    // Program luas segitiga siku-siku
                    System.out.println("**********************");
                    System.out.println("Luas segitiga siku-siku");
                    System.out.println("**********************");

                    // User menginputkan alas dan tinggi
                    System.out.print("Masukkan alas = ");
                    alas = scanThis.nextFloat();
                    System.out.print("Masukkan tinggi = ");
                    tinggi = scanThis.nextFloat();

                    // Membuat objek segitiga dengan nama luasSegitiga
                    segitiga luasSegitiga = new segitiga();

                    // Menjalankan method dengan nama getLuas
                    System.out.println("**********************");
                    System.out.println("Luas segitiga siku-siku yang memiliki alas "+
                            alas+
                            " dan tinggi "+
                            tinggi+
                            " adalah "+
                            luasSegitiga.getLuas(alas,tinggi));

                    // Sebelum menampilkan menu lagi
                    System.out.println("Press Enter key to continue...");
                    try{
                        System.in.read();
                    }
                    catch(Exception e){}
                    break;
                case 6:
                    // Program keliling segitiga siku-siku
                    System.out.println("**********************");
                    System.out.println("Keliling segitiga siku-siku");
                    System.out.println("**********************");

                    // User menginputkan alas dan tinggi
                    System.out.print("Masukkan alas = ");
                    alas = scanThis.nextFloat();
                    System.out.print("Masukkan tinggi = ");
                    tinggi = scanThis.nextFloat();

                    // Membuat objek segitiga siku-siku dengan nama kelilingSegitiga
                    segitiga kelilingSegitiga = new segitiga();

                    // Menjalankan method dengan nama getKeliling
                    System.out.println("**********************");
                    System.out.println("Keliling segitiga siku-siku yang memiliki alas "+
                            alas+
                            " dan tinggi "+
                            tinggi+
                            " adalah "+
                            kelilingSegitiga.getKeliling(alas,tinggi));

                    // Sebelum menampilkan menu lagi
                    System.out.println("Press Enter key to continue...");
                    try{
                        System.in.read();
                    }
                    catch(Exception e){}
                    break;
                case 0:
                    System.out.println("**********************");
                    System.out.println("Trimakasih");
                    System.out.println("**********************");
                    loopTrue = false;
                    break;
                default:
                    System.out.println("Pilih salah satu menu.");
                    break;
            }

        }
    }
}
