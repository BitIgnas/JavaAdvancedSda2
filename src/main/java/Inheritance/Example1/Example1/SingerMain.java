package Inheritance.Example1.Example1;

public class SingerMain {
    public static void main(String[] args) {
        Singer singer = new Singer();
        System.out.println(singer.yearsOfexperience);
        singer.singCommonSong();

        Cicinas cicinas = new Cicinas();
        cicinas.singCommonSong();
        System.out.println(singer.yearsOfexperience);
        System.out.println(cicinas.isSmiling());

        cicinas.singLikeCicinas();

        Radzi radzi = new Radzi();
        radzi.singLikeRadzi();
        System.out.println(radzi.yearsOfexperience);

    }
}
