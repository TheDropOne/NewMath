package by.thedrop.newmath.Constants;

import java.util.ArrayList;

import by.thedrop.newmath.Templates.MainActivityTemplate;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.SublistTemplate;

/**
 * Created by Semen on 16-Nov-16.
 */

public class Constants {

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


    public static ArrayList<SublistTemplate> mHelpAuthor = new ArrayList<>();
    public static ArrayList<SublistTemplate> mAdvices = new ArrayList<>();
    public static ArrayList<SublistTemplate> mAnswersEgeCT = new ArrayList<>();
    public static ArrayList<SublistTemplate> mTypicalTasks = new ArrayList<>();
    public static ArrayList<SublistTemplate> mPerimetr = new ArrayList<>();
    public static ArrayList<SublistTemplate> mAreaPlaneFigures = new ArrayList<>();
    public static ArrayList<SublistTemplate> mAreaOfSurface = new ArrayList<>();
    public static ArrayList<SublistTemplate> mVolume = new ArrayList<>();
    public static ArrayList<SublistTemplate> mTriangle = new ArrayList<>();
    public static ArrayList<SublistTemplate> mRadiusInscribedCircle = new ArrayList<>();
    public static ArrayList<SublistTemplate> mRadiusCircumscribedCircle = new ArrayList<>();
    public static ArrayList<SublistTemplate> mTrigonometry = new ArrayList<>();
    public static ArrayList<SublistTemplate> mAlgebra = new ArrayList<>();
    public static ArrayList<SublistTemplate> mIntegrals = new ArrayList<>();
    //public static ArrayList<SublistTemplate> mUsefulResources = new ArrayList<>();

    public static void initializeSubChapters() {

    }
}
