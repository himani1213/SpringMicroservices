lst=[20,30,40,234]
print(type(lst))
b=bytes(lst)
print(type(b))
print(b[2])
#b[3]=22
b1=bytearray(lst)
b1[2]= 33
print(type(b1))