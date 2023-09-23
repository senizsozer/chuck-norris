package com.springfamework.chucknorris.services;

import org.springframework.stereotype.Service;

@Service
public class SenizJoke implements  JokeService{
    @Override
    public String getJoke() {
        return "Seniz sakasi";
    }
}
