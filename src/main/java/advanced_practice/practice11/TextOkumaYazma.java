package advanced_practice.practice11;

import java.io.*;

public class TextOkumaYazma {
    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonun yazdıran bir kod yazınız.
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:/Users/lenovo/Desktop/HelloWorld.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String satir = bufferedReader.readLine();
        String yeniDosya="";

        while (satir!=null){

            yeniDosya+=satir+"==> Satır Kelime Sayısı: "+satir.split(" ").length+"\n";

            satir = bufferedReader.readLine();

        }

        System.out.println("yeniDosya = " + yeniDosya);
        bufferedReader.close();

        FileWriter fileWriter = new FileWriter("C:/Users/lenovo/Desktop/HelloWorld.txt");
        fileWriter.write(yeniDosya);
        fileWriter.close();

    }
}