class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        str1 = []
        str2 = []
                
        str1.extend(s.index(i) for i in s)
        
        for i in t:
            str2.append(t.index(i))
        
        return True if str1 == str2 else False
        