class Solution:
    def maxArea(self, height):
        l, r = 0, len(height) - 1
        result = 0
        while l < r:
            area = min(height[l], height[r]) * (r - l)
            result = max(area, result)
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return result

        # O(n),O(1)

if __name__ == "__main__":
    sol = Solution()
    input = [1,8,6,2,5,4,8,3,7]
    print(sol.maxArea(input))