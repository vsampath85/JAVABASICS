package com.sparta.mg;

//vani projects
public class App 
{
    public static void main( String[] args )
    {
        int timeofDay = 21;
       String welcomeMessage =  greeting(timeofDay);
        System.out.println(welcomeMessage);
    }

    public static String greeting(int timeofDay) {
        String message = "";
        if (timeofDay > 0 && timeofDay <= 12){
            message = "Good Morning";
        }else if (timeofDay > 12 && timeofDay <= 18){
            message = "Good Afternoon";
        } else if (timeofDay > 18 && timeofDay <= 20){
            message = "Good Evening";
        } else if (timeofDay > 20 && timeofDay < 24 ) {
            message = "Good Night";
        }else{
            message = "Not a valid time";
        }

        return message;
    }
}
