package uygulamaKapsullemeGetSet;

public class Test {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci();

        ogrenci1.setIsim("Yusuf");
        ogrenci1.setSoyisimsim("Zorlu");
        System.out.println("Isim: "+ ogrenci1.getIsim());
        System.out.println("Soyisim: "+ ogrenci1.getSoyisim());
    }
}
