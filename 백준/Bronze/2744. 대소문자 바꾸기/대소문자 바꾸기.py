s = input()

for i in s:
    if i.isupper() == True:
        print(i.lower(), end="")
    else:
        print(i.upper(), end="")