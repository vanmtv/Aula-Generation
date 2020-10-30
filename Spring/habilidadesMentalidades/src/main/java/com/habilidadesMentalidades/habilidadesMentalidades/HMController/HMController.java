package com.habilidadesMentalidades.habilidadesMentalidades.HMController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades-mentalidades")
public class HMController {

	@GetMapping
	public String habment() {
		return "Habilidades: persistência, atenção aos detalhes e proatividade.\nMentalidades: mentalidade de crescimento e orientação ao futuro";
	}
}
