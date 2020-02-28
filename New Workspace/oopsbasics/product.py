class Product:
    
    def __init__(self):
        self.name= 'Iphone'
        self.price = 700
        self.description = 'Its awesome'
    
    def display(self):
        print(self.name)
        print(self.price)
        print(self.description)    

p1 = Product()

p1.display()

p2 = Product()
p2.display()
    