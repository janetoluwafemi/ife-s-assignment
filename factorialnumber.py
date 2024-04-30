number = int(input("Enter a number: "))
num = 1
for numb in range(number, 0, -1):
	num *= numb
print(num , end='')