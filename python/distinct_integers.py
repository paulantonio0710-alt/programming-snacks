target = int(input('Enter your target value: '))
status = False 
for d_1 in range(1, 10):
    for d_2 in range (1, 10):
        for d_3 in range(1, 10):
            total = d_1 + d_2 + d_3
            if(total == target):
                print(f'{d_1} + {d_2} + {d_3} = {target}.')
                status = True
        
if( not status):
    print(f'No 3 distinct integers between 1 - 9 could sum up {target}.')
