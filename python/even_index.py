word = input('Enter a word: ')
count = 0
index = ''
for letters in word:
    count += 1
    if(count % 2 == 0):
        index += letters + '\t'
        
print(index)
    
