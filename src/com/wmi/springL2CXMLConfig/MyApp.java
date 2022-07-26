package  com.wmi.springL2CXMLConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("begin injection");
        ClassPathXmlApplicationContext  cnx=new ClassPathXmlApplicationContext("applicationContext.xml");




        System.out.println("-----implementation By Constructor--------------");
        // implementation par Constructor
        coash theCoashByConstactor=cnx.getBean("myImplCoach2",coash.class);
        coash theCoashByConstactor2=cnx.getBean("myImplCoach2",coash.class);
        System.out.println("==> "+theCoashByConstactor.getCoashWorkOut());
        System.out.println("==> "+theCoashByConstactor.getFortuneByXMLInjection());

        System.out.println("-----get Attribute form Property file--------------");
        System.out.println("==> "+((ImplCoach2)theCoashByConstactor).getEmailAddressProperty());
        System.out.println("==> "+((ImplCoach2)theCoashByConstactor).getTeamProperty());

        boolean result2 =theCoashByConstactor==theCoashByConstactor2;

        System.out.println("==> the memory of theCoashByConstactor 1"+theCoashByConstactor);
        System.out.println("==> the memory of theCoashByConstactor 2"+theCoashByConstactor2);

        System.out.println("==> the result between  theCoashByConstactor 1 & 2 \t "+ result2);
        System.out.println("-----implementation By Setter--------------");
        // implementation par Setter
        coash theCoashBySetter=cnx.getBean("myImplCoach",coash.class);
        System.out.println("==> "+theCoashBySetter.getCoashWorkOut());
        System.out.println("==> "+theCoashBySetter.getFortuneByXMLInjection());
    }
}
