package com.javademo.controller;

import com.javademo.domain.Story;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String stories(Model model, Locale locale) {
        //title címének átírása:
        model.addAttribute("pageTitle", "Valami valami");
        model.addAttribute("stories", getStories());
        System.out.println(String.format("Request received. Language: %s, Contury: %s %n", locale.getLanguage(), locale.getDisplayCountry()));
        return "stories";
    }

    @RequestMapping("/user/{id}")
    public String searchForUser(@PathVariable(value="id") String id) throws Exception {
        if (id == null)
            throw new Exception("Nincs ilyen ID-val felhasználó.");
        return "user";
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(HttpServletRequest ra, Exception ex, Model model) {
        model.addAttribute(("errMEssage"), ex.getMessage());
        return  null;
    }

    private ArrayList<Story> getStories() {
        ArrayList<Story> stories = new ArrayList<Story>();
        /*
        Story story1 = new Story();
        story1.setTitle("Első sztorim");
        story1.setPosted(new Date());
        story1.setAuthor("Peter");
        story1.setContent("<p>Na ez az adat már éles adat.</p>");

        Story story2 = new Story();
        story2.setTitle("Második sztorim");
        story2.setPosted(new Date());
        story2.setAuthor("Gyula");
        story2.setContent("<p>Gyula története senkit sem érdekel.</p>");

        stories.add(story1);
        stories.add(story2);
        */
        return stories;
    }

}