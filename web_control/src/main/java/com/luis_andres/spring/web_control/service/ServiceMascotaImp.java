package com.luis_andres.spring.web_control.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.luis_andres.spring.web_control.model.Mascota;
import com.luis_andres.spring.web_control.repository.RepositoryMascota;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServiceMascotaImp implements ServiceMascota {

    private final RepositoryMascota repositoryMascota;
    
    @Override
    public List<Mascota> listarMascotasService() {
        return repositoryMascota.findAll();
    }

    @Override
    public Mascota encontrarMascotaService(Long id) {
        return repositoryMascota.findById(id).get();
    }

    @Override
    public Mascota crearMascotaService(Mascota mascota) { 
        return repositoryMascota.save(mascota);
    }

    @Override
    public Mascota actualizarMascotaService(Long id, Mascota mascota) {
        Mascota mBDD = repositoryMascota.findById(id).get();
        mBDD.setAnimal(mascota.getAnimal());
        mBDD.setNumeroCollar(mascota.getNumeroCollar());
        return repositoryMascota.save(mBDD);
    }

    @Override
    public void eliminarMascotaService(Long id) {
        repositoryMascota.deleteById(id);
    }
    
}
