class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        setDict = set()
        for num in nums:
            if num in setDict:
                return True
            setDict.add(num)
        return False
        