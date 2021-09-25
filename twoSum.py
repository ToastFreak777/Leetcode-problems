from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1):
                if nums[i] + nums[j] == target and i != j:
                    List = [j, i]
                    return List


nums = [2, 7, 11, 15]
target = 9

solution = Solution()
print(solution.twoSum(nums, target))
