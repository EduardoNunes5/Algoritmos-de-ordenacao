package ordenacao;

import static ordenacao.Util.troca;

public class RecursiveSelection implements Ordenacao{

    @Override
    public void sort(int[] array){
        sort(array,0);
    }

    public void sort(int[] array, int atual){

        if(atual < array.length){
            int m_atual = atual;
            for (int i = atual+1; i < array.length; i ++){
                if(array[i] < array[m_atual])
                    m_atual = i;
            }
            troca(array,atual,m_atual);
            sort(array,atual+1);
        }
    }

}
