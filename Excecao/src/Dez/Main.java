package Dez;

public class Main {

    public static void main(String[] args){

        Utils u = new Utils();
        double x = -500;
        try{
            if(x<(-459.67)){
                throw new FahrenheitException();
            }
            System.out.println(u.toCelsius(10));
        }catch (FahrenheitException e){
            System.out.println("Temperatura invalida");
        }catch (TemperatureException e){
            System.out.println("Erro geral");
        }
    }
}


//Na letra C, o código não é copiado pois nenhuma exceção é lançada.
