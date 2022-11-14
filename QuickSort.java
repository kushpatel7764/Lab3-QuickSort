class QuickSort{
    public static void main(String[] args){
        int[] nums = {10, 9, 8,7, 6, 5, 4, 3, 2, 1};
        quicksort(nums, 0, nums.length-1);
    }

    public static void quicksort(int[] nums, int lowIndex, int highIndex){
        //Base Case: when looking at a sub-array of size 1 or less
        if (lowIndex >= highIndex){ 
            return; 
        }
        
        int part = nums[highIndex];
        int leftPoint = lowIndex;
        int rightPoint = highIndex; 
        
        while (leftPoint < rightPoint) {
            while(nums[leftPoint] <= part && leftPoint < rightPoint) {
                ++leftPoint;
            }
            while(nums[rightPoint] >= part && leftPoint < rightPoint){
                --rightPoint;
            }

            swap(nums, leftPoint, rightPoint); //switching out of place values
        }
        swap(nums, leftPoint, highIndex); //Swapping partition in


        //Recursive calls
        quicksort(nums, lowIndex, leftPoint-1); //quicksort the left half
        quicksort(nums, leftPoint+1, highIndex); //quicksort the right half
    }
    public static void swap(int[] nums, int index1, int index2){
            if(index1 == index2){
                return; 
            }
            System.out.println("Swapping "+ nums[index1]+" and "+nums[index2]);
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp; 
    }
}
