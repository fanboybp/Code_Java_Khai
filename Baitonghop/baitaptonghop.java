/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaontap;

/**
 *
 * @author PC
 */
import static java.lang.Math.max;
import java.util.Arrays;
import java.util.Scanner;
public class Javaontap {
    /**
     * @param args the command line arguments
     */
    public static boolean ktsonguyento(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void swap(int x,int y)
    {
        int temp=x;
        x=y;
        y=temp;
    }
    public static float giaithua(float n)
    {
        if(n==1)
        {
            return n;
        }
        else
            return (n*giaithua(n-1));
    }
    public static  int tich (int n)
    {
        if(n==1)
        {
            return n;
        }
        else
            return  (int)(n*(giaithua(n-1)));
    }
     public static void demabc(String chuoi)
     {
         int dem=0;
         for(int i=0;i<chuoi.length()-2;i++)
         {
             if(chuoi.substring(i,i+3).equals("abc"))
             {
                 dem++;
             }
         }
         System.out.print("so lan xuat hien cua chuoi abc la :"+dem+"lan");
     }
     
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        float tong=0;
        
        Scanner sc=new Scanner(System.in);
         System.out.println("nhap vao ten cua ban");
         String ten;
        ten=sc.nextLine();
        System.out.print("nhap vao so n :");
        n=sc.nextInt();
        for(float i=1;i<=n;i++)
        {
            tong=tong+1/(giaithua(i));
        }
        System.out.println("tong day so la  :"+tong);
        System.out.println("tich cua day so la:"+tich(n));
        int[] c = {3,2,8,7,12};
        for(int num:c)
        {
            if(ktsonguyento(num))
            {
                System.out.print(num+" ");
            }
        }
        System.out.printf("\n");
        Arrays.sort(c);
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
        int Max=c[0];
        for(int j:c)
        {
            if(Max<j)
            {
                Max=j;
            }
        }
        System.out.print("\nso lon nhat trong mang la :"+Max);
        int Min=c[0];
        for(int z:c)
        {
            if(Min>z)
            {
                Min=z;
            }
        }
        System.out.print("\nso lon nho trong mang la :"+Min);
        System.out.print("\n");
        for(int e:c)
        {
            if(e%2==0)
            {
                 System.out.print(e+" ");
            }
        }
        System.out.print("\n");
        
          for(int x:c)
        {
            if(x%2!=0)
            {
                 System.out.print(x+" ");
            }
        }
        String chuoi="abcabc";
        demabc(chuoi);
        System.out.print("\n");
        StringBuilder str=new StringBuilder(chuoi);
        System.out.print(str.reverse().toString());
        System.out.println();
        String []mangten=ten.split(" ");
        int p=mangten.length;
        //System.out.println(mangten[0]);
        for(int i=0;i<mangten.length;i++)
        {       
               System.out.print(mangten[i+1]+" ");
        }
        //System.out.println(mangten[p]);
        String S1=new String("abcd");
        String S2=new String("1234");
        String S3=new String();
        int s=S2.length();
        int k;
        if(s%2==0)
        {
            k=s/2;
        }
        else{
            k=(s+1)/2;
        }
        S3=S2.substring(0,k);
        S3=S3+S1;
        
        S3=S3+S2.substring(k);
        System.out.println(S3);
        }
 }