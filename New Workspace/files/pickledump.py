import pickle,student

f=open("student.dat","wb") #for binary file
s=student.Student(1,"John",90)
pickle.dump(s,f)