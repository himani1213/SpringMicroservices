def howareyou(fun):
    def inner(name):
        return fun(name)+' How are you!!'
    return inner

@howareyou
def hello(name):
    return "Hello "+name

print(hello('Himani'))