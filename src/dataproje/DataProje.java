package dataproje;
import java.util.Scanner;
import dataproje.Ogrenci;
import dataproje.tree;
public class DataProje {
 

    public static void main(String[] args) {
    System.out.println("Hi, Welcome");    
    Scanner input=new Scanner(System.in);
    int id;
    String name,surname;
     System.out.println("Press 0 to see the menu."); 
    int giris=input.nextInt();
    int userdecision=9;
    if (giris<8){
    while(userdecision==9){//9 bitir
    System.out.println("0. Exit\n1.Add Student\n2.Delete Student\n"
            + "3.Find Student\n4.List all Studends\n5.List distinct names\n"
            + "6.List name counts\n7.About\nEnter your selection 1-7:"); 
    
    int giris2=input.nextInt();
        if (giris2>7 && giris2!=9) {
        System.out.println("you just have to choose between 0-7.");
        continue;
        }
    if(giris2==1)
    {
        tree tree=new tree();
        list list=new list();
        Ogrenci ogrenci = new Ogrenci();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id değerini giriniz: " );
        ogrenci.setId(scanner.nextInt());
        list.add(ogrenci.getId());
        tree.add(ogrenci.getId());  
        System.out.println("İsim giriniz: ");
        ogrenci.setName(scanner.next());
        list.add(ogrenci.getName());
        System.out.println("soy isim gir:");
        ogrenci.setSurname(scanner.next());
        list.add(ogrenci.getSurname());
        ogrenciListele(ogrenci);
        System.out.println(list);
        continue;         
        }    
        if(giris2==0){
        System.out.println("Are you sure you want to quit? Yes---->9/No---->anykey: ");
        giris2=input.nextInt();
        if (giris2==9) {
        System.out.println("thank u!");
        break;
        }
        else{
        continue;
        }
        }
        break;
        }
        }
        }
        public static void ogrenciListele(Ogrenci ogrenciList){

        System.out.println(ogrenciList.getId());
        System.out.println(ogrenciList.getName());
        System.out.println(ogrenciList.getSurname());


    }
}
