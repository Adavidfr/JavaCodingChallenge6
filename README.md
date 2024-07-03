# Hangman Game Challenge

## Description
This challenge involves creating a console-based Hangman game in Java. The game allows a user to guess a word letter by letter before a hangman drawing is completed.

## Requirements

1. **Game Initialization**:
    - The game should select a random word from a predefined list of words.
    - The game should display the hidden word with underscores representing the letters not yet guessed.


2. **Guessing Letters**:
    - The user can input a letter to guess.
    - If the letter is in the word, it should be revealed in all corresponding positions.
    - If the letter is not in the word, a part should be added to the hangman drawing.



3. **Attempt Counter**:
    - The game should count and display the number of incorrect attempts.
    - The game ends when the user guesses all the letters in the word or completes the hangman drawing (maximum of 6 incorrect attempts).



4. **Display Game State**:
    - After each guess, the game should display the current state of the word and the number of incorrect attempts.



5. **Game End**:
    - The game should indicate whether the user won or lost at the end.