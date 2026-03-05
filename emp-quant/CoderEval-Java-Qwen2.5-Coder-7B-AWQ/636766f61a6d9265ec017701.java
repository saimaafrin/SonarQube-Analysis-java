public static int lastIndexOf(String str,String searchStr){
def longest_palindrome_with_vowel(s):
    def is_vowel(char):
        return char.lower() in 'aeiou'
    
    def expand_around_center(left, right):
        while left >= 0 and right < len(s) and s[left] == s[right]:
            left -= 1
            right += 1
        return s[left + 1:right]
    
    max_length = 0
    result = ""
    
    for i in range(len(s)):
        # Check odd length palindromes
        temp = expand_around_center(i, i)
        if is_vowel(temp[0]) or is_vowel(temp[-1]):
            if len(temp) > max_length:
                max_length = len(temp)
                result = temp
        
        # Check even length palindromes
        temp = expand_around_center(i, i + 1)
        if is_vowel(temp[0]) or is_vowel(temp[-1]):
            if len(temp) > max_length:
                max_length = len(temp)
                result = temp
    
    return result
}