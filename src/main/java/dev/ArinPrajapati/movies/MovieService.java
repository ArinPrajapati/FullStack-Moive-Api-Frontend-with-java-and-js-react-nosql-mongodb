package dev.ArinPrajapati.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MoiveRepository moiveRepository;

    public List<moive> allMoives(){
        return moiveRepository.findAll();
    }
}
