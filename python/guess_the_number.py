import random as randy
def random_number():
    random = randy.randrange(1, 1001)
    return random

number = random_number()
count = 0
guess = int(input('Guess my number between 1 and 1000 with the fewest guesses: '))
while guess != number:
    count += 1
    if guess < number:
        print('Too low. Try again.')
    elif guess > number:
        print('Too high. Try again.')
    guess = int(input('Guess my number between 1 and 1000 with the fewest guesses: '))
    

print("Congratulations! You guessed my number.")
if count <= 10:
    print(f'You made {count} guesses. \nEither you know the secrets or you got lucky!')
else:
    print(f'You made {count} guesses. \nYou should be able to do better!')
    

