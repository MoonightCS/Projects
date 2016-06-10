#                             Изучение структур данных


# A list is a data structure you can use to store a collection of different pieces
# of information under a single variable name. A list can be written as an array
# of comma-separated values (items) between square brackets,
# e.g. lst = [item1, item2]. Lists might contain items of different types,
# but usually all the items in the list are of the same type.


squares = [1, 4, 9, 16, 25]   # create new list
print(squares)                # [1, 4, 9, 16, 25]
print(squares[1:-1])          # [4, 9, 16]




# You can add new items at the end of the list, by using the append() method
# and concatenation. Unlike strings, lists are a mutable type, i.e. it is possible
# to change their content using lst[index] = new_item

animals = ['elephant', 'lion', 'tiger', "giraffe"]  # create new list
animals += ["monkey", 'dog']    # add two items to the list
animals.append("dino")   # add one more item to the list using append() method
animals[-1] = "dinosaur"
print(animals) #['elephant', 'lion', 'tiger', 'giraffe', 'monkey', 'dog', 'dinosaur']




# Assignment to slices is also possible, and this can even change the size of
# a list or clear it entirely.

animals = ['elephant', 'lion', 'tiger', "giraffe", "monkey", 'dog'] # create new list
animals[1:3] = ['cat']    # replace 2 items -- 'lion' and 'tiger' with one item -- 'cat'
animals[1:3] = []     # remove 2 items -- 'cat' and 'giraffe' from the list
animals[0:len(animals)] = []  # remove all items in a list




# Tuples(кортежи) are almost identical to lists. The only significant difference between
# tuples and lists is that tuples cannot be changed: you cannot add, change, or
# delete elements from the tuple. Tuples are constructed by a comma operator
# enclosed in parentheses (скобки), for example (a, b, c). A single item tuple must have
# a trailing(замыкающий) comma, such as (d,).


alphabet = ('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
            'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')

print(len(alphabet))





# A dictionary(Map) is similar to a list, except that you access its values
# by looking up a key instead of an index. A key can be any string or a number.
# Dictionaries are enclosed in curly(фигурные) braces e.g. dct = {'key1' : "value1", 'key2' : "value2"}.



# create new dictionary.
phone_book = {"John": 123, "Jane": 234, "Jerard": 345}    # "John", "Jane" and "Jerard" are keys and numbers are values
print(phone_book)

# Add new item to the dictionary
phone_book["Jill"] = 345
print(phone_book)

# Remove key-value pair from phone_book
del phone_book['John']

print(phone_book["Jane"])




# There are a lot of useful methods in dictionaries such as keys() and values().

phone_book = {"John": 123, "Jane": 234, "Jerard": 345}  # create new dictionary

# Add new item to the dictionary

phone_book["Jill"] = 456

print(phone_book.keys())

print(phone_book.values())



# The "in" keyword is used to check if a list or a dictionary contains a specific
# item. You can apply "in" to lists or dictionaries the same way as you did with strings.



grocery_list = ["fish", "tomato", 'apples']   # create new list

print("tomato" in grocery_list)    # check that grocery_list contains "tomato" item

grocery_dict = {"fish": 1, "tomato": 6, 'apples': 3}   # create new dictionary

print("fish" in grocery_dict.keys())     # Check if grocery_dict keys contain "fish"
