package com.upgrad.theatre.services;

import com.upgrad.theatre.entities.Theatre;

public interface TheatreService {
    Theatre getTheatreDetails(int theatreId, int movieId);
}
