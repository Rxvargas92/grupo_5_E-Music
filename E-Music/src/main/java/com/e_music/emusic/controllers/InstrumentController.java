package com.e_music.emusic.controllers;

import com.e_music.emusic.entities.Instrument;
import com.e_music.emusic.services.ServiceCategory;
import com.e_music.emusic.services.ServiceInstrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.validation.Valid;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;

@Controller
public class InstrumentController {

    @Autowired
    private ServiceInstrument serviceInstrument;

    @Autowired
    private ServiceCategory serviceCategory;

    @GetMapping ( value = "/start" )
    public String start( Model model ) {
        try {
            List< Instrument > games = this.serviceInstrument.findAllByActive( );
            model.addAttribute( "games", games );
            return "views/start";
        } catch ( Exception e ) {
            model.addAttribute( "error", e.getMessage( ) );
            return "error";
        }
    }
}
