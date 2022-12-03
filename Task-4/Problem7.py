x = int(input())
li = []
li1 = []
for i in range(0,x):
    li.append(input())
for i in range(0,x):
    if li[i] not in li1:
        print(li[i],end=" ")
        for j in range(i+1,x):
            if sorted(li[i]) == sorted(li[j]):
               li1.append(li[j])
               print(li[j],end=" ")
        print("")