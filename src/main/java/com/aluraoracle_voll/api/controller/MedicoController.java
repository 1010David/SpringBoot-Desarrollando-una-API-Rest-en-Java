package com.aluraoracle_voll.api.controller;

import com.aluraoracle_voll.api.medico.DatosRegistroMedico;
import com.aluraoracle_voll.api.medico.Medico;
import com.aluraoracle_voll.api.medico.MedicoRepository;
import com.aluraoracle_voll.api.medico.DatosListadoMedicos;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico) {
        medicoRepository.save(new Medico(datosRegistroMedico));
    }

    @GetMapping
    public Page<DatosListadoMedicos> listadoMedicos(@PageableDefault(size = 2) Pageable paginacion) {
        return medicoRepository.findAll(paginacion).map(DatosListadoMedicos::new);
    }

}
