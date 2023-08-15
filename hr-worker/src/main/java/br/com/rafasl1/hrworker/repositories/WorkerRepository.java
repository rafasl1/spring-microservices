package br.com.rafasl1.hrworker.repositories;


import br.com.rafasl1.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
