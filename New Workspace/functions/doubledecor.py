def decor(func):
    def inner(*args):
        #a=int(input("Enter number"))
        result = func(*args)
        return result*2
    return inner

def num():
    return 5

@decor
def num2(a):
    return a*10

#resultfun = decor(num2)

print(num2(4))

#print(resultfun())