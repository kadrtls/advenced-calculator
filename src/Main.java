import java.util.Scanner;

public class Main {
    static  void plus(){
        int sum=0,i=1;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println(i++ +".sayı");
            int num= scanner.nextInt();
            if (num==0){
                System.out.println("sonuç:"+sum);
                break;
            }
            sum+=num;
        }
    }
    static void minus(){
        int result=0,i=1;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println(i++ +".sayı");
            int num= scanner.nextInt();
            if (num==0){
                System.out.println("sonuç:"+result);
                break;
            }
            result-=num;
        }
    }
    static void times(){
        int result=1,number,i=1;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println(i++ +".sayı");
            number= scanner.nextInt();
            if (number==1){
                System.out.println("sonuç:"+result);
                break;
            }
            result*=number;
        }
    }
    static void divided(){
        double number,result=1,result1=1;
        int i=1;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println(i++ +".sayı");
            number= scanner.nextDouble();
            if (i!=1&&number==0){
                System.out.println("sayı tanımsız");
                break;
            }
            if (i==1){
                result=number;
            }if (number==1){
                System.out.println("sonuç:"+result);
                break;
            }
            result/=number;
        }
    }
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i=1;i<=exponent;i++) {
            result *= base;
        }
        System.out.println("Sonuç :"+result);
    }
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("faktoriyelini almak istediğiniz sayıyı giriniz :");
        int number = scan.nextInt();
        int result = 1;
        for (int i=1;i<=number;i++) {
            result *= i;
        }
        System.out.println("Sonuç :"+result);
    }
    static void modRetrieval(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("modunu almak istediğiniz sayıyı giriniz.");
        int num= scanner.nextInt();
        System.out.println("mod'u giriniz.");
        int bolen= scanner.nextInt();
        int mod=num%bolen;
        System.out.println("sonuç:"+mod);
    }
    static void environment(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("uzun kenarı girin.");
        int longEdge= scanner.nextInt();
        System.out.println("kısa kenarı girin. ");
        int shortEdge= scanner.nextInt();
        int result=(longEdge+shortEdge)*2;
        System.out.println("dikdörtgenin çevresi:"+result);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int select;
        do {
            System.out.println("Yapmak istediğiniz işlemi girin");
            System.out.println("1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap");
            select= scanner.nextInt();
            switch (select){
                case 0:
                    System.out.println("iyi günler!");
                    break;
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modRetrieval();
                    break;
                case 8:
                    environment();
                    break;
            }
        }while (select!=0);

    }
}