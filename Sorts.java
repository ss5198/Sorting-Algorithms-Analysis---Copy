import java.util.*;

public class Sorts{
    private long steps;

    /**
     *  Description of Constructor
     *
     * @param  list  Description of Parameter
     */
    public Sorts(){
        steps = 0;
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(ArrayList <Integer> list){
        //replace these lines with your code
        System.out.println();
        System.out.println("Bubble Sort");
        System.out.println();

        steps = 0;
        for (int outer = 0; outer < list.size() - 1; outer++){
            for (int inner = 0; inner < list.size()-outer-1; inner++){
                steps += 3;//count one compare and 2 gets
                if (list.get(inner)>(list.get(inner + 1))){
                    steps += 4;//count 2 gets and 2 sets
                    int temp = list.get(inner);
                    list.set(inner,list.get(inner + 1));
                    list.set(inner + 1,temp);
                }
            }
        }
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(ArrayList <Integer> list){
        //replace these lines with your code
        System.out.println();
        System.out.println("Selection Sort");
        System.out.println();
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void insertionSort(ArrayList <Integer> list){
        //replace these lines with your code
        System.out.println();
        System.out.println("Insertion Sort");
        System.out.println();
    }

     /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void mergeSort(ArrayList <Integer> list){
        //replace these lines with your code
        System.out.println();
        System.out.println("Insertion Sort");
        System.out.println();
    }
    
    /**
     *  Accessor method to return the current value of steps
     *
     */
    public long getStepCount(){
        return steps;
    }

    /**
     *  Modifier method to set or reset the step count. Usually called
     *  prior to invocation of a sort method.
     *
     * @param  stepCount   value assigned to steps
     */
    public void setStepCount(long stepCount){
        steps = stepCount;
    }
}
