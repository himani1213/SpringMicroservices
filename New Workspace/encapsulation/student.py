class Student:
    
    def setId(self,id): 
        self.id=id
    def getId(self):
        return self.id
    def setName(self,name):
        self.name = name
    def getName(self):
        return self.name
'''    def __init__(self):
        self.__id=123
        self.__name="John"

    def display(self):
        print(self.__id)
        print(self.__name)'''
s=Student()

''''s.display()
print(s._Student__id)#can access private field - name mangling 
print(s._Student__name)'''
s.setId(123)
s.setName("John")
print(s.getId())
print(s.getName())