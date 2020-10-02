package spring.start.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
@Service
public class NewJokeServiceImpl implements NewJokeService {
    @Override
    public String sayNewJoke() {
        ChuckNorrisQuotes obj = new ChuckNorrisQuotes();
        return obj.getRandomQuote();
    }
}
