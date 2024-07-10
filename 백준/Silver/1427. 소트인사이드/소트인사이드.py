n = input()
nums=[]
nums2=""
for i in n :
    nums.append(int(i))
while len(nums)!=0:
    max = nums[0]
    for i in range(len(nums)):
        if max < nums[i] :
            max = nums[i]
    nums2 += str(max)
    nums.remove(max)

print(nums2)