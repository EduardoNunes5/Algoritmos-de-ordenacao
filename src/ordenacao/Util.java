package ordenacao;

public  class Util {

    public static void troca(int[]array, int i, int j){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
