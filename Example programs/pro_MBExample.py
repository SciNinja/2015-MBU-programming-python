#This is an example program
#written by Wataru Coram

"""For the Programming Merit Badge,
I need to make a program, and debug it, in three
different languages. Python will be a first.
This is a program that asks your name and age. It also asks
whether it is correct."""

print "Hi!"
name = raw_input("What is your name?\n> ")
age = int(raw_input("What is your age? (whole number, please)\n> "))
print "According to your inputs,"
print "Your name is %s and you age is %i" %(name, age)
valid = False
while valid == False:
    
    correct_in = raw_input("If this is correct, enter yes. If it is not correct, enter no\n> ")
    if correct_in.lower() == "yes":
        correct = True
        valid = True
    elif correct_in.lower() == "no":
        correct = False
        valid = True
    else:
        correct = None
        print "That is not a valid answer. try again."
        valid = False



