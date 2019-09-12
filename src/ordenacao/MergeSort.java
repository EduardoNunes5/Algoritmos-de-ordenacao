package ordenacao;

public class MergeSort implements  Ordenacao {

    @Override
    public void sort(int[] array){
        sort(array,0,array.length-1);
    }

    public void sort(int[]array, int esquerda, int direita){

        if(esquerda < direita){
            int meio = (esquerda+direita)/2;
            sort(array, esquerda, meio);
            sort(array, meio+1, direita);
            merge(array,esquerda,meio,direita);
        }
    }

    public void merge(int[] array, int esquerda, int mid, int direita){
        int[] arrayElemEsquerda = new int[mid-esquerda + 1];
        int[] arrayElemDireita = new int[direita-mid];


        for(int i = 0; i < mid - esquerda + 1; i ++){
            arrayElemEsquerda[i] = array[i];
        }
        for(int j = 0; j < direita - mid; j ++){
            arrayElemDireita[j] = array[mid+j+1];
        }

        int i = 0;
        int j = 0;
        int k = esquerda;
        while(i < arrayElemEsquerda.length && j < arrayElemDireita.length){
            if(arrayElemEsquerda[i] < arrayElemDireita[j]){
                array[k] = arrayElemEsquerda[i];
                i++;
            }
            else{
                array[k] = arrayElemDireita[j];
                j++;
            }
            k++;
        }

        while(i < arrayElemEsquerda.length){
            array[k] = arrayElemEsquerda[i];
            k++;
            i++;
        }
        while(j < arrayElemDireita.length){
            array[k] = arrayElemDireita[j];
            k++;
            j++;
        }


    }
}
