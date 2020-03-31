# Искусственный интелект Python

import speech_recognition as sr
import os
import sys
import webbrowser
import pyttsx3
import pyaudio

def talk(words):
    engine = pyttsx3.init()
    engine.say(words)
    engine.runAndWait()

talk("Hi there! Ask me something!")

def command():
    r = sr.Recognizer()

    # Получить запись из микрофона
    with sr.Microphone() as source:
        print('Talk: ')
        r.pause_threshold = 1 # Дать паузу
        r.adjust_for_ambient_noise(source, duration=1) # Не слушать шум на заднем плане
        audio = r.listen(source) # Записать то, что было сказано
        print('Got it!')
    # Получили запись из микрофона
    
    talk('Understood.')

    try:
        task = r.recognize_google(audio).lower() # Russian: task = r.recognize_google(audio, language='ru-RU').lower()
        print('You said: ' + task)

    # Если сказал что-то непонятно или ничего не сказал
    except sr.UnknownValueError:
        talk('I don\'t understand you')
        task = command()
    
    return task

def makeSomething(task):
    if 'open website' in task:
        talk('Wait a minute.')
        url = 'https://ficbook.net/'
        webbrowser.open(url)
        talk('Open ficbook.')
        sys.exit()
    elif 'stop' in task:
        talk('Of course, no problems.')
        sys.exit()
    elif 'name' in task:
        talk('My name is Vasja.')
        sys.exit() # Остановить программу
    else:
        print('Stoped!')
        sys.exit()


makeSomething(command())

