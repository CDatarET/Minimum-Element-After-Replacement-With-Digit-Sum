class Solution:
    def sumDigits(self, n):
        s = 0
        while n > 0:
            s += n % 10
            n //= 10
        
        return s

    def minElement(self, nums: List[int]) -> int:
        m = 100000
        for n in nums:
            x = self.sumDigits(n)
            m = min(m, x)
        
        return m
