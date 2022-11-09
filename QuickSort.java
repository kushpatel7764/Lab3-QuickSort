class QuickSort{
    public static void main(String[] args){
        int[] nums = {10, 9, 8,7, 6, 5, 4, 3, 2, 1};
        quicksort(nums, 0, nums.length-1);
    }

    public static void quicksort(int[] nums, int lowIndex, int highIndex){
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

            swap(nums, leftPoint, rightPoint);
        }
        
    }
    public static void swap(int[] nums, int index1, int index2){
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp; 
    }
}
