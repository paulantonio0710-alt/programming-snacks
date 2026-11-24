text = input('Enter your word: ')
vowel_count = 0
consonant_count = 0
vowels = ''
consonants = ''
for letter in (text):
    if(letter in 'aeiou' and letter not in vowels):
        vowel_count += 1
        vowels += letter
    elif(letter in 'aeiou' and letter in vowels):
        continue
    else:
        if(letter not in consonants):
            consonant_count += 1
            consonants += letter
            
print(f'vowel count is {vowel_count}.')
print(f'consonant count is {consonant_count}.')
