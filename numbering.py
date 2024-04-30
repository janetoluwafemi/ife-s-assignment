negative = 0
positive = 0
zero = 0
count = 1
#number = int(input("Enter number: "))
for value in range(1,5):
	number = int(input("Enter number: "))
	if number == 0:
		zero += count
	if number < 0:
		negative += count
	if number > 0:
		positive += count
	
print("zero" + zero)
print("negative" + negative)
print("positive" + positive)
			