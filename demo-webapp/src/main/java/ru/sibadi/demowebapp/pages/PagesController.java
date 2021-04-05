package ru.sibadi.demowebapp.pages;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.sibadi.demowebapp.repository.PaymentRepository;
import ru.sibadi.demowebapp.repository.PersonRepository;

import java.util.Date;
import java.util.Random;

@Controller
public class PagesController {

    private final Random rnd = new Random();
    private final PersonRepository personRepository;
    private PaymentRepository paymentRepository;

    public PagesController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("persons", personRepository.findAllPersons());
        return "index";
    }

    @GetMapping("/person/{id}")
    public String personPage(
            @PathVariable("id") int id,
            Model model
    ) {
        model.addAttribute("person", personRepository.findPersonById(id));
        return "person";
    }

    @GetMapping("/{id}/payment")
    public String paymentPage(
            @PathVariable("id") int id,
            Model model
    ) {
        model.addAttribute("person", personRepository.findPersonById(id));
        return "person";
    }
}