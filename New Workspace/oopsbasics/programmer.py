class Programmer:
    def setName(self,n):
        self.name = n
    def getName(self):
        return self.name
    def setSalary(self,s):
        self.salary = s
    def getSalary(self):
        return self.salary
    def setTechnologies(self,t):
        self.technologies = t
    def getTechnologies(self):
        return self.technologies
    
    
p1 = Programmer()
p1.setName("John")
p1.setSalary(1234)
p1.setTechnologies(["Java","Hibernate","Spring","Python"])

print(p1.getName())
print(p1.getSalary())
print(p1.getTechnologies())