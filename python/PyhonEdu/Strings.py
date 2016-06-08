#                             Изучение Strings


# Combining two strings using the + symbol is called concatenation.

hello = "Hello"
world = 'World'
hello_world = hello + " " + world




# Python supports a string-by-number multiplication (but not the other
# way around!).

hello = "hello"
ten_of_hellos = hello * 10




# You can access a character of a string if you know its position. For example,
# str[index] will yield the character at position ‘index’ in the string 'str'.


python = "Python"
print(python[0])    # -> 'P'




# You can use negative numbers in the indexing operator to count characters
# ‘backwards’ from the end of the string.


long_string = "This is a very long string!"
exclamation = long_string[-1]



# Slicing is used to get multiple characters (a substring) from a string. Its
# syntax is similar to that of indexing, but instead of just one index you use
# two indices (numbers) separated by a colon, e.g. str[ind1:ind2].


monty_python = "Monty Python"
monty = monty_python[0:5]



# If you want to check whether a string contains a specific letter or a substring,
# you can use the "in" keyword.

ice_cream = "ice cream"
print("cream" in ice_cream)  # -> True




# The len() function is used to count how many characters a string contains.

phrase = """
It is a really long string
triple-quoted strings are used
to define multi-line strings
"""
first_half = phrase[0:len(phrase) / 2]
print(first_half)




# Backslash is used to escape single or double quotation marks, for example
# 'It\'s me' or "She said \"Hello\"". The special symbol '\n' is used to add a
# line break to a string.


print('The name of this ice-cream is "Sweeet\'n\'Tasty"')




# There are a lot of useful string methods. You can use the 'lower()' method to
# get rid of any capitalization in your strings. The 'upper()' method is used to
# make a string uppercase. To call any string method, type a dot after the string
# (or a variable containing the string) and the method name after it,
# e.g. "John".upper(). In PyCharm, you can explore all available string methods
# by using Ctrl+Space after a dot.

monty_python = "Monty Python"
print(monty_python)
print(monty_python.lower())




# The % operator after a string is used to combine a string with variables.
# The % operator will replace %s in a string with the string variable that comes
# after it. The %d special symbol is used as a placeholder for numeric or decimal
# values.


name = "John"
print("Hello, PyCharm! My name is %s!" % name)
age = 20
print("I'm %d years old" % age)


# Если я хочу несколько аргументов в строек, можно использовать snippet
name = "Bodya"
age = 20
print ("Hello, my name is %s and i'm %d years old" % (name, age))
