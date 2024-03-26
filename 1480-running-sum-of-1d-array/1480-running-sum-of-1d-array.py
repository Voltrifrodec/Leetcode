class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        temp = 0
        res = []
        for num in nums:
            temp += num
            res.append(temp)
        return res