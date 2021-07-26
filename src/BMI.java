public class BMI {
    private String name;
    private double height;
    private double weight;
    private int age;
    private static final double KG_PER_LB = 0.453;
    private static final double M_PER_IN = 0.0254;

    public BMI(){
        name = "Sean";
        height = 60;
        age = 20;
        weight = 40;
    }



    public BMI(String name, double height, double weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }



    double getBMI(){
        double bmi = weight * KG_PER_LB/(height * M_PER_IN ) * (height * M_PER_IN);
        return Math.round(bmi*100)/100.0;
    }



    String getStatus(){
        if(getAge()<18.5){
            return "UnderWeighted";
        }
        else if(getBMI()<25){
            return "Normal";
        }
        else if(getBMI()<30){
            return "Overweight";
        }
        else
            return "Obese";
    }



    String getName(){
        return name;
    }

    double getHeight(){
        return height;
    }
    double getWeight(){
        return weight;
    }
    int getAge(){
        return age;
    }



}
