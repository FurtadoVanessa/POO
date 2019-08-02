package Quatro;

public class Quatro {


    public static void main(String[] args){

        try{
            throw new ExceptionB();
        }catch (ExceptionA a){
            System.out.println("Tratou B com A");
        }
        try{
            throw new ExceptionC();
        }catch (ExceptionA a){
            System.out.println("Tratou C com A");
        }
    }
}
