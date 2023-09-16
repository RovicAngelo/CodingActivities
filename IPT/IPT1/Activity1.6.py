"""
Input print: Hours and minutes
Given the integer N- the number of seconds that is passed since midnight - how many full hours and full minutes are
passed since midnight? The program should print two numbers: the number of hours(between 0 and 23) and the numbers
of minute(between 0 and 1339).For example, if N= 3900, then 3900 seconds have passed since midnight, ie now it 1:05am.
So the program should print 1 65- 1 full hour is passed since midnight, 65 full minutes passed since midnight.
Example input
3900
Example output
1 65
"""
num = int(input())
hour = num/3600
hour1 = num % 3600
minute = int(num/60)
print(hour, minute)
