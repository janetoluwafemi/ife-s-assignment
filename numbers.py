def numbering(word):
	if word < 2:	
		return " "
	else:
		return word[:2] + word[:-2]
