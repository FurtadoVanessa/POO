package Tres;

import java.io.EOFException;

public class Tres1 {

    public static void main(String[] args){

        f(1); //aparecerá "Exception"
        f(2); //aparecerá "Exception"
        f(3); //aparecerá "Exception"
    }

        public static void f (int i) {
            try {
                switch (i) {
                    default:
                    case 1: throw new Exception();
                    case 2: throw new NumberFormatException();
                    case 3: throw new EOFException();
                }
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
//            catch (NumberFormatException e) {
//
//                System.out.println("NumberFormatException");
//            }
//            catch (EOFException e){
//                System.out.println("EOFException");
//            }
        }
}
