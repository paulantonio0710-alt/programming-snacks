text = input('Enter a word: ')
reverse = ''
for letter in text:
    reverse = letter + reverse
print(f'{text} is a palindrome') if(reverse == text) else print(f'{text} is not a palindrome')
