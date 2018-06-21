public class App {

    public static void main(String[] args) {
        //common
        Medic medic1 = new Medic();
        Medic medic2 = new Medic();
        Medic medic3 = new Medic();

        medic1.health--; // Static field
        medic2.health--; // Static field
        medic3.health--; // Static field
        System.out.println("Static fields:");
        System.out.printf( "Medic-1 -> %d\n", medic1.health );
        System.out.printf( "Medic-2 -> %d\n", medic2.health ); // результат будет общий, тк hp - static
        System.out.printf( "Medic-3 -> %d\n", medic3.health );

        // в реале правильнее обращаться статическим переменным таким образом: Medic.health
        //т.к. переменная health она одна для всех реализаций класса Medic
        System.out.printf("Health for all Medics - %d\n\n", Medic.health);

        System.out.println("Non static & Static fields:");
        Medic med_plr1 = new Medic();
        Medic med_plr2 = new Medic();
        Medic med_plr3 = new Medic();

        //med_player1.score -= 8; // Static field можно и так записать, но...
        Medic.score -= 8; // - правильная запись для Ststic полей
        med_plr1.health_personal -= 40; // Non Static field
        med_plr2.health_personal = 10; // Non Static field
        med_plr3.health_personal = 30; // Non Static field

        med_plr2.name = "Serg";
        med_plr3.name = "Antn";

        System.out.println( "1 Player -> Name: " + med_plr1.name + "; Health: " + med_plr1.health_personal + "; Score -> " + med_plr1.score );
        System.out.println( "2 Player -> Name: " + med_plr2.name + "; Health: " + med_plr2.health_personal + "; Score -> " + med_plr2.score );
        System.out.println( "3 Player -> Name: " + med_plr3.name + "; Health: " + med_plr3.health_personal + "; Score -> " + med_plr3.score );


    }
}
