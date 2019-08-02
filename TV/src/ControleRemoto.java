public class ControleRemoto {


    public void aumentarVolume(Televisao tv){
        tv.setVolume(tv.getVolume()+1);
    }

    public void diminuirVolume(Televisao tv){
        tv.setVolume(tv.getVolume()-1);
    }

    public void aumentarCanal(Televisao tv){
        tv.setCanal(tv.getCanal()+1);
    }

    public void diminuirCanal(Televisao tv){
        tv.setCanal(tv.getCanal()-1);
    }

    public void trocarCanal(Televisao tv, int canal){
        tv.setCanal(canal);
    }

    public int consultarVolume(Televisao tv){
        return tv.getVolume();
    }

    public int consultarCanal(Televisao tv){
        return tv.getCanal();
    }


}
