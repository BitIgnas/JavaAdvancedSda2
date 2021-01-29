package Inheritance.Example1.Example1;

//base/super/parent class
public class Singer {

    //If private, field cannot be inherited
    protected int yearsOfexperience = 5;

    protected void singCommonSong(){
        System.out.println("Singing popular song");
    }
    public void singLikeCicinas(){
        System.out.println("Singing like Cicinas");
    }

    public void singCommonSongAgain(){
        System.out.println("Sing Lithuanian national anthem");
    }
}
