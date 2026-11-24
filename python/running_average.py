number = int(input('Enter a number(Press -1 to end: )'))
count = 1
total = 0 
while(number != -1):
    total += number
    average = total / count
    print(f'{average: .2f}')
    count += 1
    number = int(input('Enter a number(Press -1 to end: )'))
