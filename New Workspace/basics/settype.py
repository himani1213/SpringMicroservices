s={10,20,30,10,20,10,"xyz"}
s.update([88,99]) # removes duplicates
#does not gaurantee order. can not perform indexing and slicing
s.remove(30)

print(s)
print(type(s))

f=frozenset(s) #can not remove and update frzen set
#f.update([20])