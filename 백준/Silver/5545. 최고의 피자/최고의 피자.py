n = int(input()) 
a,b = map(int,input().split()) 
c = int(input()) 
topplist = [] 

for i in range (n) :
    topplist.append(int(input()))

topplist.sort(reverse=True)

total_cal = c

max_ratio = c//a

for i in range(len(topplist)):
    total_cal += topplist[i]
    total_price = a + b*(i+1)
    current = total_cal // total_price

    max_ratio = max(max_ratio,current)

print(max_ratio)