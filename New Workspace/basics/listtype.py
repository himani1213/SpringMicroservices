lst=[10,20,'Himani',10,-30.5]
print(lst)
print(lst[3])
print(lst[3:5])

lst.append(40)
lst.remove('Himani')
del(lst[1])
print(lst)

print(max(lst))
print(min(lst))
print(lst.insert(1, 99))

lst.sort(key=None, reverse=True)
print(lst)