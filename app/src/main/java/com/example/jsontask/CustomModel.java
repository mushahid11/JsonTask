package com.example.jsontask;

public class CustomModel {

    private String name;
   private String english;
   private String urdu;
   private String maths;
   private String chemistry;
   private String physics;
   private String biology;

    public CustomModel(String name, String english, String urdu, String maths, String chemistry, String physics, String biology) {
        this.name = name;
        this.english = english;
        this.urdu = urdu;
        this.maths = maths;
        this.chemistry = chemistry;
        this.physics = physics;
        this.biology = biology;
    }

    public String getName() {
        return name;
    }

    public String getEnglish() {
        return english;
    }

    public String getUrdu() {
        return urdu;
    }

    public String getMaths() {
        return maths;
    }

    public String getChemistry() {
        return chemistry;
    }

    public String getPhysics() {
        return physics;
    }

    public String getBiology() {
        return biology;
    }
}
