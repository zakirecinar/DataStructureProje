/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataproje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author zakir
 */
public class NewClass {
    public static void main(String[] args) {
        list list=new list();
        Ogrenci ogrenci = new Ogrenci();
        int secenek=0;
        int girilenDeger=0;
        boolean devamEdilsinMi=false;
        String yesNo = "";
        Scanner input=new Scanner(System.in);

        do {

            System.out.println("Hi, Welcome");
            System.out.print("Press 0 to see the menu.");
         try {
            girilenDeger=input.nextInt();

            if (girilenDeger == 0){

                System.out.println("Hangi işlemi yapmak istiyorsunuz..");
                System.out.println("0-)Exit");
                System.out.println("1-)Add Student");
                System.out.println("2-)Delete Student");
                System.out.println("3-)Find Student");
                System.out.println("4-)List all Studends");
                System.out.println("5-)List distinct names");
                System.out.println("6-)List name counts");
                System.out.println("7-)About");
                System.out.println("Enter your selection 1-7:");
 
                secenek=input.nextInt();
               
                    
                if (secenek>=0&&secenek<=7 ) {

                    switch (secenek) {
                        case 0:
                            System.out.println("Are you sure?");
                            System.out.println("Y - Yes  N-No");
                            yesNo=input.next();
                            if (yesNo.equals("Y") ){
                                System.out.println("See you again..");
                               devamEdilsinMi = false;
                               break;
                               
                            } else {
                                devamEdilsinMi = true;
                            break;
                            }
                            
                        case 1:
                            System.out.print("enter student id: ");
                            if(ogrenci.getId() ==  0){
                            ogrenci.setId(input.nextInt());
                            list.add(ogrenci.getId());
                            }
                            else{
                                ogrenci.setId1(input.nextInt());
                                list.add(ogrenci.getId1());
                            }
                            System.out.println("enter student name: ");
                            ogrenci.setName(input.next());
                            list.add(ogrenci.getName());
                            System.out.println("enter student surname: ");
                            ogrenci.setSurname(input.next());
                            list.add(ogrenci.getSurname());
                            System.out.println("id: "+ogrenci.getId() + " name: " + ogrenci.getName() + " surname: " + ogrenci.getSurname() + " Registration Successful...");
                            devamEdilsinMi = true;
                            break;
                        case 2:
                            System.out.println("enter student id: ");
                            if(input.nextInt() == ogrenci.getId()) {
                                ogrenci.setId(0);
                                ogrenci.setName("");
                                ogrenci.setSurname("");
                                System.out.println("Kayıt silinmiştir.");
                                
                            }else{
                                System.out.println("Not Found Student Id");
                                devamEdilsinMi = true;
                                break;
                            }
                        case 3:
                            
                            System.out.println("Enter Student Id or Student Name or Student Surname");
                            
                            if(input.nextInt()==ogrenci.getId()){
                                list.get(ogrenci.)
                            }
                            
                            
                        case 4:
                            System.out.println("enter student id");
                            if(input.nextInt() == ogrenci.getId()){
                                System.out.println(list);
                            }else {
                                System.out.println("Not Found Student Id");
                                devamEdilsinMi = true;
                                break;
                                
                            }
                    }
                }else {
                    System.out.println("you just have to choose between 0-7.");
                }
                
            }else{
            }
            } catch (Exception a) {
                devamEdilsinMi = true; 
                    
                    System.out.println("Hatalı işlem yaptınız tekrar deneyin.. ");
                    break;
            }
        }
            
        while (devamEdilsinMi);
    

    }

    public static void ogrenciListele(Ogrenci ogrenciList){

        List listOgrenci = new ArrayList();
        listOgrenci.add(ogrenciList.getId()+ogrenciList.getName()+ogrenciList.getSurname());
        for (int i = 0; i < listOgrenci.size(); i++) {
            System.out.println(listOgrenci);
        }

    }
    
    
    public static void ogrenciFound(Ogrenci ogrenciFound){
    //naptık şimdi peki
    // github daki dosyaları karşılaştırdı ama amacım github a yüklemek bunu :) heee tamam :)
        
    }

}

