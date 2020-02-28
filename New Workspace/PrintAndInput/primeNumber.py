
n=int(input("Enter a number: "))
primeFlag=True
r=range(2,n-1)
for i in r:
    if(n%i==0):
        primeFlag = False
        break
if(primeFlag):
    print("%i is a prime number"%n)
else:
    print("%i is not a prime number"%n)