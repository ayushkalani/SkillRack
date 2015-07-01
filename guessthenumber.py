# template for "Guess the number" mini-project
# input will come from buttons and an input field
# all output for the game will be printed in the console

import simplegui
import random
import math


range = 100
scrt = 0
user_guess = 0
guess = 7

# helper function to start and restart the game
def new_game():
    
    global scrt, range, guess
    scrt = random.randrange(0, range)
    
    
    if range == 100:
        guess = 7
    elif range == 1000:
        guess = 10
    else:
        print "Choose a range from [0,100] or [0,1000] only"
    
    
    print ""
    print "New game started with a range from 0 to " + str(range)
    print "Guess Remaining with you " + str(guess) 


def dec_guess():
    global guess
    guess = guess - 1
    if guess > 0:
        print "Remaining guesses: " + str(guess)
    else:
        print "Sorry, you lose! The number was " + str(scrt)
        new_game()


def range100():
   
    global range
    range = 100
    new_game()

def range1000():
    
    global range
    range = 1000
    new_game()
    
def input_guess(guess):
    
    global scrt, user_guess
    user_guess = int(guess)
    print ""
    if user_guess == scrt:
        print "Your guess was " + str(user_guess)
        print "You win!"
        new_game()
    elif user_guess > scrt:
        print "Your guess was " + str(user_guess)
        print "Lower!"
    elif user_guess < scrt:
        print "Your guess was " + str(user_guess)
        print "Higher!"
    else:
        print " error "
    dec_guess()
    
# create frame
f = simplegui.create_frame("Guess the number", 220, 220)


# register event handlers for control elements
f.add_button('Range [0, 100]', range100, 200)
f.add_button('Range [0, 1000]', range1000, 200)
f.add_input('Enter guess', input_guess, 50)

# call new_game and start frame
new_game()
f.start()
