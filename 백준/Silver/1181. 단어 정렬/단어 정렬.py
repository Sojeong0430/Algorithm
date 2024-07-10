wordlist=[]
n = int(input())
for _ in range(n):
    word = input()
    if word in wordlist:
        pass
    else:
        wordlist.append(word)
wordlist.sort()
wordlist.sort(key= lambda x : len(x))
for i in wordlist :
    print(i)