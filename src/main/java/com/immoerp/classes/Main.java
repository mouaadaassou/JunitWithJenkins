public class Main {

	 public static void main(String[] args) {
                long[] array = {-3, -7, -8, -9, -4, -1};
                long result = selectMaxOfAnArray(array);
        }


        public static long selectMaxOfAnArray(long[] array) {
		if(array.length == 0)
			throw new IllegalArgumentException("the array is empty, try to add items to it the next time");
                long max = array[0];
                int index = 0;
                for(int i = 0; i < array.length ; i++) {
                        if(max < array[i]){
                                max = array[i];
                                index = i;
                        }
                }
                return (long)max;

        }

}
