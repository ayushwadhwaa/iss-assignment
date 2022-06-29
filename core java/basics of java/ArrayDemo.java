public class ArrayDemo {
    public static void main(String[] args) {
        int[] numArr = new int[5];
        // 4th element of the array
        numArr[3] = 7;
        // 1st element
        numArr[0] = 9;
        for(int i = 0; i < numArr.length; i++){
            System.out.println("Value at index " + i + " is " + numArr[i]);
        }
    }
}
