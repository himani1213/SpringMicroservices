class Patient:
    def __init__(self,id,name,ssn):
        self.__id=id
        self.__name=name
        self.__ssn=ssn
        

    def display(self):
        print(self.__id)
        print(self.__name)
        print(self.__ssn)
        
p=Patient(1,"John",123)

p.display()
