class Solution:
    def trap(self, height):
        l, r = 0, len(height) - 1
        maxL = height[l]
        maxR = height[r]
        res = 0

        while l < r:
            if maxL < maxR:
                l += 1
                maxL = max(maxL, height[l])
                res += maxL - height[l]
            else:
                r -= 1
                maxR = max(maxR, height[r])
                res += maxR - height[r]
        return res
    

if __name__ == "__main__":
    sol = Solution()
    height = [0,1,0,2,1,0,1,3,2,1,2,1]
    print(sol.trap(height))


# O(n), O(1)