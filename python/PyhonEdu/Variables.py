#                            Изучение Varibales

                            # Переменные
# Переменным можно присваивать различные типы данных

a = b = 2      # chained assignment
a = "greetings"

# In Python, there are two main types of numbers: integers and floats

number = 9
print(type(number))   # print type of variable "number"

float_number = 9.0
print(type(float_number))



                            # Пребразования типов

# There are several built-in functions that let you convert one data type to
# another. These functions return a new object representing the converted value.
# "int(x)" converts x to an integer. "float(x)" converts x to a floating-point
# number. "str(x)" converts object x to a string representation.

float_number = 9.0
int(float_number)



                        #  Арифметические операции

# Just as with any other programming language, the addition (+), subtraction
# (-), multiplication (*), and division (/) operators can be used with numbers.
# In addition Python has the power (**) and modulo (%) operators.

5 ** 4 = 625


# Boolean is a type of value that can only be True or False. The '==' (equality)
# operator checks whether the two variables being compared are equal.

two = 2
three = 3
is_equal = two == three



                        # Операторы сравнения

# Python has many types of comparison operators including >=, <=, >, <, etc.
# All comparison operations in Python have the same priority. Comparisons yield
# boolean values: either True or False. Comparisons can be chained arbitrarily.

one = 1
two = 2
three = 3

print(one < two < three) # This chained comparison
is_greater = three > two
