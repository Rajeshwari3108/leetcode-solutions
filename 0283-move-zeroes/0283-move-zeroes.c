void moveZeroes(int* nums, int numsSize) {
    int i = 0;  // Position to place the next non-zero element
    
    for (int j = 0; j < numsSize; j++) {
        if (nums[j] != 0) {
            nums[i] = nums[j];
            i++;
        }
    }
    
    // Fill the rest with zeroes
    for (int k = i; k < numsSize; k++) {
        nums[k] = 0;
    }
}