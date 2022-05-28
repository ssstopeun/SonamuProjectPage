package com.example.SonamuProject.controller;

import com.example.SonamuProject.dto.SourceCode;
import com.example.SonamuProject.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TranslateController {

    private final TranslateService translateService;

    @Autowired
    public TranslateController(TranslateService translateService) {
        this.translateService = translateService;
    }

    @PostMapping("/translate")
    public String translate(Model model, SourceCode sourceCode) {
        String output = translateService.translate(sourceCode);
        model.addAttribute("source", sourceCode.getCode());
        model.addAttribute("sourceType", sourceCode.getTypeOfCode());
        model.addAttribute("target", output);

        return "index";

    }
}
