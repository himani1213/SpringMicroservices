import re
str= "Take up 1-3-2019 One idea.One idea at a time 12-11-2019"
result = re.search(r'o\w', str)
print(result)


result = re.findall(r'o\w\w', str)
print(result)

result = re.match(r'o\w\w', str)
print(result)

result = re.sub(r'One', 'Two', str)
print(result)

result = re.findall(r'O\w{0,2}', str)
print(result)

result = re.findall(r'\d{1,2}-\d{1,2}-\d{4}', str)
print(result)

result = re.search(r'^T\w+', str)
print(result.group())

result = re.search(r'^T[a,k]\w+', str)
print(result.group())