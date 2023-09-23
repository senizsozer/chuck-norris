package com.springfamework.chucknorris.controller;

import com.springfamework.chucknorris.services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 12/24/19.
 */
@Controller
public class JokeController {

    @Qualifier("jokesServiceImpl")
    @Autowired
    public JokeService jokeService;

    public JokeController() {

    }

    @RequestMapping("/joke")
    public String getJokes(Model model){
        //ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        //String joke = quotes.getRandomQuote();
        String joke = jokeService.getJoke();

        System.out.println(joke);
        model.addAttribute("jokes",joke);
        return "jokes/index";
    }
}
