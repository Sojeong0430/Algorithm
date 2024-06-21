N,M = map(int,input().split())
cards = list(map(int,input().split()))
ret = 0

for c1 in range(N-2):
    for c2 in range(c1+1,N-1):
        for c3 in range(c2+1,N):
            if(cards[c1] + cards[c2] + cards[c3] <= M ):
                ret = max(ret,cards[c1] + cards[c2] + cards[c3] )

print(ret)