from threading import Thread, current_thread
from time import sleep

class MyThread:
    def displaynumbers(self):
        i=0
        print(current_thread().getName())
        sleep(1)
        while(i<=10):
            print(i)
            i+=1
            
            
            
obj = MyThread()
t=Thread(target=obj.displaynumbers)
t.start()

t2=Thread(target=obj.displaynumbers)
t2.start()
t3=Thread(target=obj.displaynumbers)
t3.start()