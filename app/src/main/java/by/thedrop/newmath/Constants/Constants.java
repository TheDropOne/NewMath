package by.thedrop.newmath.Constants;

import java.util.ArrayList;
import java.util.List;

import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.MainActivityTemplate;
import by.thedrop.newmath.Templates.SublistTemplate;

/**
 * Created by Semen on 16-Nov-16.
 */

public class Constants {

    public static final String CHAPTER_INTENT_FLAG = "CHAPTER";

    public static ArrayList<MainActivityTemplate> chapters = new ArrayList<>();

    public static void initializeChapters() {
        MainActivityTemplate helpAuthor = new MainActivityTemplate(R.string.help_author, R.drawable.signingcontract);
        MainActivityTemplate advices = new MainActivityTemplate(R.string.advices, R.drawable.premiumbadge);
        MainActivityTemplate answersEgeCT = new MainActivityTemplate(R.string.answersEgeCT, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate typicalTasks = new MainActivityTemplate(R.string.typicalTasks, R.drawable.brackets);
        MainActivityTemplate perimetr = new MainActivityTemplate(R.string.perimetr, R.drawable.pencil);
        MainActivityTemplate areaPlaneFigures = new MainActivityTemplate(R.string.areaPlaneFigures, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate areaOfSurface = new MainActivityTemplate(R.string.areaOfSurface, R.drawable.cube);
        MainActivityTemplate volume = new MainActivityTemplate(R.string.volume, R.drawable.cone);
        MainActivityTemplate triangle = new MainActivityTemplate(R.string.triangle, R.drawable.pyramid);
        MainActivityTemplate radiusInscribedCircle = new MainActivityTemplate(R.string.radiusInscribedCircle, R.drawable.panel);
        MainActivityTemplate radiusCircumscribedCircle = new MainActivityTemplate(R.string.radiusCircumscribedCircle, R.drawable.panel);
        MainActivityTemplate trigonometry = new MainActivityTemplate(R.string.trigonometry, R.drawable.protractor);
        MainActivityTemplate abridgedMultiplication = new MainActivityTemplate(R.string.abridgedMultiplication, R.drawable.equation);
        MainActivityTemplate algebra = new MainActivityTemplate(R.string.algebra, R.drawable.compass);
        MainActivityTemplate integrals = new MainActivityTemplate(R.string.integrals, R.drawable.function);
        MainActivityTemplate usefulResources = new MainActivityTemplate(R.string.usefulResources, R.drawable.notebook);

        chapters.add(helpAuthor);
        chapters.add(advices);
        chapters.add(answersEgeCT);
        chapters.add(typicalTasks);
        chapters.add(perimetr);
        chapters.add(areaPlaneFigures);
        chapters.add(areaOfSurface);
        chapters.add(volume);
        chapters.add(triangle);
        chapters.add(radiusInscribedCircle);
        chapters.add(radiusCircumscribedCircle);
        chapters.add(trigonometry);
        chapters.add(abridgedMultiplication);
        chapters.add(algebra);
        chapters.add(integrals);
        chapters.add(usefulResources);
    }


    public static List<SublistTemplate> mHelpAuthor = new ArrayList<>();
    public static List<SublistTemplate> mAdvices = new ArrayList<>();
    public static List<SublistTemplate> mAnswersEgeCT = new ArrayList<>();
    public static List<SublistTemplate> mTypicalTasks = new ArrayList<>();
    public static List<SublistTemplate> mPerimetr = new ArrayList<>();
    public static List<SublistTemplate> mAreaPlaneFigures = new ArrayList<>();
    public static List<SublistTemplate> mAreaOfSurface = new ArrayList<>();
    public static List<SublistTemplate> mVolume = new ArrayList<>();
    public static List<SublistTemplate> mTriangle = new ArrayList<>();
    public static List<SublistTemplate> mRadiusInscribedCircle = new ArrayList<>();
    public static List<SublistTemplate> mRadiusCircumscribedCircle = new ArrayList<>();
    public static List<SublistTemplate> mTrigonometry = new ArrayList<>();
    public static List<SublistTemplate> mAlgebra = new ArrayList<>();
    public static List<SublistTemplate> mIntegrals = new ArrayList<>();
    //public static ArrayList<SublistTemplate> mUsefulResources = new ArrayList<>();

    public static void initializeSubChapters() {
        //REWRITE WITH RESOURCES
        mHelpAuthor = asList("Посмотреть рекламу", "Написать хороший отзыв:)","Вступить в нашу группу вк","Рассказать друзьям!");
        mAdvices = asList("Помочь автору", "Угадываем правильный ответ", "До экзамена неделя, я ничего не знаю", "Как лучше готовиться?", "Настроиться на 100", "Использование времени", "За день до", "Во время теста","Советы на ЕГЭ от репетиторов", "Как учить тригонометрию?","Что самое главное?","Как не упустить ответ?" ,"Ты сдашь!");
        mAnswersEgeCT = asList("Ответы ЕГЭ 2015 демо-вариант","Ответы ГИА 2015","Ответы РТ 2 2016 вариант 1", "Ответы РТ 3 2016 вариант 1", "Решение ЦТ 2011 вариант 1", "Решение ЦТ 2012 вариант 3", "Решение ЦТ 2013 вариант 1", "Решение ЦТ 2014 вариант 1", "Решение ЦТ 2015 вариант 1");
        mTypicalTasks = asList("Помочь автору","Планиметрия", "Стереометрия", "Тригонометрические уравнения", "Уравнения в решении задач", "Ответы и решения");
        mPerimetr = asList("Треугольник", "Квадрат", "Прямоугольник", "Параллелограмм", "Ромб", "Длина окружности", "Трапеция", "Длина дуги");
        mAreaPlaneFigures = asList("Квадрат", "Круг", "Прямоугольник", "Прямоугольный треугольник", "Равноберенный треугольник", "Равносторонний треугольник", "Треугольник", "Треугольник(2 стороны и угол)", "Треугольник(сторона и 2 угла)", "Треугольник(Формула Герона)", "Ромб", "Параллелограмм", "Трапеция", "Правильный многоугольник", "Кольцо", "Эллипс", "Сектор кольца", "Сектор круга");
        mAreaOfSurface = asList("Куб", "Цилиндр", "Сфера", "Прямоугольный параллелепипед", "Правильная пирамида", "Правильная усеченная пирамида", "Конус", "Усеченный конус", "Шаровой сегмент", "Шаровой сектор", "Шаровой слой");
        mVolume = asList("Помочь автору","Куб", "Параллелепипед", "Тетраэдр", "Пирамида", "Правильная пирамида", "Правильная треугольная пирамида", "Правильная четырехугольная пирамида", "Конус", "Усеченная пирамида", "Усеченный конус");
        mTriangle = asList("Сторона произвольного треугольника", "Стороны равнобедренного треугольника", "Стороны прямоугольного треугольника", "Высота произвольного треугольника", "Высота прямоугольного треугольника", "Высота, медиана, биссектриса равнобедренного треугольника", "Высота=медиана=биссектриса равностороннего треугольника", "Биссектриса произвольного треугольника", "Биссектриса прямоугольного треугольника", "Медиана произвольного треугольника", "Медиана прямоугольного треугольника");
        mRadiusInscribedCircle = asList("Треугольник", "Прямоугольный треугольник", "Равносторонний треугольник", "Равнобедренный треугольник", "Квадрат", "Правильный многоугольник", "Ромб", "Трапеция", "Шестиугольник");
        mRadiusCircumscribedCircle = asList("Треугольник", "Прямоугольный треугольник", "Равносторонний треугольник", "Равнобедренный треугольник", "Квадрат", "Правильный шестиугольник", "Правильный многоугольник", "Прямоугольник", "Равнобедренная трапеция");
        mTrigonometry = asList("Значения популярных углов", "Сумма тригонометрических функций", "Разность тригонометрических функций", "Произведение тригонометрических функций", "Формулы суммы углов", "Формулы разности углов", "Формулы половинного угла", "Формулы тройного угла", "Формулы приведения", "Функция в квадрате", "Функция в кубе");
        mAlgebra = asList("Теорема Виета", "Арифметическая прогрессия", "Геометрическая прогрессия", "Уравнение касательной", "","","Свойства логарифма", "Координаты вершины параболы", "Показательные неравенства","Формулы сокращенного умножения");
        mIntegrals = asList("Производная", "Первообразная", "Интегралы", "Эквивалентности", "Неопределенный Интеграл");
    }

    private static List<SublistTemplate> asList(String... strings) {
        List<SublistTemplate> list = new ArrayList<>();
        for (String s : strings) {
            list.add(new SublistTemplate(s));
        }
        return list;
    }

    private static List<SublistTemplate> asList(Integer... integers) {
        List<SublistTemplate> list = new ArrayList<>();
        for (Integer i : integers) {
            list.add(new SublistTemplate(i));
        }
        return list;
    }
}
