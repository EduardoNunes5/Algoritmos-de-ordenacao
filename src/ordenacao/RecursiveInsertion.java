package ordenacao;

import static ordenacao.Util.troca;

public class RecursiveInsertion implements Ordenacao{

    @Override
    public void sort(int[] array){
        sort(array, 1);
    }

    private void sort(int[] array, int indiceAtual){
        if(indiceAtual < array.length) {
            while (indiceAtual > 0) {
                if (array[indiceAtual] < array[indiceAtual - 1]) {
                    troca(array, indiceAtual, indiceAtual - 1);
                }
                indiceAtual--;
            }

            sort(array, indiceAtual+1);
        }
    }

}
