n=int(input("Enter a number: "))

i=1
while i<n and i<=100:
    i+=1
    if(i%10==0):
        continue
    print(i)
