import ordenacao.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    private Ordenacao sort;
    private int[] array;
    private int[] array1;
    private int[] array2;
    private int[] array3;
    private int[] array4;
    private int[] array5;
    private Random rand;

    @BeforeEach
    public void iniciar(){
        sort = new MergeSort();
        rand = new Random();
        //instancia a classe a qual os testes serão feitos
        gerarArrays();
        gerarArrays1();
        gerarArrays2();
        gerarArrays3();
        gerarArrays4();
        gerarArrays5();
    }

    public void gerarArrays(){

        int[]a = new int[1+this.rand.nextInt(30)];
        for (int i = 0; i < a.length; i ++){
            a[i] = rand.nextInt(100);
        }
        this.array = Arrays.copyOf(a,a.length);
    }

    public void gerarArrays1(){
        int[]a = new int[1+this.rand.nextInt(30)];
        for (int i = 0; i < a.length; i ++){
            a[i] = rand.nextInt(100);
        }
        this.array1 = Arrays.copyOf(a,a.length);
    }

    public void gerarArrays2(){
        int[]a = new int[1+this.rand.nextInt(30)];
        for (int i = 0; i < a.length; i ++){
            a[i] = rand.nextInt(100);
        }
        this.array2 = Arrays.copyOf(a,a.length);
    }

    public void gerarArrays3(){
        int[]a = new int[this.rand.nextInt(30)];
        for (int i = 0; i < a.length; i ++){
            a[i] = rand.nextInt(100);
        }
        this.array3 = Arrays.copyOf(a,a.length);
    }

    public void gerarArrays4(){
        int[]a = new int[1+this.rand.nextInt(30)];
        for (int i = 0; i < a.length; i ++){
            a[i] = rand.nextInt(100);
        }
        this.array4 = Arrays.copyOf(a,a.length);
    }

    public void gerarArrays5(){
        int[]a = new int[1+this.rand.nextInt(30)];
        for (int i = 0; i < a.length; i ++){
            a[i] = rand.nextInt(100);
        }
        this.array5 = Arrays.copyOf(a,a.length);
    }
    @org.junit.jupiter.api.Test
    public void sort(){
        sort.sort(array);
        int[] sorted = Arrays.copyOf(array,array.length);
        Arrays.sort(sorted);
        assertArrayEquals(sorted,array);
    }

    @org.junit.jupiter.api.Test
    public void sort1(){
        sort.sort(array1);
        int[] sorted = Arrays.copyOf(array1,array1.length);
        Arrays.sort(sorted);
        assertArrayEquals(sorted,array1);
    }

    @org.junit.jupiter.api.Test
    public void sort2(){
        sort.sort(array2);
        int[] sorted = Arrays.copyOf(array2,array2.length);
        Arrays.sort(sorted);
        assertArrayEquals(sorted,array2);
    }

    @org.junit.jupiter.api.Test
    public void sort3(){
        sort.sort(array3);
        int[] sorted = Arrays.copyOf(array3,array3.length);
        Arrays.sort(sorted);
        assertArrayEquals(sorted,array3);
    }
    @org.junit.jupiter.api.Test
    public void sort4(){
        sort.sort(array4);
        int[] sorted = Arrays.copyOf(array4,array4.length);
        Arrays.sort(sorted);
        assertArrayEquals(sorted,array4);
    }

    @org.junit.jupiter.api.Test
    public void sort5(){
        sort.sort(array5);
        int[] sorted = Arrays.copyOf(array5,array5.length);
        Arrays.sort(sorted);
        assertArrayEquals(sorted,array5);
    }

}