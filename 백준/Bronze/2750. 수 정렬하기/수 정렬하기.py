count = int(input())
nums = [int(input()) for i in range(count)]
nums = sorted(nums)
for i in range(count):
    print(nums[i])