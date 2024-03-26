class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        res = []
        temp = 0
        for num in nums:
            temp += num
            res.append(temp)
        return res