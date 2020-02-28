x=123

def display():
    x=678
    print(x)
    print(globals()['x'])


print(x)
z=display #assigning func to variable

z()
z()