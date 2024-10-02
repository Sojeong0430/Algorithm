N = input()
number_list =[]

for i in N :
    number_list.append(int(i))

if 0 in number_list :
    if sum(number_list) % 3 == 0 :
        result=''
        number_list.sort(reverse=True)
        for i in number_list:
            result += str(i)
        print(result)
    else:
        print(-1)

else:
    print(-1)