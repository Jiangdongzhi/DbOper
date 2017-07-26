package aspect;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dorianns on 15/5/24.
 */
public class KnightProg {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
//        Knight sampleKnight = (Knight) ctx.getBean("sampleKnight");
        Chess sampleKnight = (Chess) ctx.getBean("sampleKnight");
        sampleKnight.draw(1,1);

        System.out.println("please help to find out my best practise for this project.");

        try {
            System.out.println("mJ8N7of8jr");
            System.out.println("25-20-16-12-9-6-4-2-1");
            System.out.println((25+20+16+12+9+6+4+2+1)*5288);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
