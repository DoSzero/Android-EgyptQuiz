package com.example.egyptquiz

object Constants{

    //const val USER_NAME: String = "user_name"
    // const val TOTAL_QUESTIONS: String = "total_questions"
    //const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Как в Древнем Египте называли служителей богов?",
            R.drawable.egyptian_ancient,
            "Фараоны", "Жрецы",
            "священники", "рабы", 2
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Для чего строились пирамиды?",
            R.drawable.pyramids,
            "для красоты", "для хорошего обзора окрестностей",
            "для защиты от врагов", " для погребения фараонов",
            4
        )
        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Как египтяне называли своего главного бога?",
            R.drawable.royalty,
            "Тутанхамон", "Осирис",
            "Амон-Ра", "Птах", 3
        )
        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Почему почва в Египте всегда оставалась плодородной?",
            R.drawable.egyptian_ancient,
             "Египтяне применяли минеральные удобрения",
             "Земля удобрялась после разливов Нила",
             "Египтяне молились богу плодородия",
             "Местное население каждый раз сеяло на новом месте", 2
        )
        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Куда, согласно вере древних египтян, человек отправлялся после смерти?",
            R.drawable.tombpharaoh,
            " в рай", "в ад",
            " в Царство Мертвых", "в подземное царство Аида", 4
        )
        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Кто такой Сфинкс?",
            R.drawable.istockphoto,
            "один из египетских фараонов",
            "мифическое животное с телом льва и головой человека",
            "чудовище с головой крокодила и задними ногами бегемота",
            "бог солнца", 2
        )
        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Кто в Древнем Египте имел право заходить в храмы?",
            R.drawable.egyptian_ancient,
            "только жрецы", "только фараоны",
            "только жрецы и фараоны", "все желающие", 2
        )
        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "На чем писали египтяне?",
            R.drawable.egyptian_ancient,
            "на пергаменте", "на деревянных дощечках",
            "на восковых дощечках", "на папирусе", 4
        )
        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Почему разливался Нил?",
            R.drawable.egyptian_ancient,
            "В Египте был сезон обильных дождей",
            "Большая вода приходила из притоков Нила",
            "В реку заходила вода из Средиземного моря",
            "Наводнения были проявлением воли могущественных богов",
            1
        )
        questionsList.add(que9)
        // 10
        val que10 = Question(
            10, "Чем египтяне расписывали стены храмов и гробниц?",
            R.drawable.egyptian_ancient,
            "фресками", "разноцветными камнями",
            "граффити", "иероглифами", 3
        )
        questionsList.add(que10)

    /*
        // 11
        val que11 = Question(
            11, "Зачем египтяне бальзамировали тела мертвых?",
            R.drawable.egyptian_ancient,
            "чтобы душа умершего продолжала существовать в теле",
            "для медицинских опытов",
            "чтобы умилостивить богов",
            "для воскрешения в будущем", 4
        )
        questionsList.add(que11)
        // 12
        val que12 = Question(
            12, "Почему Египет было непросто завоевать?",
            R.drawable.egyptian_ancient,
            "Для этого нужно было форсировать много рек",
            "Египтяне построили укрепления на границе",
            "У фараонов было секретное оружие",
            "Для этого нужно было пересечь пустыню", 4
        )
        questionsList.add(que12)
        // 13
        val que13 = Question(
            13, "Какие цвета присутствовали на короне правителя объединенного Египта?",
            R.drawable.egyptian_ancient,
            "Синий и красный", "Красный и белый",
            "Красный и жёлтый", "Красный", 2
        )
        questionsList.add(que13)
        // 14
        val que14 = Question(
            14, "Что из перечисленного изобрели древние египтяне?",
            R.drawable.egyptian_ancient,
            " Бумагу", "Порох",
            "Колесницы", "Ветряные мельницы", 1
        )
        questionsList.add(que14)
        // 15
        val que15 = Question(
            15, "Как древние египтяне путешествовали и перевозили грузы?",
            R.drawable.egyptian_ancient,
            " В лодках", "На верблюдах",
            "На лошадях", "На велосипедах", 2
        )
        questionsList.add(que15)
        // 16
        val que16 = Question(
            16, "Какой город был столицей древнего Египта?",
            R.drawable.egyptian_ancient,
            "Рим", "Мемфис",
            "Вавилон", "Иерусалим", 3
        )
        questionsList.add(que16)
        // 17
        val que17 = Question(
            17, "Зачем в гробницы фараонов клали оружие, утварь, сокровища?",
            R.drawable.egyptian_ancient,
            "Это были подарки богу загробного мира",
            "Для комфортной жизни фараона после смерти",
            "граффити", "иероглифами", 2
        )
        questionsList.add(que17)

        // 18
        val que18 = Question(
            18, "На берегу какой реки располагался Древний Египет?",
            R.drawable.egyptian_ancient,
            "Нил", "Нева",
            "Днепр", "Рейн", 1
        )
        questionsList.add(que18)
        // 19
        val que19 = Question(
            19, "Что такое орошение полей?",
            R.drawable.egyptian_ancient,
            "Вспахивание полей", "Полив полей",
            "Засев полей", "Засуха", 2
        )
        questionsList.add(que19)
        // 20
        val que20 = Question(
            20, "Какая из этих характеристик относится к климату Древнего Египта?",
            R.drawable.egyptian_ancient,
            "Проливные дожди", "Засушливость",
            "Снегопады", "Тропики", 2
        )
        questionsList.add(que20)
     */
        return questionsList
    }
}