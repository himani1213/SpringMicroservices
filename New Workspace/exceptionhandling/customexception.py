class InvalidPasswordException(Exception):
    def __init__(self,arg):
        super.__init__(arg)
     
a=input("Enter password")   
try:
    if(len(a)<8):
        raise InvalidPasswordException(a)
except InvalidPasswordException:
    print("Invalid Password Exception")
else:
    print('The password length is =', len(a))
