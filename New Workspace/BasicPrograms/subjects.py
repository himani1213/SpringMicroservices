maths=int(input("Enter Maths marks"))
physics=int(input("Enter Physics marks"))
chemistry=int(input("Enter Chemistry marks"))

if(maths<35 and physics<35 and chemistry<35):
    print("He failed")
else:
    average=(maths+physics+chemistry)/300
    if(average>=69):
        print("You got A grade")
    elif(average<=69 and average>=59):
        print("You got B grade")
    else:
        print("You got C grade")