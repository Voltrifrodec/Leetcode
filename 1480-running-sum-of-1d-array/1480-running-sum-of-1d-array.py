class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        x = nums[0]
        for i in range(1, len(nums)):
            nums[i] = nums[i] + x
            x = nums[i]
        return nums