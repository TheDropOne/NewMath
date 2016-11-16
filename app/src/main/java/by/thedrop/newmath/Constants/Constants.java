package by.thedrop.newmath.Constants;

import java.util.ArrayList;

import by.thedrop.newmath.Templates.MainActivityTemplate;
import by.thedrop.newmath.R;

/**
 * Created by Semen on 16-Nov-16.
 */

public class Constants {
    public static ArrayList<MainActivityTemplate> chapters = new ArrayList<>();

    public static void initializeChapters() {
        MainActivityTemplate helpAuthor = new MainActivityTemplate(R.string.help_author, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate advices = new MainActivityTemplate(R.string.advices, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate answersEgeCT = new MainActivityTemplate(R.string.answersEgeCT, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate typicalTasks = new MainActivityTemplate(R.string.typicalTasks, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate perimetr = new MainActivityTemplate(R.string.perimetr, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate areaPlaneFigures = new MainActivityTemplate(R.string.areaPlaneFigures, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate areaOfSurface = new MainActivityTemplate(R.string.areaOfSurface, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate volume = new MainActivityTemplate(R.string.volume, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate triangle = new MainActivityTemplate(R.string.triangle, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate radiusInscribedCircle = new MainActivityTemplate(R.string.radiusInscribedCircle, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate radiusCircumscribedCircle = new MainActivityTemplate(R.string.radiusCircumscribedCircle, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate trigonometry = new MainActivityTemplate(R.string.trigonometry, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate abridgedMultiplication = new MainActivityTemplate(R.string.abridgedMultiplication, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate algebra = new MainActivityTemplate(R.string.algebra, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate integrals = new MainActivityTemplate(R.string.integrals, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate usefulResources = new MainActivityTemplate(R.string.usefulResources, R.drawable.prev_atomickernelphysics);

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
}
