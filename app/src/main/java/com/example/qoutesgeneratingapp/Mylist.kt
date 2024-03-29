package com.example.qoutesgeneratingapp

import androidx.compose.runtime.Composable

data class Quote(val content: @Composable () -> Unit)
val quoteFunctions = listOf(
    Quote { Quotes("' Time is money,Dont waste your time. It is very precious things '") },
    Quote { Quotes(string = "The greatest glory in living lies not in never falling, but in rising every time we fall") },
    Quote { Quotes(string = "it is not always late to learn something, just start it now") },
    Quote { Quotes(string = "The way to get started is to wuit talking and begin doing") },
    Quote { Quotes(string = "The future belongs to those who believe in the beauty of their dreams.") },
    Quote { Quotes(string = "If you set your goals ridicalously high and it's a failure, you will fail above everyoe else's success") },
    Quote { Quotes(string = "You must be change you wish to see in the world.") },
    Quote { Quotes(string = "The only thing we have to fear is fear itself.") },
    Quote { Quotes(string = "Spread love everywhere you go. let no one ever come to you without leaving happpier.") },
    Quote { Quotes(string = "Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: onlu love can do that. ") },
    Quote { Quotes(string = "Do one thing every day that scares you.") },
    Quote { Quotes(string = "Well don is better than well said") },
    Quote { Quotes(string = "The best and most beautiful things in the world cannot be seen or even touched, they must be felt with the heart") },
    Quote { Quotes(string = "It is during our darkest moments that we must focus to see the light") },
    Quote { Quotes(string = "Do not go where the path may lead, go instead where there is no path and leave a trail.") },
    Quote { Quotes(string = "Be yourself ;everyone else is already taken") },
    Quote { Quotes(string = "Never let the fear of striking out keep you from playing the game") },
    Quote { Quotes(string = "In this life we cannot do great things. We can only do small things with great love") },
    Quote { Quotes(string = "You have brains in your head. You have feet in your shoes.You can steer yourself any direction you choose") },
    Quote { Quotes(string = "If life were predictable it would cease to be life and be without flavor") },
    Quote { Quotes(string = "In the end, it's not the years in your life that count. It's the life in your years ") },
    Quote { Quotes(string = "Life is a succession of lessons which must be lived to be understood ") },
    Quote { Quotes(string = "You will face many deteats in life, but never let yourself be defeated.") },
    Quote { Quotes(string = "The only impossible journey is the one you never begin") },
    Quote { Quotes(string = "Only a life lived for others is a life worthwhile") },
    Quote { Quotes(string = "The purpose of our lives is to be happy") },
    Quote { Quotes(string = "You only live once, but if you do it right, once is enough.") },
    Quote { Quotes(string = "The greatest glory in living lies not in never falling, but in rising every time we fall.") },
    Quote { Quotes(string = "Life is really simple, but we insist on making if complicated.") },
    Quote { Quotes(string = "May you live all the days of your life.") },
    Quote { Quotes(string = "Life itself is the most wonderful fairy tale.") },
    Quote { Quotes(string = "Do not let making a living prevent you from ") },
    Quote { Quotes(string = "Go confidently in the direction of your dreams! Live the life you're imagined") },
    Quote { Quotes(string = "Life is either a daring adventure or nothing") },
    Quote { Quotes(string = "Life is a long lesson in humility") },
    Quote { Quotes(string = "In three words i can sum up everything I've learned about life: it goes on.") },
    Quote { Quotes(string = "You have brains in your head. You have feet in your shoes. You can steer youself any direction you choose.") },
    Quote { Quotes(string = "Life is made of ever so many partings welded together.") },
    Quote { Quotes(string = "Life is trying things to see if they work.") },
    Quote { Quotes(string = "Keep smiling, because life is a beautiful thing and there's so much to smile about") },
    Quote { Quotes(string = "In the depth of winter, i fnally learned that within me there lay an invincible summer. ") },
    Quote { Quotes(string = "In three words i can sum up everything I've learned about life: it goes on.") },
    Quote { Quotes(string = "So we beat on, boats anainst the current, borne back ceaselessly into the past.") },
    Quote { Quotes(string = "Life is either a dariing adventure or nothing.") },

)