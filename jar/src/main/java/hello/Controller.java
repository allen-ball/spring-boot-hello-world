package hello;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot {@link RestController}.  See
 * {@link.uri https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-controller target=newtab Annotated Controllers}.
 *
 * {@injected.fields}
 *
 * @author {@link.uri mailto:ball@hcf.dev Allen D. Ball}
 * @version $Revision$
 */
@RestController
@NoArgsConstructor @ToString @Log4j2
public class Controller {
    @Value("${greeting}")
    private String greeting;

    @RequestMapping({ "/hello" })
    public String handle() { return greeting; }
}
