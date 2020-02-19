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
        
        ArrayList <Integer> newList = new ArrayList<Integer>();
        boolean done = false;
        while (!done){
            while(list.size() > 0){
                list.remove(0);
            }
            for (int i=0; i < list.size(); i++){
                int x = list.get(i);
                if (i == 0){
                    newList.add(x);
                }
                else{
                    for(int ii=0; ii < list.size(); ii++){
                        if (x < newList.get(0)){
                            newList.add(0, x);
                        }
                        //else if (x > newList.get(0)){
                        else{
                            newList.add(list.size(), x);
                        }               
                    
                    }
                }
            }
            list = newList;
            
            for (int y = 1; y < list.size()-1; y++){
                if (y < list.get(y+1) && y > list.get(y-1)){
                    continue;
                }
                done = true;
            }
        }
        
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
        
        
        boolean done = false;
        while (!done){
            for (int i=0; i < list.size(); i++){
                int x = list.get(i);
                if (i == 0){
                    
                }
                else{
                    
                }
            }
            
            for (int y = 1; y < list.size()-1; y++){
                if (y < list.get(y+1) && y > list.get(y-1)){
                    continue;
                }
                done = true;
            }
        }
        
        
    }

     /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void mergeSort(ArrayList <Integer> list){
        //replace these lines with your code
        System.out.println();
        System.out.println("Merge Sort");
        System.out.println();
        
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, range, distance = Integer.MAX_VALUE, newDistance = 0, trans = 0, l = list.size();
        ArrayList <Integer> newList = new ArrayList<Integer>();
        ArrayList <Integer> update = new ArrayList<Integer>();
        boolean done = false;
        
        
            
                
        for (int i=0; i < list.size(); i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
            else if (list.get(i) < min){
                min = list.get(i);
            }
        }
         
        
        while (!done){
        
            for (int i=0; i < list.size()/2; i++){
                newList.add(list.get(i));
                list.remove(i);
            }
        
            for (int i = 0; i < l; i++){
                if (list.get(0) <= newList.get(0)){
                    update.add(list.get(0));
                    list.remove(0);
                }
                else if (list.get(0) > newList.get(0)){
                    update.add(newList.get(0));
                    newList.remove(0);
                }
            }
            
            list = update;
                
            for (int y = 1; y < list.size()-1; y++){
                if (y < list.get(y+1) && y > list.get(y-1)){
                    continue;
                }
                done = true;
            }
        }
        
        
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
