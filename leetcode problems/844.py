# 844. Backspace String Compare
#
# Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
#
# Example 1:
#
# Input: S = "ab#c", T = "ad#c"
# Output: true
# Explanation: Both S and T become "ac".
# Example 2:
#
# Input: S = "ab##", T = "c#d#"
# Output: true
# Explanation: Both S and T become "".
# Example 3:
#
# Input: S = "a##c", T = "#a#c"
# Output: true
# Explanation: Both S and T become "c".
# Example 4:
#
# Input: S = "a#c", T = "b"
# Output: false
# Explanation: S becomes "c" while T becomes "b".

class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        def modify(string):
            stack=[]
            for i in string:
                if i=='#':
                    if len(stack)>=1:
                        stack.pop()
                else:
                    stack.append(i)
            return "".join(stack)
        return modify(S)==modify(T)
