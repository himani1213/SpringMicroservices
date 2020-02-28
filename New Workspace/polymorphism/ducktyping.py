from subprocess import call
class Duck:
    def talk(self):
        print("Quack Quack")

class Human:
    def talk(self):
        print("Hello")


def calltalk(obj):
    obj.talk();
    
d=Duck()
calltalk(d)
h=Human()
calltalk(h)