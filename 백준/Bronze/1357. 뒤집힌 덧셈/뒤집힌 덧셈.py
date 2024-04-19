a,b=input().split()

revx = a[::-1]
revy = b[::-1]

REV = int(revx)+int(revy)

revxy = str(REV)

revxy = int(revxy[::-1])

print(revxy)