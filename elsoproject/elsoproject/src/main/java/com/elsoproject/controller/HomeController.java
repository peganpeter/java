package com.elsoproject.controller;

import com.elsoproject.domain.Story;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String stories(Model model) {
        //title címének átírása:
        model.addAttribute("pageTitle", "Valami valami");
        model.addAttribute("stories", getStories());
        return "index";
    }

    private ArrayList<Story> getStories() {
        ArrayList<Story> stories = new ArrayList<Story>();

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

        return stories;
    }

}
