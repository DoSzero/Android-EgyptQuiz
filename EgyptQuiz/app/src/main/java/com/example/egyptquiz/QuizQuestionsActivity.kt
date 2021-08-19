package com.example.egyptquiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionList:ArrayList<Question>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAnswers:Int = 0
    private var mUserName:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        // Need for ResultActivity
        mUserName = intent.getStringExtra(Constants.USER_NAME)

        mQuestionList = Constants.getQuestions()
        // Test in Logcat
        // Log.i("How many questions ??","${questionsList.size}")

        setQuestion()
        // OnClick Listener
        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    private fun setQuestion(){
        // Ours Questions start ID 1 = index 0  (this is fir testing )
        // mCurrentPosition = 1
        //val question = mQuestionList!!.get(mCurrentPosition-1)
        val question = mQuestionList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionList!!.size){
            btn_submit.text = "Finish"
        }else {
            btn_submit.text = "Submit"
        }

        progressBar.progress = mCurrentPosition
        // max = 10
        tv_progress.text = "$mCurrentPosition"+"/"+progressBar.max

        // Question.kt   1) val question: String 2) others
        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        // R.id = quest option
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0,tv_option_one)
        options.add(1,tv_option_two)
        options.add(2,tv_option_three)
        options.add(3,tv_option_four)

        // sign default user interface (Ui button)
       for (option in options){
           // this is default in activity_quiz_questions for TEXT
           option.setTextColor(Color.parseColor("#7A8089"))
           option.typeface = Typeface.DEFAULT
           option.background = ContextCompat.getDrawable(
               this,
               R.drawable.default_option_border_bg
           )
       }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one ->{
                selectedOptionView(tv_option_one,1)
            }
            R.id.tv_option_two ->{
                selectedOptionView(tv_option_one,2)
            }
            R.id.tv_option_three ->{
                selectedOptionView(tv_option_one,3)
            }
            R.id.tv_option_four ->{
                selectedOptionView(tv_option_one,4)
            }
            R.id.btn_submit ->{
             // to the next questions
                if (mSelectedOptionPosition == 0){
                    mCurrentPosition ++
                    // change
                    when {
                        mCurrentPosition <= mQuestionList!!.size ->{
                            setQuestion()
                        } else ->{
                            /*
                            Toast.makeText(this, "You have successfully completed Quiz",
                                Toast.LENGTH_LONG).show()
                                */
                            val intent = Intent(this,ResultActivity::class.java)
                            // this ours keys for displays parameters
                            intent.putExtra(Constants.USER_NAME,mUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS,mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionList!!.size)
                            startActivity(intent)
                        }
                    }
                }else {
                    // wrong answer
                    val question = mQuestionList?.get(mCurrentPosition - 1)
                    if (question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition,R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer,R.drawable.correct_option_border_bg)
                    // change btn subscribe to go to the next
                    if (mCurrentPosition == mQuestionList!!.size){
                        btn_submit.text = "FINIS"
                    } else {
                        btn_submit.text = "GO TO THE NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView (answer:Int , drawableView:Int) {
        when(answer){
            1->{
                tv_option_one.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            2->{
                tv_option_two.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3->{
                tv_option_three.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            4->{
                tv_option_four.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum:Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        // tv = TextView
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }
}