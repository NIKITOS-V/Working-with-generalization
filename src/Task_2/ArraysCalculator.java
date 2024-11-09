package Task_2;


public class ArraysCalculator {
    private ArraysCalculator(){}

    public static <T> boolean compareArrays(T[] firstArray, T[] secondArray){
        if(firstArray.length != secondArray.length){
            return false;
        }

        for(int index = 0; index < firstArray.length; index++){
            if(!firstArray[index].getClass().equals(secondArray[index].getClass())){
                return false;
            }
        }

        return true;
    }
}
