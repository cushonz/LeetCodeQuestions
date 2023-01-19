def reverseString(s):
    """
    :type s: List[str]
    :rtype: None Do not return anything, modify s in-place instead.
    """
    l = 0
    r = len(s) - 1
    for letter in s:
        leftBubble = s[l]
        s[l] = s[r]
        s[r] = leftBubble
        l += 1
        r -= 1


x = {"o", "l", "l", "e", "h"}
print(x[0])
reverseString(x)
print(x)
