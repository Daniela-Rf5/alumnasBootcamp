package org.factoriaf5.alumnas.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AlumnaRepository extends CrudRepository<Alumna, Long> {
}

