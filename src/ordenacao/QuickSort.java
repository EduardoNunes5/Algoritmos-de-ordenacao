package ordenacao;

import static ordenacao.Util.troca;

public class QuickSort implements Ordenacao{

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public void sort(int[] array, int esquerda, int direita){

        if(esquerda < direita){
            int particao = partition(array,esquerda,direita);
            sort(array,esquerda,particao-1);
            sort(array,particao+1,direita);
        }
    }

    private int partition(int[] array, int esquerda, int direita){
        int pivotPos = (esquerda+direita)/2;
        troca(array,direita,pivotPos);
        int pivot = array[direita];

        int i = esquerda-1;
        int j = esquerda;

        while(j < direita){
            if(array[j] >= pivot){
                j++;
            }
            else{
                i++;
                troca(array, i, j);
                j++;
            }
        }
            troca(array, i+1, direita);
        return i+1;
    }


}
