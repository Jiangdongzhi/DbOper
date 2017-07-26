package velocity;

import java.io.StringWriter;

import java.util.Properties;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.Template;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.MethodInvocationException;

/**
 * Created by dorianns on 15/11/28.
 */
public class HelloWorld {

    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("file.resource.loader.path", "src/main/resources");
        Velocity.init(p);
        VelocityContext context = new VelocityContext();
        context.put("name", new String("Velocity"));
        context.put("project", new String("Dorian"));
        Template template = null;
        try {
            template = Velocity.getTemplate("velocity/helloworld.vm");
        } catch (ResourceNotFoundException rnfe) {
            rnfe.printStackTrace();
        } catch (ParseErrorException pee) {
            pee.printStackTrace();
        } catch (MethodInvocationException mie) {
            mie.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringWriter sw = new StringWriter();
        template.merge(context, sw);
        System.out.println(sw.toString());
    }
}
