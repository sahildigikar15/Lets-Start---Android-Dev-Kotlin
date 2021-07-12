package com.example.quizapp

object Constants{
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,"Argentina",
            "Australia","Austria","India",1)
        questionsList.add(que1)

        val que2 = Question(2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,"Argentina",
            "Australia","Austria","India",4)
        questionsList.add(que2)

        val que3 = Question(3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,"Argentina",
            "Australia","Austria","India",2)
        questionsList.add(que3)

        val que4 = Question(4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,"Argentina",
            "Belgium","Austria","India",2)
        questionsList.add(que4)

        val que5 = Question(5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,"Argentina",
            "Australia","Austria","Brazil",4)
        questionsList.add(que5)

        val que6 = Question(6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,"Argentina",
            "Australia","Austria","Denmark",4)
        questionsList.add(que6)

        val que7 = Question(7,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,"Argentina",
            "Australia","Austria","Germany",4)
        questionsList.add(que7)

        val que8 = Question(8,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,"Fiji",
            "Australia","Austria","India",1)
        questionsList.add(que8)

        val que9 = Question(9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,"Kuwait",
            "Australia","Austria","India",1)
        questionsList.add(que9)

        val que10 = Question(10,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,"Argentina",
            "Australia","New Zealand","India",3)
        questionsList.add(que10)


        return questionsList
    }
}