from abc import abstractmethod,ABC
class TouchScreenLaptop(ABC):
    @abstractmethod
    def scroll(self):
        pass
    @abstractmethod
    def click(self):
        pass
    
class HP(TouchScreenLaptop):
    def scroll(self):
        print("scroll on HP Laptop")
    
class Dell(TouchScreenLaptop):
    def scroll(self):
        print("scroll on Dell laptop")


class HPNotebook(HP):
    def click(self):
        print("Click on HP Notebook")
    
class DellNotebook(Dell):
    def click(self):
        print("click on Dell Notebook")
        
        

d=DellNotebook()
d.click()
d.scroll()

h=HPNotebook()
h.click()
h.scroll()