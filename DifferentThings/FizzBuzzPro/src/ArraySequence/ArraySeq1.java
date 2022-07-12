package ArraySequence;

public class ArraySeq1 {
    public static String[] setArray(String [] array){

        for(int i = 1; i <= array.length; i++){
            if(i % 15 == 0){
                array[i - 1] = "FizzBuzz";
            }
            else if(i % 5 == 0){
                array[i - 1] = "Buzz";
            }
            else if(i % 3 == 0){
                array[i - 1] = "Fizz";
            }
            else{
                array[i - 1] = String.valueOf(i);
            }
        }
        return array;
    }
}
