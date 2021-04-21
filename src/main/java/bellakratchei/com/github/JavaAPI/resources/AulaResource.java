package bellakratchei.com.github.JavaAPI.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bellakratchei.com.github.JavaAPI.models.Aula;
import bellakratchei.com.github.JavaAPI.repositorys.AulaRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/aulas")
public class AulaResource {

	@Autowired
	AulaRepository aulaRepository;
	
	@GetMapping
	public List<Aula> show(){
		return aulaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Aula showOne(@PathVariable(value="id") long id) {
		return aulaRepository.findById(id);
	}
	
	@PostMapping
	public Aula create(@RequestBody @Validated Aula aula) {
		return aulaRepository.save(aula);
	}
	
	@PutMapping
	public Aula update(@RequestBody @Validated Aula aula) {
		return aulaRepository.save(aula);
	}
	
	@DeleteMapping
	public void delete(@RequestBody @Validated Aula aula) {
		aulaRepository.delete(aula);
	}
}
