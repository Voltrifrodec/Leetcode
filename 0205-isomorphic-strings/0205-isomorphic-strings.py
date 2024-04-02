class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        str1 = []
        str2 = []
                
        for i in s:
            str1.append(s.index(i))
        for i in t:
            str2.append(t.index(i))
        
        return True if str1 == str2 else False
        