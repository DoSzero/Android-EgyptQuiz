package com.example.egyptquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()
        // Test in Logcat
        Log.i("How many questions ??","${questionsList.size}")


        // Ours Questions start ID 1 = index 0
        val currentPosition = 1
        val question: Question? = questionsList[currentPosition -1]

        progressBar.progress = currentPosition
        // max = 10
        tv_progress.text = "$currentPosition"+"/"+progressBar.max

        // Question.kt   1) val question: String 2) others
        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        // R.id = quest option
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }
}