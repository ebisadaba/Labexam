public class Question4 {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,8,9,7,1};
        int result = findingMax(arr);
        System.out.print("The maximum NUmber is: " + result);

    }

    public static int findingMax(int arr[]){
        if (arr.length == 0) {
            System.out.print("Array is empty");
        }

        int maxElement = arr[0];
        for (int num : arr) {
            if (num > maxElement) {
                maxElement = num;
            }
        }
        return maxElement;
    }

}





