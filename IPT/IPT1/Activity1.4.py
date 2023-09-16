"""
Input print: Previous and next
Write a program that reads an integer number and prints its previous and next numbers.
Example input
179
Example output
The next number for the number 179 is 180
The previous number for the number 179 is 178
"""
number = int(input())
next_number = number + 1
previous_number = number-1
print('The next number for the number', number, 'is', next_number)
print('The previous number for the number', number, 'is', previous_number)