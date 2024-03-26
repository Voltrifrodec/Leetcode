class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        res = []
        for i in range(0,len(nums)):
            temp = 0
            for j in range(0,i + 1):
                temp += nums[j]
            res.append(temp)
        return res