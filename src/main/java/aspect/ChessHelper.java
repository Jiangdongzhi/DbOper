package aspect;

/**
 * Created by dorianns on 15/5/24.
 */
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class ChessHelper {

    public ChessHelper(){

    }

//    @Pointcut("execution(* *.draw())")
    public void drawpoint(){}

//    @Before("drawpoint()")
    public void beforeDraw(){
        System.out.println("Before drawing a chess!");
    }

//    @AfterReturning("drawpoint()")
    public void afterDraw(){
        System.out.println("Finish drawing a chess!");
    }

}
