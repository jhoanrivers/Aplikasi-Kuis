package com.company.jhoanrivers.belajarbahasainggris;


public class QuestionLibrary {
    private String mQuestions [] = {
            "How is it going?",

            "Ana : Do you want some chocolate?\n" + "Aida: ….",

            "The followings belong to fable, except. ‘",

            "Telecomunication technology used to transfer copies (facsimiles) of document.”\n" +
                    "What is the meaning of transfer? ",

            "Tylor: Why does your father like living in the countryside?\n" +
                    "Eva: Because it is… living in the city.",

            "Budi beats Hoyer-Larsen of Denmark at the Sanyo Indonesia Open Badminton Championships because he played … than Hoyer- Larsen",

            "Andy: Do you like pizza?\n" +
                    "Wiliam: No I don’t. How about you?\n" +
                    "Andy: ….",

            " Zack: …\n" +
                    "Smith: Neither can I.",

            "Harry: I have never been to Bali. How about you?\n" +
                    "James: …",

            "Jack: Do you know about the most famous sport in the world?\n" +
                    "Bob : Yes. That is Olympic games.\n" +
                    "Jack: Yeah. I… with you."

    };

    private String mchoices [] [] = {
            {"Great! Couldn’t be better!","Fine. How are things with you?","I can't complain","Thank you"},
            {"I know","I'm okay","Yes Please","I'm busy now"},
            {"The grasshopper and the Ant","Cinderella","Incridible Man","Batman"},
            {"Mengirim","Membuat", "Menggandakan","Mencetak"},
            {"Quite","The quites","Quiter than","As quitest"},
            {"Carefully","As carefully","More carefully","The most carefully"},
            {"I don't either","Neither don't I","I don't too","So do I"},
            {"I can't operate a computer","I like to write a letter","I don't think he can do that","I am not going to go"},
            {"I have too","I haven't too","So have I","Neither have I"},
            {"Sure","Certain","Agree","Disagree"}

    };

    private String mCorrect [] ={
            "Great! Couldn’t be better!","Yes Please","The grasshopper and the Ant","Mengirim","Quiter than","More carefully","I don't either","I can't operate a computer","Neither have I","Agree"
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mchoices [a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice2 = mchoices [a][1];
        return choice2;
    }
    public String getChoice3(int a){
        String choice3 = mchoices [a][2];
        return choice3;
    }
    public String getChoice4(int a){
        String choice4 = mchoices [a][3];
        return choice4;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrect [a];
        return answer;
    }
    public int getLength(){
        return mQuestions.length;
    }


}
