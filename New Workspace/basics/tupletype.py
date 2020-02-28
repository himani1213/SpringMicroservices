tpl=(40,50,40,"XYZ") # always use comma with single element
print(tpl)
print(tpl[3])
print(tpl*3)
print(tpl.count(40))
print(tpl.index("XYZ"))

lst=[67,34,"XYZ"]
print(type(lst))
tpl1=tuple(lst)
print(type(tpl1))
print(tpl1)