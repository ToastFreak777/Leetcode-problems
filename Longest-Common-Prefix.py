class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        if len(strs) == 0:
            return ""

        prefix = strs[0]

        for str in strs:
            while not str.startswith(prefix):
                prefix = prefix[: len(prefix) - 1]

        return prefix
