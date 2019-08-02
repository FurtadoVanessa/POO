package Seis;

import Quatro.ExceptionA;
import Quatro.ExceptionB;

import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, f, g, x;
        a=b=c=d=f=g=0;
        x = sc.nextInt();
//
//        try{
//            try{
//                switch(x){
//                    case 0:
//                        throw new Level1Exception();
//                    case 1:
//                        throw new Level2Exception();
//                    case 2:
//                        throw new Level3Exception();
//                    case 3:
//                        throw new Exception();
//                }
//                a++;
//            }
//            catch(Level2Exception e){
//                b++;
//            } finally {
//                c++;
//            }
//        } catch (Level1Exception e){
//            d++;
//        } catch (Exception e){
//            f++;
//        } finally {
//            g++;
//        }
//        System.out.println("a "+a + ", b "+b+", c "+c+", d "+d+", f "+f+", g "+g);

        try{
            primeiro(x);
            System.out.println("Apos primeiro");
        } catch (IllegalMonitorStateException e){
            System.out.println("trata primeiro");
        }
        System.out.println("saiu primeiro");


    }

    static void primeiro(int x) throws IllegalArgumentException{
            try{
                segundo(x);
                System.out.println("depois segundo");
            }catch (IOException e){
                System.out.println("trata segundo");
            }
        System.out.println("Saiu segundo");
        }

    static void segundo(int x) throws IllegalArgumentException, IOException{
        try{
            switch (x){
                case 0:
                    throw new IllegalArgumentException();
                case 1:
                    throw new IOException();
                case 2:
                    throw new EOFException();
            }
            System.out.println("depois switch");
        }catch (EOFException E){
            System.out.println("trata terceiro");
        }
        System.out.println("saiu terceiro");
    }
}
