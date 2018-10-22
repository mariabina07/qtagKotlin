package com.qtag.bina.binaqtag

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val orQuestions = arrayOf(
            "Diamonds or pearls?",
            "Drugstore makeup or designer?",
            "Blow-dry or air-dry?",
            "Pilates or yoga?",
            "Coffee or tea?",
            "Dark chocolate or milk chocolate?",
            "Stairs or elevator?",
            "Summer or winter?",
            "Beach or Mountain?",
            "Cook or clean up?",
            "Long hair or short hair?",
            "Warm drink or cold drink?",
            "Dolphins or koalas?",
            "Window or aisle seat (airplane seat)?",
            "Heels or flats/sneakers?",
            "Vintage or new?",
            "Lipstick or lip gloss?",
            "Sweet or savory?",
            "Hugs or kisses?",
            "Jogging or swimming?",
            "Teacher or Student?",
            "iPhone or Android?",
            "Twitter or Instagram?",
            "To be or not to be? ( “to act or not to act,” to exist (live) or not to exist (die),” " +
                    " “to confront or to let be.” )",
            "Dogs or cats?",
            "Bird-watching or whale-watching?",
            "Scary film or happy endings?",
            "Rolling Stones or the Beatles?",
            "Cook or bake?",
            "Ask or answer?",
            "Glasses or contact lenses?",
            "City or village?",
            "Downtown or Uptown?",
            "Mall or park?"
    )

    val favouriteQuestions = arrayOf(
            "Favorite smell?",
            "What’s your favorite board game?",
            "What’s your favorite color?",
            "Least favorite color?",
            "Favorite place to view art?",
            "Favorite piece of clothing you own?",
            "What’s your favorite time of day?",
            "Favorite app?",
            "Favorite season?",
            "Favorite sound?",
            "Favorite animal?",
            "Favorite bedtime story?",
            "Favorite artist/figure?",
            "What’s your favorite flower?",
            "What’s your favorite country to visit?",
            "What’s your favorite movie?",
            "Favorite movie in the past five years?",
            "Favorite TV show that’s currently on?",
            "What’s your favorite food?",
            "Least favorite food?",
            "Favorite drink?",
            "Favorite dessert?",
            "What’s your favorite band?",
            "Favorite solo artist?",
            "Favorite song?",
            "What is your least favorite thing about yourself?",
            "What is your most favorite thing about yourself?"
    )

    val todayQuestions = arrayOf(
            "Best thing to happen to you today?",
            "Worst thing to happen to you today?",
            "Your affirmation for today?"
    )

    val noThinkQuestions = arrayOf(
            "Hair color?",
            "Eye color?"
    )

    val lastQuestion = arrayOf(
            "Last gift you gave a friend?",
            "What’s the last place you visited?",
            "When was the last time you cried?",
            "Who was the last person you talked to on the phone?",
            "Who was the last person you sent a text to?",
            "Last piece of content you consumed that made you cry?",
            "Last photograph you took?"
    )

    val growthQuestions = arrayOf(
            "What would you think about yourself if you were not worried about being judged?",
            "What would you really do if you didn’t worry about opinions or judgement?",
            "re you using your time wisely?",
            "If you were to die tomorrow, what would you regret the most?",
            "What habit do you wish you could get rid of?",
            "What are the three words that define how you treat other people?",
            "What fears are holding you back?",
            "Are you a bad person?",
            "Are you insane? Insanity…\n" +
                    "Doing the same thing repeatedly while expecting different results every time.",
            "Are you in control of your life? " +
                    "Are you the one who is steering your story or is someone else at the helm?"
    )

    val deepQuestions = arrayOf(
            "When was the last time you told myself “I love you”?",
            "When was the last time you say “Thank you”?",
            "Are you a better person today, than you were yesterday?",
            "Are your actions guided by love, or by fear?",
            "Are you a good example for those around you?",
            "Is the life that you are living the life you want to be living?",
            "What would you do with your life if you knew there were no limits?",
            "Do the people you surround myself with add any value to your life ",
            "Are you a Human Being or a human Doing?",
            "Are you following the crowd or are you listening to your own heart and intuition?",
            "What would you do differently if you knew nobody would judge you?",
            "Do you treat yourself with the love and respect you truly deserve?",
            "Why are you so uncomfortable with talking to people you don’t know?",
            "What is one thing you could start doing today to improve the quality of your life?",
            "When was the last time you told myself “you are enough“?",
            "When was the last time you heard the words “you love you”?",
            "When was the last time you did something nice for myself?",
            "When was the last time you learned something new?",
            "When was the last time you did something fun?",
            "are you a happy person?",
            "are you a source of inspiration for your friends and family?",
            "Who inspires you the most in this world?",
            "If you were to give one piece of advice to a newborn child, what would it be?",
            "Are you holding onto something you need to let go of? ",
            "Is there someone who has hurt or angered me that you need to forgive?",
            "What can you do today to live a better life tomorrow?",
            "When was the last time you read a book that had a major influence on you?",
            "When was the last time you said “I love you” to someone?",
            "When was the last time you made a new friend?",
            "Does your presence add value to those around you?",
            "Are you a pleasant person to be around?",
            "What parts of your life don’t reflect who you are?",
            "What has your heart and intuition been telling me that you might be ignoring?",
            "Are you on the right path?",
            "Where are you not being honest with myself and why?",
            "Who is that one person you can talk to about just anything?",
            "Are you comfortable with being uncomfortable?",
            "Do you enjoy your own company?",
            "Can I be alone without feeling lonely?",
            "What is one thing you love the most about yourself?",
            "Do you take things personally?",
            "What makes you happy?",
            "What do you think about when you're alone?",
            "What are you most passionate about?",
            "Where will you go after you die and what’s going to happen to you?",
            "Who are the people that believe in you?",
            "What do you want to be remembered for?",
            "If you were to die tomorrow, would any of this matter?",
            "If you could live anywhere in the world, where would I live?",
            "Do you love myself as much as you expect others to love you?",
            "What are you most thankful for?"
    )

    val questionsVogue = arrayOf(
        "On a scale of 1-10, how excited are you about life right now?",
        "Describe yourself in a hashtag?",
        "If you could do a love scene with anyone, who would it be?",
        "If your life was a musical, what would the marquee say?",
        "What’s one thing people don’t know about you?",
        "What’s your wakeup ritual?",
        "What’s your go to bed ritual?",
        "What is one thing no one knows about you?",
        "Dream country to visit?",
        "What’s the biggest surprise you’ve had?",
        "Who do you want to write your obituary?",
        "Style icon?",
        "What are three things you can’t live without?",
        "What’s one ingredient you put in everything?",
        "What 3 people would you like to make dinner for?",
        "What’s your biggest fear in life?",
        "What’s your current TV obsession?",
        "Secret talent?",
        "Most adventurous thing you’ve done in your life?",
        "How would you define yourself in three words?",
        "Must have clothing item everyone should have?",
        "Superpower you would want?",
        "What’s inspiring you in life right now?",
        "Best piece of advice you’ve received?",
        "Best advice you’d give your teenage self?",
        "A book that everyone should read?",
        "What would you like to be remembered for?",
        "How do you define beauty?",
        "What do you love most about your body?",
        "Best way to take a rest/decompress?",
        "If your life were a song, what would the title be?",
        "If you could master one instrument, what would it be?",
        "If you had a tattoo, where would it be?",
        "What’s your spirit animal?",
        "Best gift you’ve ever received?",
        "Best gift you’ve ever give?",
        "What’s the weirdest word in the English language?",
        "You are stuck on an island, " +
                "you can pick one food to eat forever without getting tired of it, what would you eat?",
        "A desert you don’t like?",
        "A skill you’re working on mastering?",
        "Best compliment you’ve ever received?",
        "If you made a documentary, what would it be about?",
        "Girl crush?",
        "How you know you’re in love?",
        "Song you can listen to on repeat?",
        "If you could switch lives with someone for a day who would it be?",
        "What are you most excited about at this time in your life?",
        "Your go to for having a good laugh?"
    )

//    val randomTag = Array(orQuestions.size,{i -> (randomQuestionIndex())})

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val questionDescTextView = findViewById<TextView>(R.id.question_desc);
        fab.setOnClickListener {
            questionDescTextView.setText(orQuestions[startRandomQuestion(orQuestions.size)])
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun startRandomQuestion(size: Int): Int {
        return Random().nextInt(size)
    }
}
