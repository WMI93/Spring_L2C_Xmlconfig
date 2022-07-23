package  com.wmi.springL2CXMLConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("begin injection");
        ClassPathXmlApplicationContext  cnx=new ClassPathXmlApplicationContext("applicationContext.xml");

        // implementation par Setter
        coash theCoashBySetter=cnx.getBean("myImplCoach",coash.class);

        // implementation par Constractor
        coash theCoashByConstactor=cnx.getBean("myImplCoach2",coash.class);
        System.out.println("-----implementation By Constructor--------------");
        System.out.println("==> "+theCoashByConstactor.getCoashWorkOut());
        System.out.println("==> "+theCoashByConstactor.getFortuneByXMLInjection());

        System.out.println("-----get Attribute form Property file--------------");
        System.out.println("==> "+((ImplCoach2)theCoashByConstactor).getEmailAddressProperty());
        System.out.println("==> "+((ImplCoach2)theCoashByConstactor).getTeamProperty());

        System.out.println("-----implementation By Setter--------------");
        System.out.println("==> "+theCoashBySetter.getCoashWorkOut());
        System.out.println("==> "+theCoashBySetter.getFortuneByXMLInjection());
    }
}