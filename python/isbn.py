isbn = input('Enter ISBN: ')
last_digit = int(isbn) % 10
total = 0
count = 0
for number in isbn:
    count += 1
    if count == 13:
        break
    elif(count % 2 == 0):
        total += int(number) * 3
    else:
        total += int(number)
        
if(last_digit == (10 - total % 10) % 10):
    print(f'{isbn} is valid')
else:
    print(f'{isbn} is not valid')
        

