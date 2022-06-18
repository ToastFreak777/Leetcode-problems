class Solution:
    def romanToInt(self, s: str) -> int:
        if len(s) < 1 or len(s) > 15:
            return None

        symbols = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000,
        }

        romanNumeral = 0

        for i in range(len(s)):
            if i > 0:
                if symbols[s[i]] <= symbols[s[i - 1]]:
                    romanNumeral += symbols[s[i]]
                else:
                    romanNumeral -= symbols[s[i - 1]]
                    romanNumeral += symbols[s[i]] - symbols[s[i - 1]]
            else:
                romanNumeral += symbols[s[i]]

        return romanNumeral
