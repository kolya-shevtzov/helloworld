public class Main {
    public static void main(String[] args) {
        byte x= 1;
        System.out.println(x);
        short y= 10000;
        System.out.println(y);
        int i=1000000000;
        System.out.println(i);
        long r= 1000000000;
        System.out.println(r);
        float e= 1.5F;
        System.out.println(e);
        double d= 2.555;
        System.out.println(d);
        byte box= 67;
        System.out.println(box);
        short box2= -159;
        System.out.println(box2);
        short box3= 569;
        System.out.println(box3);
        int box4= 27897;
        System.out.println(box4);
        long box5 = 987678965549L;
        System.out.println(box5);
        float box6= 27.12F;
        System.out.println(box6);
        double box7=2.786F;
        System.out.println(box7);
        byte teacher1=23;
        System.out.println(teacher1);
        byte teacher2=27;
        System.out.println(teacher2);
        byte teacher3=30;
        System.out.println(teacher3);
        short AllPaper=480;
        System.out.println(AllPaper);
        int AllChildren= teacher1+teacher2+teacher3;
        System.out.println(AllChildren);
        int PaperFor1Children=AllPaper/AllChildren;
        System.out.println("На каждого ученика рассчитано "+ PaperFor1Children+" листов бумаги");
        byte Minutes2= 16;
        System.out.println("за 2 минуты машина производит "+ Minutes2 +" штук бутылок");
        int Minutes20= Minutes2*10;
        System.out.println("за 20 минуты машина производит "+ Minutes20 +" штук бутылок");
        int hour=Minutes20*3;
        System.out.println("за час машина производит "+ hour +" штук бутылок");
        int day=hour*24;
        System.out.println("за день машина производит "+ day +" штук бутылок");
        int day3= day*3;
        System.out.println("за 3 дня машина производит "+ day3 +" штук бутылок");
        long mounth=day*30;
        System.out.println("за месяц машина производит "+ mounth +" штук бутылок");
        byte JarAll= 120;
        System.out.println(JarAll);
        byte BrownJarForClass=4;
        System.out.println(BrownJarForClass);
        byte WhiteJarForClass=2;
        System.out.println(WhiteJarForClass);
        int WhiteAndBrownJarForClass=WhiteJarForClass+BrownJarForClass;
        System.out.println(WhiteAndBrownJarForClass);
        int ClassAll=JarAll/WhiteAndBrownJarForClass;
        System.out.println(ClassAll);
                int AllBrownJar=ClassAll*BrownJarForClass;
        System.out.println(AllBrownJar);
        int AllWhiteJar=ClassAll*WhiteJarForClass;
        System.out.println(AllWhiteJar);
        System.out.println("В школе, где "+ ClassAll+" классов, нужно "+ AllWhiteJar+ " банок белой краски и "+AllBrownJar+ " банок коричневой краски");
        int bananas= 5*80;
        System.out.println(bananas);
        double milk=200*1.05;
        System.out.println(milk);
        int icecream= 2*100;
        System.out.println(icecream);
        int eggs= 4*70;
        System.out.println(eggs);
        double AllWeight=bananas+milk+icecream+eggs;
        System.out.println("вес такого спортзавтрака в граммах равен " +AllWeight);
        double AllWeightKG=AllWeight*0.001;
        System.out.println("вес такого спортзавтрака в килограмах равен "+ AllWeightKG);
        int NeedToResetKG=7*1000;
        System.out.println(NeedToResetKG);
        int loses=250;
        System.out.println(loses);
        int loses2=500;
        System.out.println(loses2);
        int DayReset=NeedToResetKG/loses;
        System.out.println("чтобы сбросить 7 кг спортсмену понадобится "+ DayReset+ " дней если он будет терять по 250 грам в день");
        int DayReset2=NeedToResetKG/loses2;
        System.out.println("чтобы сбросить 7 кг спортсмену понадобится "+ DayReset2+ " дней если он будет терять по 500 грам в день");
        int Mary= 67760;
        System.out.println(Mary);
        int Denis=83690;
        System.out.println(Denis);
        int Christina=76230;
        System.out.println(Christina);
        int MaryPercent10=Mary/100*10;
        System.out.println(MaryPercent10);
        int DenisPercent10=Denis/100*10;
        System.out.println(DenisPercent10);
        int ChristinaPercent10= Christina/100*10;
        System.out.println(ChristinaPercent10);
        int MaryNextYears=Mary+MaryPercent10;
        System.out.println("Маша теперь получает "+ MaryNextYears+" рублей. Годовой доход вырос на "+MaryPercent10 +" рублей");
        int DenisNextYears= Denis+ DenisPercent10;
        System.out.println ("Денис теперь получает "+ DenisNextYears+ " рублей. Годовой доход вырос на "+ DenisPercent10+ " рублей");
        int ChristinaNextYear= Christina+ChristinaPercent10;
        System.out.println("Кристина теперь получает "+ ChristinaNextYear+" рублей. Годовой доход вырос на "+ ChristinaPercent10+ " рублей");
    }
}