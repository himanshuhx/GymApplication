package com.first75494.gymapplication;

import java.util.ArrayList;

public class Utils {
    private static ArrayList<Training> trainings;
    public static void initTrainings(){
        if(null == trainings){
            trainings=new ArrayList<>();
        }
        Training pushup=new Training(1,"Push up","A push-up is a common calisthenics exercise beginning from the prone position.",
               "Proper Pushup Technique Begin with your arms extended and all your weight on your hands and toes with your feet flexed. Your torso and thighs should create a straight line. Engage your core, glutes and quadriceps to maintain this straight-body position as you bend your elbows to lower your body toward the floor.",
                "https://www.shutterstock.com/image-photo/picture-young-athletic-man-doing-push-461264842");
        trainings.add(pushup);
        Training squat=new Training(2,"Squats","A squat is a strength exercise in which the trainee lowers their hips from a standing position and then stands back up",
                "The Squat is a lower body exercise. You can do the bodyweight version, without added resistance (also called Bodyweight Squat or Air Squat), or with weights such as a barbell (Front Squat and Back Squat are variations of the Barbell Squat) The Squat exercise mainly targets the thighs (quadriceps & hamstrings) and the glutes. ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQQmEvFiHDDRQ6kOL4CHp6C-5Ne7eNOD6NBdiFyuVZVw3oNOYXM&usqp=CAU");
        trainings.add(squat);
    }

    public static ArrayList<Training> getTrainings() {
        return trainings;
    }
}
