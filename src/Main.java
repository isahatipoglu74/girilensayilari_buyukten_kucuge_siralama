import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        int a,b,c;
        System.out.print("1. Sayıyı giriniz: ");
        a=inp.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        b=inp.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
        c=inp.nextInt();

        if(a<b && a<c){
            if(b<c){
                System.out.print("Sıralama a<b<c");
            }
                else{
                    System.out.print("Sıralama a<c<b");
                }
            }
        if(b<a && b<c){
            if(a<c){
                System.out.print("Sıralama b<a<c");
            }
            else{
                System.out.print("Sıralama b<c<a");
            }
        }
        if(c<a && c<b){
            if(a<b){
                System.out.print("Sıralama c<a<b");
            }
            else{
                System.out.print("Sıralama c<b<a");
            }
        }

    }
}