package by.thedrop.newmath.Constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import by.thedrop.newmath.Chapters.Advices;
import by.thedrop.newmath.Chapters.Algebra;
import by.thedrop.newmath.Chapters.AnswersEgeCT;
import by.thedrop.newmath.Chapters.AreaOfSurface;
import by.thedrop.newmath.Chapters.AreaPlaneFigures;
import by.thedrop.newmath.Chapters.HelpAuthor;
import by.thedrop.newmath.Chapters.Integrals;
import by.thedrop.newmath.Chapters.Perimeter;
import by.thedrop.newmath.Chapters.RadiusCircumscribedCircle;
import by.thedrop.newmath.Chapters.RadiusInscribedCircle;
import by.thedrop.newmath.Chapters.Triangle;
import by.thedrop.newmath.Chapters.Trigonometry;
import by.thedrop.newmath.Chapters.TypicalProblems;
import by.thedrop.newmath.Chapters.Volume;
import by.thedrop.newmath.R;
import by.thedrop.newmath.Templates.BasicChapter;
import by.thedrop.newmath.Templates.MainActivityTemplate;
import by.thedrop.newmath.Templates.SublistTemplate;

import static by.thedrop.newmath.R.string.*;

/**
 * Created by Semen on 16-Nov-16.
 */

public class Constants {

    public static final String CHAPTER_INTENT_FLAG = "CHAPTER";

    public static ArrayList<MainActivityTemplate> chapters = new ArrayList<>();
    public static HashMap<Integer, BasicChapter> chaptersMap = new HashMap<>();

    public static void initializeChapters() {
        MainActivityTemplate helpAuthor = new MainActivityTemplate(R.string.help_author, R.drawable.signingcontract);
        MainActivityTemplate advices = new MainActivityTemplate(R.string.advices, R.drawable.premiumbadge);
        MainActivityTemplate answersEgeCT = new MainActivityTemplate(R.string.answersEgeCT, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate typicalProblems = new MainActivityTemplate(R.string.typicalProblems, R.drawable.brackets);
        MainActivityTemplate perimeter = new MainActivityTemplate(R.string.perimeter, R.drawable.pencil);
        MainActivityTemplate areaPlaneFigures = new MainActivityTemplate(R.string.areaPlaneFigures, R.drawable.prev_atomickernelphysics);
        MainActivityTemplate areaOfSurface = new MainActivityTemplate(R.string.areaOfSurface, R.drawable.cube);
        MainActivityTemplate volume = new MainActivityTemplate(R.string.volume, R.drawable.cone);
        MainActivityTemplate triangle = new MainActivityTemplate(R.string.triangle, R.drawable.pyramid);
        MainActivityTemplate radiusInscribedCircle = new MainActivityTemplate(R.string.radiusInscribedCircle, R.drawable.panel);
        MainActivityTemplate radiusCircumscribedCircle = new MainActivityTemplate(R.string.radiusCircumscribedCircle, R.drawable.panel);
        MainActivityTemplate trigonometry = new MainActivityTemplate(R.string.trigonometry, R.drawable.protractor);
        MainActivityTemplate algebra = new MainActivityTemplate(R.string.algebra, R.drawable.compass);
        MainActivityTemplate integrals = new MainActivityTemplate(R.string.integrals, R.drawable.function);
        MainActivityTemplate usefulResources = new MainActivityTemplate(R.string.usefulResources, R.drawable.notebook);

        chapters.add(helpAuthor);
        chapters.add(advices);
        chapters.add(answersEgeCT);
        chapters.add(typicalProblems);
        chapters.add(perimeter);
        chapters.add(areaPlaneFigures);
        chapters.add(areaOfSurface);
        chapters.add(volume);
        chapters.add(triangle);
        chapters.add(radiusInscribedCircle);
        chapters.add(radiusCircumscribedCircle);
        chapters.add(trigonometry);
        chapters.add(algebra);
        chapters.add(integrals);
        chapters.add(usefulResources);
    }


    public static List<SublistTemplate> mHelpAuthor = new ArrayList<>();
    public static List<SublistTemplate> mAdvices = new ArrayList<>();
    public static List<SublistTemplate> mAnswersEgeCT = new ArrayList<>();
    public static List<SublistTemplate> mTypicalProblems = new ArrayList<>();
    public static List<SublistTemplate> mPerimeter = new ArrayList<>();
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
        mHelpAuthor = asList(help_author_watch_ad, help_author_left_feedback, help_author_join_group, help_author_tell_friends);
        mAdvices = asList(advices_guess_answer, advices_week_until_exam, advices_better_way_to_prepare, advices_prepare_on_100, advices_time_using, advices_day_before, advices_in_test, advices_answers_from_teacher, advices_how_to_learn_trigonometry, advices_the_best_way_to_prerare, advices_not_miss_the_answer, advices_you_will_pass);
        mAnswersEgeCT = asList(answersEgeCT_ege2015demo, answersEgeCT_gia2015, answersEgeCT_rt20162, answersEgeCT_rt20163, answersEgeCT_ct2011, answersEgeCT_ct2012, answersEgeCT_ct2013, answersEgeCT_ct2014, answersEgeCT_ct2015);
        mTypicalProblems = asList(typicalProblems_planimetry, typicalProblems_stereometry, typicalProblems_trig_equations, typicalProblems_equations_in_problems, typicalProblems_answers);
        mPerimeter = asList(perimeter_triangle, perimeter_square, perimeter_rectangle, perimeter_parallelogram, perimeter_rhombus, perimeter_circumference, perimeter_trapeze, perimeter_arc_length);
        mAreaPlaneFigures = asList(areaPlaneFigures_square, areaPlaneFigures_circle, areaPlaneFigures_rectangle, areaPlaneFigures_right_triangle, areaPlaneFigures_isosceles_triangle, areaPlaneFigures_equilateral_triangle, areaPlaneFigures_triangle, areaPlaneFigures_triangle_2sides_angle, areaPlaneFigures_triangle_side_2angle, areaPlaneFigures_geron_formula, areaPlaneFigures_rhombus, areaPlaneFigures_parallelogram, areaPlaneFigures_trapeze, areaPlaneFigures_regular_polygon, areaPlaneFigures_ring, areaPlaneFigures_ellipce, areaPlaneFigures_ring_sector, areaPlaneFigures_circle_sector);
        mAreaOfSurface = asList(areaOfSurface_cube, areaOfSurface_cylinder, areaOfSurface_sphere, areaOfSurface_cuboid, areaOfSurface_regular_pyramid, areaOfSurface_frustum, areaOfSurface_cone, areaOfSurface_conoid, areaOfSurface_sphere_segment, areaOfSurface_sphere_sector, areaOfSurface_sphere_layer);
        mVolume = asList(volume_cube, volume_cuboid, volume_tetrahedron, volume_pyramid, volume_regular_pyramid, volume_regular_triangular_pyramid, volume_regular_square_pyramid, volume_cone, volume_frustrum, volume_conoid);
        mTriangle = asList(triangle_side_triangle, triangle_side_isosceles_triangle, triangle_side_equilateral_triangle, triangle_height, triangle_right_triangle, triangle_height_median_biss_isosceles_triangle, triangle_all_equals_equilateral_triangle, triangle_bissectriss_triangle, triangle_bissectriss_right_triangle, triangle_median_triangle, triangle_median_right_triangle);
        mRadiusInscribedCircle = asList(radiusInscribedCircle_triangle, radiusInscribedCircle_right_triangle, radiusInscribedCircle_triangle, radiusInscribedCircle_isosceles_triangle, radiusInscribedCircle_square, radiusInscribedCircle_regular_polygon, radiusInscribedCircle_rhombus, radiusInscribedCircle_trapeze, radiusInscribedCircle_hexagon);
        mRadiusCircumscribedCircle = asList(radiusCircumscribedCircle_triangle, radiusCircumscribedCircle_right_triangle, radiusCircumscribedCircle_equilateral_triangle, radiusCircumscribedCircle_isosceles_triangle, radiusCircumscribedCircle_square, radiusCircumscribedCircle_regular_hexagon, radiusCircumscribedCircle_regular_polygon, radiusCircumscribedCircle_rectangle, radiusCircumscribedCircle_equilateral_trapeze);
        mTrigonometry = asList(trigonometry_values_common_angles, trigonometry_summ_trigonom_functions, trigonometry_difference_trigonom_functions, trigonometry_multiplication_trigonom_functions, trigonometry_formulas_summ_angles, trigonometry_formulas_diff_angles, trigonometry_formulas_half_angle, trigonometry_formulas_triple_angle, trigonometry_reduction_formulas, trigonometry_squared_function, trigonometry_cubed_function);
        mAlgebra = asList(algebra_viett_teorem, algebra_arithmetic_progression, algebra_geometric_progression, algebra_tangent_equation, algebra_logarithm_properties, algebra_parabola_vertex_coordinates, abridgedMultiplication);
        mIntegrals = asList(integrals_derivative, integrals_primitive, integrals_integrals, integrals_equivalence, integrals_indefinite_integral);


        chaptersMap.put(R.string.help_author, new HelpAuthor());
        chaptersMap.put(R.string.advices, new Advices());
        chaptersMap.put(R.string.answersEgeCT, new AnswersEgeCT());
        chaptersMap.put(R.string.typicalProblems, new TypicalProblems());
        chaptersMap.put(R.string.perimeter, new Perimeter());
        chaptersMap.put(R.string.areaPlaneFigures, new AreaPlaneFigures());
        chaptersMap.put(R.string.areaOfSurface, new AreaOfSurface());
        chaptersMap.put(R.string.volume, new Volume());
        chaptersMap.put(R.string.triangle, new Triangle());
        chaptersMap.put(R.string.radiusInscribedCircle, new RadiusInscribedCircle());
        chaptersMap.put(R.string.radiusCircumscribedCircle, new RadiusCircumscribedCircle());
        chaptersMap.put(R.string.trigonometry, new Trigonometry());
        chaptersMap.put(R.string.algebra, new Algebra());
        chaptersMap.put(R.string.integrals, new Integrals());
        //chaptersMap.put(R.string.usefulResources, new UsefulResources());
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
