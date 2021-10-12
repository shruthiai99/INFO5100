package neu.psa;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int p1 = 0;
        int p2 = 1;
        while(p1 < nums.length && p2 < nums.length){
            if (nums[p1] == 0 && nums[p2] != 0){
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p2++;
                p1++;
            }
            else if(nums[p1] == 0 && nums[p2] == 0){
                p2++;
            }
            else{
                p2++;
                p1++;
            }
        }
    }
}
