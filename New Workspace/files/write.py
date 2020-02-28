f= open("myfile.txt","w")
print("Enter text, Type # when you are done")
s=''
while s!='#':
    s=input()
    f.write(s+"\n")
f.close()