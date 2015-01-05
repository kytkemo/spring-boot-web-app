#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class BaseController {

    @RequestMapping(method = RequestMethod.GET, value = "*")
    public String catchAll() {

        return "Hello World!";
    }
}
