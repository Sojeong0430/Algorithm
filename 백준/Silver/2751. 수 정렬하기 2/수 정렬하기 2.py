import sys
nums=[]
n = int(sys.stdin.readline())
for i in range (n):
    nums.append(int(sys.stdin.readline()))
nums = sorted(nums)
for i in range(n):
    print(nums[i])