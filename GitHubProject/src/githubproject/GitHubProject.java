
package githubproject;

import java.util.Scanner;


public class GitHubProject {
    
    public static void main(String[] args) {
        System.out.println("Welcome to the patrol station. ");
         System.out.print("คุณต้องการเติมน้ำมันอะไร benzin หรือ diesel : ");
        String kine ;
        double volume;
        double price;
        PriceOil po = new PriceOil();
        Scanner sn = new Scanner(System.in);
        
        
        kine = sn.nextLine();
        while(!(kine.equals("benzin"))&& !(kine.equals("diesel"))){
            System.out.print("คุณต้องเลือก benzin หรือ diesel เท่านั้นกรุณาบอกใหม่ \n"
                    + "ต้องการเติมน้ำมันอะไร benzin หรือ diesel : ");
            kine = sn.nextLine();
        }
        
        if(kine.equals("benzin")){
            po.benzin();
            price =  po.setoil();
            System.out.print("คุณต้องการเติมกี่ลิตร : ");
            volume = sn.nextDouble();
            Oil.money = volume*price;
            System.out.println("คุณเติมน้ำมัน benzin "+Oil.money);
        }else if(kine.equals("diesel")){
            po.diesel();
            price =  po.setoil();
            System.out.print("คุณต้องการเติมกี่ลิตร : ");
            volume = sn.nextDouble();
            Oil.money = volume*price;
            System.out.println("คุณเติมน้ำมัน diesel "+volume +" ลิตร ราคา"+Oil.money+" บาท"+"\n"
                    + "ขอบคุณที่ใช้บริการ");
        
    }
        
}
}
abstract class Oil{
    static double money ;
    public abstract void benzin();
}

class PriceOil extends Oil{
     private double price;
             
    @Override
    public void benzin() {
        price = 24.36;
    }public void diesel(){
        price = 18.49;
    }
    public double setoil(){
        return price;
    }
}