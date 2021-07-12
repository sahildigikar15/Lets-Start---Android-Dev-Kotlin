package com.example.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz_question.*

class QuizQuestionActivity : AppCompatActivity() , View.OnClickListener{

    private var mCurrentPosition:Int = 1
    private var mQuestionsList: ArrayList<Question>?= null
    private var mSelectedOptionPosition: Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        mQuestionsList = Constants.getQuestions()
        setQuestion()
        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)



    }

    private fun setQuestion(){

        mCurrentPosition = 1
        val question = mQuestionsList!![mCurrentPosition-1]
        defaultOptionView()
        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max
        tv_question.text = question!!.question
        iv_image.setImageResource(question.Image)

        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optiontwo
        tv_option_three.text = question.optionthree
        tv_option_four.text = question.optionfour

    }

    private fun defaultOptionView()
    {
        var options = ArrayList<TextView>()
        options.add(0,tv_option_one)
        options.add(1,tv_option_two)
        options.add(2,tv_option_three)
        options.add(3,tv_option_four)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
             option.background = ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)

        }


    }

    override fun onClick(v: View?) {
       when(v?.id){
           R.id.tv_option_one ->{
               selectedOptionView(tv_option_one,1)
           }
           R.id.tv_option_two ->{
               selectedOptionView(tv_option_two,2)
           }
           R.id.tv_option_three ->{
               selectedOptionView(tv_option_three,3)
           }
           R.id.tv_option_four ->{
               selectedOptionView(tv_option_four,4)
           }
       }
    }
    private fun selectedOptionView(textView: TextView, SelectedOptionNum:Int)
    {
        defaultOptionView()
        mSelectedOptionPosition = SelectedOptionNum
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface,Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg)


    }
}