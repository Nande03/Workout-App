package com.example.a7minutesworkout

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(2, "Wall Sit", R.drawable.wall_sit, false, false
        )
        exerciseList.add(wallSit)

        val pushUp = ExerciseModel(3, "Push Up", R.drawable.push_up, false, false
        )
        exerciseList.add(pushUp)

        val abdominalCrunch = ExerciseModel(4, "Abdominal Crunch", R.drawable.abdominal_crunch, false, false
        )
        exerciseList.add(abdominalCrunch)

        val stepUpOnChair = ExerciseModel(5, "Wall Sit", R.drawable.step_ups, false, false
        )
        exerciseList.add(stepUpOnChair)

        val squat = ExerciseModel(6, "Squat", R.drawable.squat, false, false
        )
        exerciseList.add(squat)

        val tricepDipOnChair = ExerciseModel(7, "Wall Sit", R.drawable.tricep_dips_on_chair, false, false
        )
        exerciseList.add(tricepDipOnChair)

        val plank = ExerciseModel(8, "Plank", R.drawable.plank, false, false
        )
        exerciseList.add(plank)

        val highKnees = ExerciseModel(9, "High Knees", R.drawable.high_knees, false, false
        )
        exerciseList.add(highKnees)

        val lunges = ExerciseModel(10, "Lunges", R.drawable.lunges, false, false
        )
        exerciseList.add(lunges)

        val pushUpAndRotation = ExerciseModel(11, "Push up and rotation", R.drawable.push_up_and_rotation, false, false
        )
        exerciseList.add(pushUpAndRotation)

        val sidePlank = ExerciseModel(12, "Side Plank", R.drawable.side_plank, false, false
        )
        exerciseList.add(sidePlank)

        return exerciseList
    }
}