#write a program in python to declare a message for an instructing sign in public place
#and get the lenth of that message and count of the number a specific letter in the message:
msg = "No Smoking here"
print(len(msg))
print(msg.count('o'))
print (msg.count('s',3,5))
print(msg.count('n'))
print(msg.count('N'))
print(msg.count('O',7))
print(msg.count('o',7))
print(msg.count('o',1,7))
print(msg.count('o',7,15))
print(msg)