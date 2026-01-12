class Solution:
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False
        
        countS, countT = {}, {}
        for i in range(len(s)):
            countS[s[i]] = countS.get(s[i], 0) + 1
            countT[t[i]] = countT.get(t[i], 0) + 1
        
        return countS == countT
    

if __name__ == "__main__":
    sol = Solution()
    s = "anagram"
    t = "anagrm"
    print(sol.isAnagram(s,t))

    