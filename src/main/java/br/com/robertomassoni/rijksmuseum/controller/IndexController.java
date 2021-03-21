package br.com.robertomassoni.rijksmuseum.controller;

import br.com.robertomassoni.rijksmuseum.model.Collection;
import br.com.robertomassoni.rijksmuseum.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private ArtService artService;

    @RequestMapping("/")
    public String index() {
        System.out.println("\nHome");

        return "index";
    }

    @RequestMapping("/search/{term}")
    public String index(Model model, @PathVariable String term) {
        System.out.println("\nHome");

        System.out.println("index/{term}");

//        term = "";
//        String term = "amsterdam";
        String involvedMaker = "";//Rembrandt+van+Rijn, Johannes+Vermeer
        String results = "50";
        String page = "1";
        String type = "painting"; //bust, painting
        String material = ""; //marble (rock), canvas, oil paint (paint), oak (wood), silver (metal), paper, cotton (textile)
        String technique = ""; //etching, gilding, painting
        String period = "";

        Collection collection = artService.getCollection(
                term,
                involvedMaker,
                results,
                page,
                type,
                material,
                technique,
                period);


        model.addAttribute("collection", collection);

        return "index";
    }

}
