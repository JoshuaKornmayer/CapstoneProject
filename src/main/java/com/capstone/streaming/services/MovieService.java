package com.capstone.streaming.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Value("${api_key}")
    private String apikey;

}