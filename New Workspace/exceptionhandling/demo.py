import logging

logging.basicConfig(filename="mylog.log",level=logging.INFO)
try:
    f=open("myfile","w")
    a,b=[int(x) for x in input("Enter 2 numbers: ").split()]
    logging.info("Division in progress")
    c=a/b
    f.write("Writing %d into file"%c)
    print(c)
except ZeroDivisionError:
    print("Division by 0 is not allowed")
    print("Please enter non zero number")
    logging.error("Division by zero")
else:
    print("You have entered a non zero number")
finally:
    f.close()
    print("file closed")
    logging.info("File closed")
print("Code after exception")
    